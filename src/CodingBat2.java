
public class CodingBat2 {
	public boolean dividesSelfGolf(int n){for(int p=n;n%10>0;)n/=p%(n%10)>0?.1:10;return n<1;}
	public boolean dividesSelf(int n) {
		int p = n;
		while(n > 0) {
			int d = n % 10;
			if(d == 0 || p % d != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
//////////////////////////////////////////////////////////////////////////////////////
	public int[] copyEvens(int[] nums, int count) {
		int[] arr = new int[count];

		int arrInd = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				arr[arrInd] = i;
				arrInd++;
			}
			if (arrInd == arr.length) {
				return arr;
			}
		}

		return arr;
	}
//////////////////////////////////////////////////////////////////////////////////////
	public int countClumpsGolf(int[]n){int c=0,l=0,s=0;for(int i=0;i<n.length;i++){if(i!=0)if(n[i]==l){if(s==0)c++;s=1;}else s=0;l=n[i];}return c;}
	public int countClumps(int[] nums) {
		boolean inClump = false;
		int numClumps = 0;
		for (int i = 1; i < nums.length; i++) {
			if (!inClump && nums[i] == nums[i - 1]) {
				numClumps++;
				inClump = true;
			} else if (inClump && nums[i] != nums[i - 1]) {
				inClump = false;
			}
		}
		return numClumps;
	}

}