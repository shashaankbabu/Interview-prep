package LeetCode;

class SortColors {
    public void sortColors(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length-1, n = arr.length;

        while(mid<=hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

    }
}
