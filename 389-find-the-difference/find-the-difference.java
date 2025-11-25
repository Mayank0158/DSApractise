public class Solution {
    public char findTheDifference(String s, String t) {
        // int sumS = 0, sumT = 0;
        
        // for (char ch : s.toCharArray()) {
        //     sumS += ch;
        // }
        
        // for (char ch : t.toCharArray()) {
        //     sumT += ch;
        // }
        
        // return (char)(sumT - sumS);


        int help = 0 ; 
        for(char c :s.toCharArray()){
            help = help^c;
        }

        for(char c :t.toCharArray()){
            help = help^c ; 
        }

        return ((char) help); 
    }
}
