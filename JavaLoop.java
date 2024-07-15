package com.chainsys.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());

	        bufferedReader.close();

	        for (int i = 1; i <= 10; i++) {
	            int result = N * i;
	            System.out.println(N + " x " + i + " = " + result);
	        }
	    }
	}

