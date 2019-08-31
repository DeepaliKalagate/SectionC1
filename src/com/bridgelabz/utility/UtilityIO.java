package com.bridgelabz.utility;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class UtilityIO
{
	public static void poem(String animal, String sound) throws FileNotFoundException 
	{
		File file=new File("/home/slot2/eclipse-workspace/SectionC1/src/com/bridgelabz/Files/poem.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try 
		{
			str = bufferedReader.readLine();
			bufferedReader.close();
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		String replaceString = str.replaceAll("ANIMAL", animal);
		String replaceString2 = replaceString.replaceAll("SOUND", sound);

		System.out.println(replaceString2);
		System.out.println("Writing in file of same");
		
		try 
		{
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(replaceString2);
			bufferedWriter.close();
			System.out.println("Write successfully");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
}
