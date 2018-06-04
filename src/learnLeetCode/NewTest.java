package learnLeetCode;

import java.util.Arrays;

import org.testng.annotations.Test;


public class NewTest {
	public static Solution s = new Solution();
	
	@Test(groups = {"BaseCase"})
	public void Main() {
		int nums[] = {1, 5, 6, 9};
		int target = 10;
		System.out.println(Arrays.toString(s.twoSum(nums, target)));
	}
}
