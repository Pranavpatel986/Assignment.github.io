package fileHandlingAssignment;

import java.util.Scanner;

public class Cases {
    public static void case_is(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Click : ");
        System.out.println("1 : to Create new Folder inside main ");
        System.out.println("2 : to Delete the file you want ");
        System.out.println("3 : to find files Starting with the given name ");
        System.out.println("4 : Return to Previous menu ");
        System.out.println("5 : to Terminate Program");

        System.out.println("\n"+"Enter the number : ");
        int num2 = sc.nextInt();
        //////////////////////////////////////////////
        if (num2==1){
            AddFolder.add_Folder();
        }
        else if (num2==2){
            DeteteFile.deleteIt();
        }
        else if (num2==3){
            MatchFile.match_File();
        }
        else if (num2==4){
            fileHandlingdemo.main_cases();
        }
        else if (num2==5){
            System.out.println("Program Terminated Successfully");
        }
        else{
            case_is(num);
        }
    }
}
