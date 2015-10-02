package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public class CPU
{

	public final static int HALT 	= 0x00;
	public final static int PUSH  	= 0x01;
	public final static int ADD 	= 0x02;
	public final static int SUB 	= 0x03;
	public final static int MUL 	= 0x04;
	public final static int DIV 	= 0x05;
	public final static int MOD 	= 0x06;
	public final static int NEG 	= 0x07;
	public final static int LT 		= 0x08;
	public final static int LE 		= 0x09;
	public final static int GT 		= 0x0A;
	public final static int GE 		= 0x0B;
	public final static int EQ 		= 0x0C;
	public final static int NE 		= 0x0D;
	public final static int IN 		= 0x0E;
	public final static int OUT 	= 0x0F;
	public final static int CALL 	= 0x10;
	public final static int RET		= 0x11;
	public final static int JP		= 0x12;
	public final static int JZ		= 0x13;
	public final static int DUP		= 0x14;
	public final static int POP		= 0x15;
	
	private IO ioSystem;
	private Memory programMemory;
	private Stack expStack;
	private Stack callStack;

	public void run()
	{
//		try
//		{
			while (true)
			{
				// TODO something is missing here...

				int opCode = programMemory.getStartAddress();
				// System.err.print("@" + this.programCounter + ": ");
				switch (opCode)
				{
					case HALT:
					{
						// System.err.println("HALT");
						this.ioSystem.displayProgramTermination();
						return;
					}
					case PUSH:
					{
						// TODO something is missing here...
						break;
					}
					case ADD:
					{
						// TODO something is missing here...
						break;
					}
					case SUB:
					{
						// TODO something is missing here...
						break;
					}
					case MUL:
					{
						// TODO something is missing here...
						break;
					}
					case DIV:
					{
						// TODO something is missing here...
						break;
					}
					case MOD:
					{
						// TODO something is missing here...
						break;
					}
					case NEG:
					{
						// TODO something is missing here...
						break;
					}
					case LT:
					{
						// TODO something is missing here...
						break;
					}
					case LE:
					{
						// TODO something is missing here...
						break;
					}
					case GT:
					{
						// TODO something is missing here...
						break;
					}
					case GE:
					{
						// TODO something is missing here...
						break;
					}
					case EQ:
					{
						// TODO something is missing here...
						break;
					}
					case NE:
					{
						// TODO something is missing here...
						break;
					}
					case IN:
					{
						// TODO something is missing here...
						break;
					}
					case OUT:
					{
						// TODO something is missing here...
						break;
					}
					case CALL:
					{
						// TODO something is missing here...
						break;
					}
					case RET:
					{
						// TODO something is missing here...
						break;
					}
					case JP:
					{
						// TODO something is missing here...
						break;
					}
					case JZ:
					{
						// TODO something is missing here...
						break;
					}
					case DUP:
					{
						// TODO something is missing here...
						break;
					}
					case POP:
					{
						// TODO something is missing here...
						break;
					}
					default:
					{
						// TODO something is missing here...
						return;
					}
				}
			}
//		}
//		catch (AddressOutOfBoundsException e)
//		{
//			// TODO something is missing here...
//		}
//		catch (IOException e)
//		{
//			// TODO something is missing here...
//		}
//		catch (StackOverflowException e)
//		{
//			// TODO something is missing here...
//		}
//		catch (StackUnderflowException e)
//		{
//			// TODO something is missing here...
//		}		
	}

	public void wireToProgramMemory(Memory programMemory) {
		this.programMemory = programMemory;		
	}

	public void wireToExpStack(Stack expStack) {
		this.expStack = expStack;	
		
	}

	public void wireToCallStack(Stack callStack) {
		this.callStack = callStack;	
		
	}

	public void wireToIoSubsystem(IO ioSystem) {
		// TODO Auto-generated method stub
		
	}

	public void clearStacks() {
		// TODO Auto-generated method stub
		
	}

	public void setPC(int address) {
		// TODO Auto-generated method stub
		
	}

	// TODO something is missing here...
}
