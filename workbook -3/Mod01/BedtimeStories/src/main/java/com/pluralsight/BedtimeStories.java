package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select story to read: \n goldilocks.txt \n hansel_and_gretel.txt \n mary_had_a_little_lamb.txt");
            String choice = scanner.nextLine().trim();
            FileInputStream fis = new FileInputStream(choice);
            Scanner storyScanner = new Scanner(fis);
            int line_count = 1;
            while (storyScanner.hasNextLine()) {
                String line = storyScanner.nextLine();
                System.out.println(line_count +". "+ line);
                line_count ++;
            }
            storyScanner.close();
            fis.close();
            scanner.close();
        } catch (IOException e) {
            System.out.println("Problem:" + e.getMessage());
        }
    }
}


