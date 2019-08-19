package com.sk.fix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SqlSemicolonFix {
	public static void main(String args[]) throws IOException {
		String line = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		int i = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\InterLand\\Desktop\\input.sql"));
			writer = new BufferedWriter(new FileWriter("C:\\Users\\InterLand\\Desktop\\output.sql"));
			System.out.println("Excecution started");
			while( (line = reader.readLine() ) != null ) {
				line = line.trim();
				i++;
				if( line.length() > 0 )
				if( !line.substring(line.length() - 1).equals(";") ) {
					writer.write(line+";");
				}
				else {
					writer.write(line);
				}
				writer.write(" \n");
			}
			System.out.println("Excecution completed :)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if( reader != null )
				reader.close();
			if( writer != null )
				writer.close();
		}
	}
}
