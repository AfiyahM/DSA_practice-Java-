class duplicate {
    public boolean duplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return numSet.size() < nums.length;
    }
    public static void main(String [] args){
    int [] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(" "+ duplicate(arr));
       


    }
}