public class basicMergeSort {
    public static void conquer(int arr[], int strt_indx, int mid, int end_indx) {
        int merged[] = new int[end_indx - strt_indx + 1];

        int idx1 = strt_indx;
        int idx2 = mid + 1;
        int mergedTracker = 0;

        while (idx1 <= mid && idx2 <= end_indx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[mergedTracker++] = arr[idx1++];
            } else {
                merged[mergedTracker++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[mergedTracker++] = arr[idx1++];
        }

        while (idx2 <= end_indx) {
            merged[mergedTracker++] = arr[idx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[strt_indx + i] = merged[i];
        }
    }

    public static void divide(int arr[], int strt_indx, int end_indx) {
        if (strt_indx >= end_indx) {
            return;
        }
        int mid = strt_indx + (end_indx - strt_indx) / 2;
        divide(arr, strt_indx, mid);
        divide(arr, mid + 1, end_indx);
        conquer(arr, strt_indx, mid, end_indx);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int num = arr.length;

        divide(arr, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



/* 


public class basicMergeSort {
    public static void conquer(int arr[], int strt_indx, int mid, int end_indx) {
        int merged[] = new int[end_indx - strt_indx + 1];

        int idx1 = strt_indx;
        int idx2 = mid + 1;
        int mergedTracker = 0;

        while (idx1 <= mid && idx2 <= end_indx) {
            if(arr[idx1] <= arr[idx2]) {
                merged[mergedTracker++] = arr[idx1++];
            } else {
                merged[mergedTracker++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[mergedTracker++] = arr[idx1++];
        }

        while (idx2 <= end_indx) {
            merged[mergedTracker++] = arr[idx2++];
        }

        for(int i = 0; i < merged.length; i++) {
            for(int j = 0; j < merged.length; j++) {
                arr[j] = merged[i];
            }
        }
    }
    
    public static void divide(int arr[], int strt_indx, int end_indx) {
        if(strt_indx >= end_indx) {
            return;
        }
        int mid = strt_indx + (end_indx - strt_indx) / 2;
        divide(arr, strt_indx, mid); 
        divide(arr, mid + 1, end_indx);
        conquer(arr, strt_indx, mid, end_indx);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int num = arr.length;

        divide(arr, 0, num - 1);

        for(int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

*/