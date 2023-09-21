package org.example;

import java.util.Arrays;

 class Main {
     public int maxNumberOfBalloons(String text) {

         char[] chars=new char[text.length()];
         int a=0,b=0, n=0, l=0,o=0, s=0,g=0;
         text.chars();
         for (int i = 0; i < chars.length; i++) {
             switch (text.charAt(i)){
                 case 'b':  b++; break;
                 case 'a':  a++; break;
                 case 'l':  s++;{if (s%2==0)l++;
                 }; break;
                 case 'o':  g++;{
                     if (g%2==0)o++;
                 }; break;
                 case 'n':  n++; break;

             }
         }
         int min=0;
        min= Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);
         return min==-1?0:min;
     }

    public static void main(String[] args) {

        Main main = new Main();
        String a="krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        System.out.println(main.maxNumberOfBalloons(a));
    }
}