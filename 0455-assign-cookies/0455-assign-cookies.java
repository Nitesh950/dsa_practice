class Solution {
    public int findContentChildren(int[] greed, int[] cookieSize) {
        Arrays.sort(greed);
        Arrays.sort(cookieSize);

        int i=greed.length-1;
        int j=cookieSize.length-1;
        
        int output = 0;

        while(i>=0 && j>=0){
            if(cookieSize[j] >= greed[i]){
                output++;
                j--;
               
            }
            i--;
        }

        return output;
    }
}