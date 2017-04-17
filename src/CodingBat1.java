
public class CodingBat1 {

	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}
//////////////////////////////////////////////////////////////////////////////////////
	public boolean splitArray(int[] nums) {
		return isSplitable(nums, 0, 0, 0);
	}

	public boolean isSplitable(int[] arr, int part1, int part2, int index) {
		if (arr.length <= index)
			return part1 == part2;
		return isSplitable(arr, part1 + arr[index], part2, index + 1)
				|| isSplitable(arr, part1, part2 + arr[index], index + 1);
	}
//////////////////////////////////////////////////////////////////////////////////////
	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			return target == 0;
		}

		int total = nums[start];
		int count = 1;
		for (int i = start + 1; i < nums.length; i++) {
			if (nums[i] == nums[start]) {
				total += nums[i];
				count++;
			} else break;
		}
		return groupSumClump(start + count, nums, target - total) || groupSumClump(start + count, nums, target);
	}
//////////////////////////////////////////////////////////////////////////////////////
	public int commonTwo(String[] a, String[] b) {
		int total = 0;
		int bi = 0;
		for (int ai = 0; ai < a.length; ai++) {
			if (ai > 0 && a[ai].equals(a[ai - 1]))
				continue;
			while (bi < b.length) {
				if (a[ai].equals(b[bi])) {
					total++;
					break;
				} else if (a[ai].compareTo(b[bi]) < 0) {
					break;
				}
				bi++;
			}
		}
		return total;
	}
}
