package codility.org;
import java.util.*;
public class FrogJump {
	public int getFrogJump(int X, int[] A) {
	     // write your code in Java SE 8
	     int size = A.length;
	     int count=0;
	     List<Boolean> path = new ArrayList<>(); 
	     
	     if(size ==1)
		 {
			 if(A[0] == X)
			 {
				 return 0;
			 }
			 else
				 return -1;
		 }
	     
	     for(int i=0; i<=X; i++)
	     {
	    	 path.add(i, false);
	     }

	     for(int i=1; i<size; i++)
	     { 
	    	
	         if(A[i] <= X && path.get(A[i])!= true)
	         {
	             path.set(A[i], true);
	             count++;
	             
	             if(count == X)
	            	 return i;
	         }
	     }

	     return -1;
	 }
}
