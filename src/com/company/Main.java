package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of queries");
        int N = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list =new ArrayList<>();
        int max=Integer.MIN_VALUE;

        for (int i=0;i<N;i++) {
            String a = scanner.nextLine();
            if (a.equals("2")) {
                list.remove(0);
            } else if (a.equals("3")){
                for (int num:list) {
                    max =Math.max(max,num);
                }
                System.out.println(max);
                max=Integer.MIN_VALUE;
            } else {
                list.add(0,Integer.valueOf(a.substring(2)));

            }
        }
    }
}
