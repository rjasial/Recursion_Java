public class QuickSort {

    public static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            

            int pi = partition(arr, low, high);

            quickSorting(arr, low, pi-1);
            quickSorting(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++ ){
            if(arr[j] < pivot){
               
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;

        int temp = arr[i];
        arr[i]= arr[high];
        arr[high] = temp;

        return i;

    }



    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 4, 9, 8};

        quickSorting(arr, 0, arr.length-1);

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
