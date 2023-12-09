package org.example;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class Child {
    public static void main(String[] args){
        System.out.println(getFiba(7));
    }
    public static Integer getFiba(Integer integer){
        if (integer==0) return 0;
        else if (integer==1) return 1;
        return getFiba(integer-1)+getFiba(integer-2);
    }
}
