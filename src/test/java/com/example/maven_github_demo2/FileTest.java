package com.example.maven_github_demo2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FileTest {
@Test
void testTotal1()
{
	assertEquals(225,GradeCalculator.calculateTotal(75, 68, 82));	
    }
private void assertEquals(double d, double e) {
	// TODO Auto-generated method stub
	
}
@Test
void testTotal()
{
	assertEquals(75.0,GradeCalculator.calculateAverage(75, 68, 82));
}
@Test 
void testPass()
{
	assertTrue(GradeCalculator.isPass(75.0));
}
void testFail() {
   assertFalse(GradeCalculator.isPass(35.0));
}
}

	


