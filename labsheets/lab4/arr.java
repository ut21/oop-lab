public class arr {
public static void printArray(int[][] arr){
for(int[] row: arr){
for(int i=0; i< row.length;i++){
System.out.print(row[i]+" ");
}
System.out.print("\n");
}
}
public static void main(String[] args) {
int[][] arr1 = {{1,2,3},{4,5,6}};
System.out.println("Array1 Elements");
printArray(arr1);
int[][] arr2 = arr1; //line1
printArray(arr2);
int m=2,n=2;
// arr1 = new int[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
arr1[i][j]+=7;
}
}
System.out.println("Array2 Elements");
printArray(arr2);
System.out.println("Array1 Elements after the change");
printArray(arr1);
}
}
