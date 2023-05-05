
public class Solution {
    public int maximum69Number (int num) {
        String sNum = Integer.toString(num);
        int s = sNum.indexOf('6');
        if (s==-1)return num;
        sNum = sNum.substring(0,s)+'9'+sNum.substring(s+1);
        return Integer.parseInt(sNum);
    }
}
