public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // move to next unique position
                nums[i] = nums[j]; // update with new unique element
            }
        }
        return i + 1; // new length of array with unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
