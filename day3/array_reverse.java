package com.company;

public class array_reverse {
    public static void main(String[] args) {
        int [] marks={70 , 80 , 65 , 75 , 95};
        int [] marks1 = new int[5];
        int j=0;
        for(int i=4;i>=0;i--) {
            marks1[j] = marks[i];
            j++;
        }
        for(int i=0;i<5;i++) {
            System.out.println(marks1[i]);
        }
    }
}
