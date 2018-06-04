package learnLeetCode;

import java.util.HashMap;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		for (int i = 0; i < nums.length; ++i) {
			System.out.print("i:" + i);
			if (map.containsKey(target - nums[i])) {
				res[1] = i;
				res[0] = map.get(target - nums[i]);
				System.out.println("res[0]:" + res[0]);
				System.out.println("res[1]:" + res[1]);
				break;
			}
			map.put(nums[i], i);
			System.out.println("map:" + map);
		}
		return res;
	}
}