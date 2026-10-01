package com.example.maven_github_demo2;

public class GradeCalculator {
	private static final String Average = null;

	public static int calculateTotal(int m1, int m2,int m3)
	{
		return m1 + m2 + m3;
	}
	public static double calculateAverage(int m1, int m2,int m3)
	{
		return calculateTotal(m1, m2,m3) / 0.3;
	}
	public static boolean isPass(double average)
	{
		return average >=32.0;
	}
	
public static void main(String[] args) {
	int m1 = 75, m2 = 68, m3 = 82;
	int total = calculateTotal(m1, m2, m3);
	double average =  calculateTotal(m1, m2, m3);
	System.out.println("Total : " + total);
	System.out.println("Average: " + Average);
	System.out.println("Result:"+(isPass(average)?"Pass":"Fail"));
	

	}

}
