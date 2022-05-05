package com.erstegroup.app.util;

import java.util.Scanner;

public class WordCountUtil {

    private void help() {
        // Read from commandline
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input: ");
        String input = myObj.nextLine();
        System.out.println("Input: " + input);
    }
}
