public class exercise1{
    public static int[] cloneArray_passByRefrence_wrong(int[] arr){
        int[] arr_new = new int[arr.length];
        arr_new = arr;
        return arr_new;
    }

    public static int[] cloneArray(int[] arr){
        int [] arr_new = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr_new[i]=arr[i];
        }
        return arr_new;
    }

    private static int[] cloneArray (int[] arr, int len){
        int[] arr_new = new int[len];
        for (int i=0; i<len; i++){
            arr_new[i]=arr[i];
        }
        return arr_new;
    }

    private static int[] cloneArray (int[] arr, int len, int start){
        int[] arr_new = new int[len];
        for (int i=start; i<start+len-1; i++){
            arr_new[i]=arr[i];
        }
        return arr_new;
    }

    public static void main(String[] args){
        int[] a = new int[6];
        for(int i =0; i<6; i++){
            a[i]=i;
        }
        int[] b=cloneArray_passByRefrence_wrong(a);
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]);
        }
        System.out.println("\n");
        a[2]=69;
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]);
        }
        System.out.println("\n");

        int[] c = cloneArray(a);
        for (int i=0; i<b.length; i++){
            System.out.print(c[i]);
        }
        System.out.println("\n");
        a[3]=420;
        for (int i=0; i<b.length; i++){
            System.out.print(c[i]);
        }
        System.out.println("\n");
        int n=2;
        int[] d = cloneArray(a, n);
        for (int i : d){
            System.out.print(i);
        }
        System.out.println("\n");
        int[] e = cloneArray(a, 6, 1);
        for (int i : e){
            System.out.print(i+" ");
        }
    }
}