package fileHandlingAssignment;

import java.io.File;
import java.util.Scanner;

public class DeteteFile {
    public static void deleteIt(){

    System.out.println("Enter folder name :");
        Scanner sc=new Scanner(System.in);
        String file = sc.nextLine();
    File fol = new File("D:\\main\\" + file);
        if (fol.exists()){
            try {
                fol.delete();
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        else {
            System.out.println("File not Exist");
        }
    }
}
