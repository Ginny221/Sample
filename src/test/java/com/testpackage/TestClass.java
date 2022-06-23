package com.testpackage;

import org.testng.annotations.Test;
import org.testng.Assert;


public class TestClass {
     @Test
	 public void sum() {
		         Assert.assertEquals(true, true);
		System.out.println("Sum");
	 }
     
     @Test
	 public void mul() {
		System.out.println("Multiply");
	 }
     
     @Test
	 public void divide() {
		System.out.println("Divide");
	 }
     
     @Test
	 public void sub() {
		System.out.println("Subtraction");
	 }
     
     
}
