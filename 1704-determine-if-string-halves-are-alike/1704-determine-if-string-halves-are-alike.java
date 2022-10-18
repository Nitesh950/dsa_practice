class Solution {
   public boolean halvesAreAlike(String s) {
        char[] ans = s.toCharArray();
        int mid = ans.length/2;
        int count1 = count(ans,0,mid), count2 =count(ans,mid,ans.length);
        if(count1 != count2){
            return false;
        }else{
            return true;
        }
    }
    static int count(char[] ans,int start,int end){
        int count1 = 0;
        for(int i=start;i<end;i++){
            if((ans[i]=='A' || ans[i]=='a') || (ans[i]=='E' || ans[i]=='e') || (ans[i]=='I' || ans[i]=='i') || (ans[i]=='O' || ans[i]=='o') || (ans[i]=='U' || ans[i]=='u')){
                
                count1++;
            }
        }
        return count1;
    }
}