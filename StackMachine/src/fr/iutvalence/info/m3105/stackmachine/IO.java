package fr.iutvalence.info.m3105.stackmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public interface IO {
	

	public void displayRuntimeError(String string);
	
	public void displayProgramTermination();

	public int read() throws IOException;

	public void write(int op);

}
