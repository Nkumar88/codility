package codility.org;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1,0,1};
		int[] output = new int[1];
		int x = 2;
		String S = "A";
		int[] A = new int[] {0};
		int[] B = new int[] {0};
		//Solution s = new Solution();
		//FrogJump fj = new FrogJump();
		//ArrayPermutation ap = new ArrayPermutation();
		//MaxCounters mc = new MaxCounters();
		//PassingCars pc = new PassingCars();
		//CountDiv cd = new CountDiv();
		GenomicRangeQuery grq = new GenomicRangeQuery();
		
		output = grq.getMinimalFactor(S,A,B);
		
		for(int i=0; i<output.length; i++)
		{
			System.out.print(output[i]+" ");
		}
	
		//System.out.println(cd.getDivCount(1,1,2));

	}

}
