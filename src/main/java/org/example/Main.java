package org.example;

class Main {
    public String reverseOnlyLetters(String s) {
        char temp[] = s.toCharArray();
        int low = 0 , high = s.length()-1;
        while(low < high){
            if(Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])){
                char i = temp[low];temp[low] = temp[high];
                temp[high] = i;
                low++; high--;
            }else if(!Character.isAlphabetic(temp[low]))  low++;
            else if(!Character.isAlphabetic(temp[high]))  high--;
        }
        return String.valueOf(temp);

    }

    public static void main(String[] args) {

        Main main = new Main();
        String nums ="ab-cd" ;
        System.out.println(main.reverseOnlyLetters(nums));
    }
}