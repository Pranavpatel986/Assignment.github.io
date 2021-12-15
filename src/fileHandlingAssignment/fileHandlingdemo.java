package fileHandlingAssignment;

import java.io.File;
import java.util.Scanner;

public class fileHandlingdemo {

    public static void main_cases(){
        Scanner sc = new Scanner(System.in);


        //creating main folder

        File folder = new File("D:\\main");
        folder.mkdirs();
        File files[] = folder.listFiles();
        System.out.println("WELCOME ALL");
        System.out.println("Click : ");
        System.out.println("1 : to Retrieve All files inside main folder and display ");
        System.out.println("2 : to Perform operations and taking user input ");
        System.out.println("3 : to terminate program ");
        System.out.println("\n" + "Enter number : ");
        int num=0;
        try {
            num = sc.nextInt();
        }catch (Exception e){
            System.out.println("Only integers allows");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (num==1){
            try {
                for (File f:files
                ) {
                    System.out.println(f);
                }
            }catch (Exception e){
                System.out.println("Error to open file");
            }
        }
        else if (num==2){
            Cases.case_is(num);
        }
        else if (num==3){
            System.out.println("Program Terminated Successfully");
        }
        else {
            System.out.println("Wrong Input Try again");
            main_cases();
        }
    }

    public static void main(String[] args) {
        main_cases();
    }
}
