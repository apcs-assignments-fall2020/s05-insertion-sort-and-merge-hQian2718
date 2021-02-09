import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<Integer>(list.size());
        result.add(0,list.get(0));
        int curr, j;
        for(int i = 1; i < list.size(); i ++){
             curr = list.get(i);
             for(j = i - 1; j > -1 && result.get(j) > curr; j --){}
             result.add(j+1,curr);
        }
        return result;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] res = new int[arr1.length + arr2.length];
        int i, j, k = 0;
        for(i = j = 0; i < arr1.length && j < arr2.length; ){
            if(arr1[i] < arr2[j])   res[k++] = arr1[i++];
            else                    res[k++] = arr2[j++]; 
        }

        if(i == arr1.length)    while(j<arr2.length)  res[k++] = arr2[j++];
        else                    while(i<arr1.length)    res[k++] = arr1[i++];
        return res;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
