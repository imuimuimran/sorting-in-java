public class basicSelectionSort {

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // selection sort algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            int smallestArray = i;
            for(int j = i + 1; j < arr.length; j++) {
                
                if(arr[smallestArray] > arr[j]) {
                    //swap operation
                    smallestArray = j;
                }
            }
            int temp = arr[smallestArray];
            arr[smallestArray] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
