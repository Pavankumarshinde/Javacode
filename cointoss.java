public class cointoss {
    // N -- > 2^N
    // 1 coin : H , T
    // 2 coins : HH, HT,TH,TT
    // 3 coins; HHH,HHT,HTH,THH,TTH,THT,HTT,TTT
    public static void combinations(int n, String pattern)
    {
        if(n==0) // base case.
        {
            System.out.println(pattern);
            return ;
        }
        // n-1 --> n.
        // H + combinations(n==2) // HHH, HHT,HTH,HTT
        // T + combinations(n==2) // THH, THT, TTH,TTT
          
         combinations(n-1,"H" + pattern);
         combinations(n-1,"T" + pattern);
         
        // 2 * 2 *2 --> 2^3, 2 ^N.




    }
    public static void main(String[] args) {
        // time complexity : O(2^N);
        // space complexity : O(N);
        combinations(4,"");

        
    }
    
}
