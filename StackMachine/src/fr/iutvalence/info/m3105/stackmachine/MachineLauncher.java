package fr.iutvalence.info.m3105.stackmachine;

import java.security.InvalidParameterException;

public class MachineLauncher
{

	public static void main(String[] args)
	{
		/*
		0x0: 		in	  		// read a value value from IO and push it to exp-stack
		0x1: 		call 0x5	// call the subroutine at @ of label named "fact"
		0x3: 		out			// pop a value from exp-stack and print it via IO
		0x4: 		halt		// stop the program
		0x5: (fact) dup			// dup the value on top of exp-stack 
		0x6: 		jz 0xb		// pop a value from exp-stack and jump if zero to @ of label named "end"
		0x8: 		call 0xf
		0xa:        ret			// return from subroutine call
		0xb: (end)	pop			// pop a value from exp-stack (and drop it)
		0xc:		push 1      // push a value (1) on exp-stack
		0xe			ret			
		0xf: (rec)	dup
		0x10		push 1
		0x12		sub			// pop 2 values from exp-stack, substract the first to the second, 
								// push result on exp-stack
		0x13		call 0x5
		0x15		mul			// pop 2 values from exp-stack, multiply them, 
								// push result on exp-stack
		0x16		ret
		*/
		Instruction[] instructions = 
				new Instruction[] 
				{
						new Instruction(CPU.IN, null),
						new Instruction(CPU.CALL, new int[] {0x5}),
						new Instruction(CPU.OUT, null),
						new Instruction(CPU.HALT, null),
						new Instruction(CPU.DUP, null),
						new Instruction(CPU.JZ, new int[] {0xb}),
						new Instruction(CPU.CALL, new int[] {0xf}),
						new Instruction(CPU.RET, null),
						new Instruction(CPU.POP, null),
						new Instruction(CPU.PUSH, new int[] {0x1}),
						new Instruction(CPU.RET, null),
						new Instruction(CPU.DUP, null),
						new Instruction(CPU.PUSH, new int[] {0x1}),
						new Instruction(CPU.SUB, null),
						new Instruction(CPU.CALL, new int[] {0x5}),
						new Instruction(CPU.MUL, null),
						new Instruction(CPU.RET, null)
				};
		Program program = new Program(instructions);
		
		Memory programMemory= null;
		Stack expStack = null;
		Stack callStack = null;

		try
		{
			programMemory = new Memory(0x00000000, 0x00000020);
			expStack = new Stack(16);
			callStack = new Stack(16);
		}
		 catch (InvalidParameterException e)
		{
			// Safely ignore this error, which is not one
		}
		
		IO ioSystem = new IO(System.in, System.out, System.err);
		CPU cpu = new CPU();		
		Machine machine = new Machine(cpu, programMemory, expStack, callStack, ioSystem );
		try
		{
			machine.loadProgram(program);
		}
		catch (AddressOutOfBoundsException e)
		{
			System.err.println("Program loading failure: program does not fit memory");
			System.exit(1);
		}
		machine.executeProgram(0x00000000);
	}
}