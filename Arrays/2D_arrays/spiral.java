class spiral{
    public static void printsprial(int m[][]){
        int startrow=0;
        int startcol=0;
        int endrow=m.length-1;
        int endcol=m[0].length-1;
        
        while(startrow<=endrow && startcol<=endcol){
            //topboundary(j for col)
            for(int j=startcol;j<=endcol;j++){
                System.out.println(m[startrow][j]+"");
            }
            //right(j for col)
            for(int i=startrow+1;j<=endrow;i++){
                System.out.println(m[i][endcol]+"");
            }
        }
    }

    public void main(String args[]){
        int m[][]={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};

    }
}