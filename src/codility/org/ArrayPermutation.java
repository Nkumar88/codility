package codility.org;
import java.util.*;
public class ArrayPermutation {
	public int isPermutation(int[] A) {
        // write your code in Java SE 8
		int N = A.length, maxValue = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<N; i++)
		{
			set.add(A[i]);
			maxValue = Math.max(maxValue, A[i]);
		}
		
		if(maxValue != N)
			return 0;
		
		if(set.size() == N)
			return 1;
		
		
		return 0;
    }

}
