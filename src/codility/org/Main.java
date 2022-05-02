package codility.org;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{3,4,4,6,1,4,4};
		int[] output = new int[5];
		int x = 2;
		//Solution s = new Solution();
		FrogJump fj = new FrogJump();
		ArrayPermutation ap = new ArrayPermutation();
		
		MaxCounters mc = new MaxCounters();
		output = mc.getMaxCounters(5, input);
		
		for(int i=0; i<output.length; i++)
		{
			System.out.print(output[i]+" ");
		}
	
		//System.out.println(mc.getMaxCounters(5, input));

	}

}
