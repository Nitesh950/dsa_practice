class Solution {
    public boolean judgeCircle(String moves) {
        int netUpwards= 0;
        int netSideways = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                netUpwards++;
            }else if(moves.charAt(i)=='D'){
                netUpwards--;
            }else if(moves.charAt(i)=='L'){
                netSideways++;
            }else{
                netSideways--;
            }
        }
        if(netSideways==0 && netUpwards==0){
            return true;
        }else{
            return false;
        }
    }
}