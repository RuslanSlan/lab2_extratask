package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h = seconds/3600, mm = seconds/60%60, ss = seconds%60;
        System.out.printf("%d:%02d:%02d", h%24, mm, ss);

    }
}
