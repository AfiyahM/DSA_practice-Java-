 class reverse{
    public static int reverse (int [] arr){
        int  [] temp = new int [];
        for( int i =0; i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
        for( int i =0; i<arr.length;i++){
            arr[i]=temp[i];
        }
        return temp;
    }

    
    
     public static void main (String []args){
         int [] arr ={1,4,5,8,21,34,15,673,89,0};
        System.out.println("The given array is"+ arr);
        System.out.println("The reverse array is"+ reverse(arr));
       
    }}