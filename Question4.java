public class Question4 {
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};

        for(int i=0;i<arr.length;i++){
            int rsum=0;
            for(int j=0;j<arr[0].length;j++){
                rsum+=arr[i][j];
            }
            System.out.println("The sum of"+i+"th row is "+rsum);
        }

        for(int i=0;i<arr[0].length;i++){
            int csum=0;
            for(int j=0;j<arr.length;j++){
                csum+=arr[j][i];
            }
            System.out.println("The sum of"+i+"th col is "+csum);
        }


    }

}
