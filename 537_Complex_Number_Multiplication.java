class Solution {
    public String complexNumberMultiply(String a, String b) {
        int idx_a = a.indexOf('+');
        int idx_b = b.indexOf('+');
        idx_a = idx_a<0?a.indexOf('-'):idx_a;
        idx_b = idx_b<0?b.indexOf('-'):idx_b;
        int a_x = Integer.parseInt(a.substring(0,idx_a));
        int b_x = Integer.parseInt(b.substring(0,idx_b));
        int a_y = Integer.parseInt(a.substring(idx_a+1,a.size()-1));
        int b_y = Integer.parseInt(b.substring(idx_b+1,b.size()-1));
        int x = a_x*b_x - a_y*b_y;
        int y = a_x*b_y + a_y*b_x;
        return (x+"+"+y+"i");
    }
}