package codility.org;

public class CountDiv {
	public int getDivCount(int A, int B, int K)
	{
		int divCountInSecondPart = 0, divCountInFirstPart = 0;
		if(A == 1)
			return B/K;
		else if(A==0)
			return B/K +1;
		else
		{
			divCountInSecondPart = B/K;
			divCountInFirstPart = (A-1)/K;
			return Math.abs(divCountInSecondPart - divCountInFirstPart);
		}
	}

}
