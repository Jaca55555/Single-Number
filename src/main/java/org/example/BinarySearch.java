package org.example;

public class BinarySearch {
    public static void main(String[] args){
        int[] array={2,4,5,8,6,4,3,8,6};
        int key=8;
        System.out.println(binarySearch(array, key));

    }
    public static int binarySearch(int[] list, int key) {
         int low = 0;
         int high = list.length-1;
         return binarySearch(list, key, low, high);
         }
    public  static int binarySearch(int[] list, int key, int high, int low){
        if (low>high){
            return low-1;
        }
        int mid=(low+high)/2;
        if (key<list[mid]){
            return binarySearch(list, key, high, low);
        }else if (key==list[mid])
            return mid;
        else    return binarySearch(list, key, mid+1, high);
    }
}
