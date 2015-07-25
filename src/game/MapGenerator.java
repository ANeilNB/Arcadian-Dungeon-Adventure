package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class MapGenerator {
	
	public static char[][] createMap(String filename){
		
		int[] dimensions = dimensions(filename);
		
		char[][] newMap = new char[dimensions[0]][dimensions[1]];
		
		try{
			File file = new File(filename);
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			int line = 0;
			String curRow;
			for(int i=0; i < dimensions[0]; i++){
				curRow = br.readLine();
				for(int j=0; j < dimensions[1]-1; j++){
					newMap[line][j] = curRow.charAt(j);
				}
				line++;
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		return newMap;
	}
	
	
	public static int[] dimensions(String filename){
		
		try{
			File file =new File(filename);
			 
			if(file.exists()){
			
			    FileReader fr = new FileReader(file);
			    LineNumberReader lnr = new LineNumberReader(fr);
			
			    int lineNumber = 0;
			
			    while (lnr.readLine() != null){
			    	lineNumber++;
			    }
			    
			    lnr.close();
			    
			    fr = new FileReader(file);
			    BufferedReader br = new BufferedReader(fr);
			    
			    int columnNumber = br.readLine().length();
			    
			    br.close();
			    
			    int[] result = {columnNumber, lineNumber};
			    
			    return result;
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			
		}
		int[] result = {};
		return result;
	}
}
