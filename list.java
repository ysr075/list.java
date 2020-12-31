package com.company;

import java.util.Scanner;

class listMain {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        while(true) {
            String question;
            System.out.print("\nlist or exit: ");
            question = input.nextLine();
            if (question.equals("1") || question.equals("list") || question.equals("LIST")) {
                String list = "a, b, c, d, e, f, g,h,j,k,l,m,n,o,p,q,r,s,t,u,v,w";
                System.out.print(list);
            } else {
                System.exit(1);
            }
        }
    }
}

class listExit {
    public static void StaticMethod() {
        System.exit(1);
    }
}

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continues;
        continues = input.nextLine();
        if (continues.equals("yes") || continues.equals("y")) {
            listMain.StaticMethod();
        } else {
            listExit.StaticMethod();
        }
    }
}
