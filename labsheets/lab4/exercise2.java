public class exercise2 {
    /*
    Implement a method that takes 2D array 'arr' as input
    and outputs the' newArray' 1D array.
    */

    public static int[] colsum(int[][] arr){
        int rowNo = arr.length;
        int colNo = arr[0].length;
        int[] newArray = new int[rowNo];
        for(int i = 0; i<colNo; i++){
            for(int j=0; j<rowNo; j++){
                newArray[i] = newArray[i] + arr[j][i];
            }
        }
        for(int i =0; i<newArray.length; i++){
            System.out.println(newArray[i]+" ");
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] b = colsum(arr);
    }
    }
    /*
    Example:
    Input array 'arr' contents :[ [1 2 3],
    [4 5 6],
    [7 8 9] ]
    'newArray' contents : [ 12 15 18 ]
    newArray[i] = sum of elements of column ‘i’ of ‘arr’ 2D array.
    */