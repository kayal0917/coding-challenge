package com.chaninsys.SkillMatrics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);

System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
    arr[i] = scanner.nextInt();
}
List<Integer> positive = new ArrayList<>();
List<Integer> negative = new ArrayList<>();

for (int num : arr) {
    if (num >= 0) {
        positive.add(num);
    } else {
        negative.add(num);
    }
}
List<Integer> rearranged = new ArrayList<>(positive);
rearranged.addAll(negative);
int[] result = new int[n];
for (int i = 0; i < n; i++) {
    result[i] = rearranged.get(i);
}
System.out.print("Rearranged array: ");
for (int num : result) {
    System.out.print(num + " ");
}
System.out.println();

scanner.close();
}	}


