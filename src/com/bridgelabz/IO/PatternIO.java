package com.bridgelabz.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.IOUtility;

public class PatternIO 
{
	public static void main(String[] args) throws IOException 
	{
		IOUtility utility = new IOUtility();
		File file=new File("/home/slot2/eclipse-workspace/SectionC1/src/com/bridgelabz/Files/pattern.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		String alphabet = bufferedReader.readLine();
		bufferedReader.close();
		
		
		switch (alphabet) 
		{
		case "k":
			utility.printKPattern();
			break;
		case "d":
			utility.printDPattern();
			break;
		case "w":
			utility.printWPattern();
			break;
		
		}
	
	}

}
