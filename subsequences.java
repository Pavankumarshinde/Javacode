public class subsequences {
    public static void subsequence(String input,int i,String subs)
    {
        if(i==input.length())
        {
            System.out.println(subs);
            return ;

        }
        //take
        subsequence(input, i+1, subs + input.charAt(i));

        //not take.
        subsequence(input, i+1, subs);

    }
    public static void main(String[] args) {

        //space complexity : O(N)
        // time complexity : 2^N.

        //  String ="abc"
        //  "", "abc","bc", "ac","ab", "a","b","c" // subsequences
        String input ="abc";
        int N=input.length();
        // ""-->a --> ab ,a --> abc , ab, ac, a
        //""--> ""--> b, "" --> bc, b, c, ""
        subsequence(input,0,"");

    }
}
