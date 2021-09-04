package QPS_6;

public class Roatated_BS {
	public int search(int[] nums, int target) {
		int piv = Find_piv(nums);
		if (nums[piv] == target) {
			return piv;
		}

		int sp1 = BS(target, nums, 0, piv - 1);
		if (sp1 != -1) {
			return sp1;
		}
		int sp2 = BS(target, nums, piv + 1, nums.length - 1);
		if (sp2 != -1) {
			return sp2;
		}
		return -1;
	}

	public int BS(int target, int[] nums, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

	public int Find_piv(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		int pivot = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			// System.out.println(nums[start]+ " "+ nums[mid]+ " "+ nums[end]);
			if (nums[start] > nums[mid]) {
				pivot = mid;
				end = mid - 1;
			} else if (nums[mid] > nums[end]) {
				pivot = mid;
				start = mid + 1;
			} else {
				start = mid + 1;
			}

		}
		return pivot;
	}
}
