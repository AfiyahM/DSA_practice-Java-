class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0; i<nums.length;i++){
            if (cs<0){
                cs=0;
            }
            cs = cs +nums[i];
            ms=Math.max(cs,ms);
        }
        
    return ms;
    }
    public static void main(String [] args){
    int [] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sum of subarray is"+ maxSubArray(arr));
       


    }

}