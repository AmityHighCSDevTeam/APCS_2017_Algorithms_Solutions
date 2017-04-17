import java.util.Map;
import java.util.HashMap;

public class CodingBat3 {

	public boolean canBalance(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int lTtl = 0, rTtl = 0;
			for (int i2 = 0; i2 < nums.length; i2++) {
				if (i2 < i) {
					lTtl += nums[i2];
				} else {
					rTtl += nums[i2];
				}
			}
			if (rTtl == lTtl) {
				return true;
			}
		}
		return false;
	}
//////////////////////////////////////////////////////////////////////////////////////
	public int makeChocolate(int small, int big, int goal) {
		int bigNeeded = goal / 5;
		int smallNeeded = goal % 5;
		while (bigNeeded > big) {
			bigNeeded--;
			smallNeeded += 5;
		}
		return (small < smallNeeded ? -1 : smallNeeded);
	}
//////////////////////////////////////////////////////////////////////////////////////
	public Map<String, Integer> wordCountSmart(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		return map;
	}
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		return map;
	}

}
