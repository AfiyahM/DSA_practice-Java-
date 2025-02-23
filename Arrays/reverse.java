 class reverse{
    public static  void reverse (int [] arr){
        int  [] temp = new int [arr.length];
        for( int i =0; i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
        for( int i =0; i<arr.length;i++){
            arr[i]=temp[i];
        }
    
    }

    
    
     public static void main (String []args){
         int [] arr ={1,4,5,8,21,34,15,673,89,0};
        System.out.println("The given array is"+ arr);
        reverse(arr); 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
       
    }