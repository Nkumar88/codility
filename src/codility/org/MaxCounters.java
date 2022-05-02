package codility.org;

public class MaxCounters {
	public int[] getMaxCounters(int N, int[] A) {
        // write your code in Java SE 8
		int[] arrN = new int[N];
		int size = A.length, maxVal = 0, minVal=0;
		
		for(int k=0; k<N; k++)
		{
			arrN[k] = 0;
		}
		
		for(int i=0; i<size; i++)
		{
			if(A[i] <= N && A[i] >= 1)
			{
				arrN[A[i]-1] = Math.max(arrN[A[i]-1] +1, minVal+1);
				if(maxVal < arrN[A[i]-1])
					maxVal = arrN[A[i]-1];
			}
			if(A[i]> N)
			{
				minVal = maxVal;
			}
		}
		
		for(int j=0; j<arrN.length; j++)
		{
			arrN[j] = Math.max(arrN[j], minVal);
		}
		
		return arrN;
    }

}
