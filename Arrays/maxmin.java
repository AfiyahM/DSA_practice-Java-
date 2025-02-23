class maxmin{
    public static  int max( int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
       return max;
       
    }
    public static  int min( int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
       return min;

    }
    public static void main (String []args){
         int [] arr ={1,4,5,8,21,34,15,673,89,0};
    
              System.out.println("The given array is"+ arr);
         System.out.println("maximium nuber from the array is"+ max(arr));
         System.out.println("minimium nuber from the array is"+ min(arr));
    }

}