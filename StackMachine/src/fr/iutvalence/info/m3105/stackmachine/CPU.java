package fr.iutvalence.info.m3105.stackmachine;

public interface CPU 
{
//	public void wireToProgramMemory(Memory programMemory);
//
//	public void wireToExpStack(Stack expStack);
//
//	public void wireToCallStack(Stack callStack);
//
//	public void wireToIoSubsystem(IOconsole ioSystem);
//	
	public void clearStacks();
	
	public void setPC(int address);
	
	public void run();
}
