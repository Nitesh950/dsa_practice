class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i=0; 
        int j=0;
        while(i<arr.length){
            if(arr[i]==' '){
                swap(arr, j, i-1);
                i++;
                j=i;
            }
            else{
                i++;
            }
        }
        swap(arr, j, i-1);
        String res = new String(arr);
        return res;
    }
    public void swap(char[] arr, int l, int r){
        while(l<=r){
            char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
            l++;
            r--;
        }
    }
}
