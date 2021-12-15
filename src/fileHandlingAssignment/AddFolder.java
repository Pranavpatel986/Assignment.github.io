package fileHandlingAssignment;

import java.io.File;
import java.util.Scanner;

public class AddFolder {
    public static void add_Folder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder name :");
        String folder_name = sc.nextLine();
        File f = new File("D:\\main\\"+folder_name);
        if(f.exists()){
            System.out.println("Folder Already Exist");
            System.out.println("Name somthing else");
            add_Folder();
        }
        else {
            String Folder_to_add = "D:\\main\\" + folder_name;
            File folder1 = new File(Folder_to_add);
            folder1.mkdirs();
            if (folder1.exists()){
                System.out.println("Folder Created Successfully");
            }else {
                System.out.println("folder not created");
            }
        }
    }

    public static void main(String[] args) {
        add_Folder();
    }
}
