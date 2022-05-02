package codility.org;


//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int getMissingPositive(int[] A) {
     // write your code in Java SE 8
	 int minValue = Integer.MIN_VALUE, maxValue = 1000001;
	 boolean[] isPresent = new boolean[maxValue];
	 
	 for(int i=0; i<A.length; i++)
	 {
		 if(A[i] > 0 && A[i] <= A.length)
		 {
			 isPresent[A[i]] = true;
		 }
		 
		 minValue = Math.max(minValue, A[i]);
	 }
	 
	 for(int j=1; j<maxValue; j++)
	 {
		 if(!isPresent[j])
		 {
			 return j;
		 }
	 }
	 
	 return minValue +1;
 }
}

