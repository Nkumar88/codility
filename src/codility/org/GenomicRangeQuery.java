package codility.org;

public class GenomicRangeQuery {
	public int[] getMinimalFactor(String S, int[] P, int[] Q)
	{
		int N = P.length, sLen = S.length();
		int[] minFactArr = new int[N];
		int[][] prefSum = new int[sLen][4];
		
		for(int i=0; i<prefSum.length; i++)
		{
			char c = S.charAt(i);
			
			if(c == 'A') prefSum[i][0] = 1;
			if(c == 'C') prefSum[i][1] = 1;
			if(c == 'G') prefSum[i][2] = 1;
			if(c == 'T') prefSum[i][3] = 1;
		}
		
		for(int i=1; i< sLen; i++)
		{
			for(int j=0; j<4; j++)
			{
				prefSum[i][j] = prefSum[i][j] + prefSum[i-1][j];
			}
		}
		
		for(int i=0; i<N; i++)
		{
			int start = P[i];
			int end = Q[i];
			
			for(int j=0; j<4; j++)
			{
				int lowerIndexCount = 0;
				
				if(start-1 >= 0)
				{
					lowerIndexCount = prefSum[start-1][j];
				}
				
				if(prefSum[end][j] - lowerIndexCount > 0)
				{
					minFactArr[i] = j+1;
					break;
				}
			}			
		}		
		return minFactArr;
	}

}
