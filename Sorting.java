// public class Sorting {
//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }

//     // Bubble Sort
//     // Time Complexity: O(n^2)

//     public static void main(String[] args) {

//         int arr[] = {64, 34, 25, 12, 22, 11, 90};
//         for(int i = 0; i < arr.length -1; i++){
//             for(int j = 0; j < arr.length -i - 1; j++){
//                 if(arr[j] > arr[j + 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//             }
//         }
//     }
//     printArray(arr);
// }
//     // Selection Sort
//     // Time Complexity: O(n^2)
public class Sorting{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);
    }
}

// Insertion Sort
// Time Complexity: O(n^2)
// public class Sorting {
// public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};
//         for(int i = 1; i<arr.length; i++){
//             int current = arr[i];
//             int j = i - 1;
//             while(j >= 0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;

//             }
//             arr[j+1] = current;

//         }
//         printArray(arr);
//     }
// }
// Merge Sort
// Time Complexity: O(n log n)
public class Sorting{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[]= new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1<= mid && idx2 <= ei){
            if(arr[idx1]<= arr[idx2]){
                merged[x++] = arr[idx1++];
                
        }else{
            merged[x++] = arr[idx2++];
        }
    }
    while(idx1 <= mid){
        merged[x++] = arr[idx1++];

    }
    while(idx2 <= ei){
        merged[x++] = arr[idx2++];
    }
    for(int i = 0, j = si; i <merged.length; i++, j++){
        arr[j] = merged[i];


    }

    }
    public static void divide(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n -1);
        printArray(arr);


    }

}

