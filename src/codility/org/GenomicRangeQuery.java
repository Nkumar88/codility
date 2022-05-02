package codility.org;

public class GenomicRangeQuery {
	public int[] getMinimalFactor(String S, int[] P, int[] Q)
	{
		int N = P.length;
		int[] minFactArr = new int[N];
		
		for(int i=0; i<N; i++)
		{
			//System.out.println(S.substring(P[i], Q[i]+1));
			if(S.substring(P[i], Q[i]+1).contains("A"))
			{
				minFactArr[i] = 1;
			}
			else if(S.substring(P[i], Q[i]+1).contains("C"))
			{
				minFactArr[i] = 2;
			}
			else if(S.substring(P[i], Q[i]+1).contains("G"))
			{
				minFactArr[i] = 3;
			}
			else if(S.substring(P[i], Q[i]+1).contains("T"))
			{
				minFactArr[i] = 4;
			}
		}
		
		return minFactArr;
	}

}
