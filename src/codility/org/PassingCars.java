package codility.org;

public class PassingCars {
	public int getPair(int[] A)
	{
		int pair = 0, N = A.length, pairFactor = 0;
		for(int i=0; i<N; i++)
		{
			if(A[i] == 0)
			{
				pairFactor++;
			}
			if(A[i] == 1)
			{
				if(pair + pairFactor > 1000000000)
                {
                    return -1;
                }
				pair = pair + pairFactor;
			}
		}
		
		return pair;
	}

}
