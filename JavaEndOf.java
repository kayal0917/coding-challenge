package com.chainsys.coding;

import java.util.Scanner;

public class JavaEndOf {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        int lineNumber = 1;
		        
		        while (scanner.hasNextLine()) {
		            String line = scanner.nextLine();
		            System.out.println(lineNumber + " " + line);
		            lineNumber++;
		        }
		        
		        scanner.close();
		    }
		

	}


