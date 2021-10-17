package Week6;

public class CorrectnessInvariant {
    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j] < a[j-1]) {
                    int swap = a[j];
                    a[j] = a[j-1];
                    a[j-1] = swap;
                }
                else break;
            }
        }

        printArray(a);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
}
