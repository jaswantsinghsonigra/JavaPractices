public class Sorting {
    public static void main(String[] args) {
        int [] arr = {9,6,7,2,8,3,4,1};
        //System.out.println(arr.toString());
        printArray("No Sorting",arr);
        //bubbleSort(arr);
        //printArray("Bubble Sort",arr);
        //selectionSort(arr);
        //printArray("Selection Sort",arr);
        insertionSort(arr);
        printArray("Insertion Sort",arr);
    }

    private static void printArray(String type,int []arr) {
        System.out.print("Type of Sorting is : "+type+" ");
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    private static void bubbleSort(int [] arr) {
        int length = arr.length;
        for(int i=0;i<length-1;i++){
           for(int j=0;j<length-i-1;j++) {
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
        }
    }

    private static void selectionSort(int [] arr) {
        int length = arr.length;
        int min;
        for(int i=0;i<length-1;i++){
            min=i;
            for(int j=i+1;j<length;j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private static void insertionSort(int [] arr) {
        int length = arr.length;
        for(int i=1;i<length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
}
