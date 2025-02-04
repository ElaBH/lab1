//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Elizabeth Heineman
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");
  
    //Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}.
    int[] myArray = {5, 9, 3, 12, 7, 3, 11, 5};

    //Output the array in order using a while loop.
    int i = 0;
    while (i < myArray.length) {
       System.out.println(myArray[i]);
    }

    //Output the array in reverse using a for loop.
    int i = 1;
    for (int i = 1; i < nums.length; i++) {
       System.out.println(myArray[myArray.length - i]);
    }
    
    //Output the first and last values of the array.
    System.out.println(myArray[0] + " " + myArray[myArray.length - 1);

    //Call the methods created in Lab1.
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    System.out.println(lab.max(1, 2));
    System.out.println(lab.sum(myArray));
    System.out.println(lab.average(myArray));
    System.out.println(lab.max(myArray));
    System.out.println(lab.min(myArray));
  }
}     



// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b) {
     if (a > b)
	return a;
     if (a < b)
        return b;
  }
  public min(int a, int b) {
     if (a > b)
	return b;
     if (a < b)
        return a;
  }
  public sum(int[] nums) {
     double total = 0;
     for (int i = 0; i < nums.length; i++) {
        total += nums[i];
     }
     return total;
  }
  public average(int[] nums) {
     double total = 0;
     for (int e: nums) {
        total += e;
     }
     return (total / nums.length);
  }
  public max(int[] nums) {
     double max = nums[0];
     for (int i = 1; i < nums.length; i++) {
        if (nums[i] > max) max = nums[i];
     }
     return max;
  }
  public min(int[] nums) {
     double min = nums[0];
     for (int i = 1; i < nums.length; i++) {
        if (nums[i] < max) max = nums[i];
     }
     return min;
  }