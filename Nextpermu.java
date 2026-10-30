class Nextpermu {
    public void nextPermutation(int[] arr) {

        int n = arr.length;
        int ind = -1;

        // Step 1: Find breakpoint
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                ind = i;
                break;
            }
        }

        // Step 2: Find the next greater element
        if(ind != -1) {
            for(int i = n-1; i > ind; i--) {
                if(arr[i] > arr[ind]) {
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;
                    break;
                }
            }
        }

        // Step 3: Reverse remaining elements
        reverse(arr, ind+1, n-1);
    }

    public void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}