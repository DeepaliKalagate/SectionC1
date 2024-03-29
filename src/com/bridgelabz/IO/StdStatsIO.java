package com.bridgelabz.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.StatsUtility;
import com.bridgelabz.utility.UtilityIO;

public class StdStatsIO 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		StatsUtility utility = new StatsUtility();
		File file = new File("/home/slot2/eclipse-workspace/SectionC1/src/com/bridgelabz/Files/number.txt");
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
	
		String[] stringArray = str.split(",");
		double[] arr = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();
		System.out.println("MAX :" + utility.max(arr));
		System.out.println("MIN :" + utility.min(arr));
		System.out.println("MEAN :" + StatsUtility.mean(arr));
		System.out.println("VARIANCE :" + utility.variance(arr));
		System.out.println("STANDARD DEVIATION :" + utility.standardDeviation(arr));
		System.out.println("MEDIAN :" + StatsUtility.median(arr));
	}
}


