package fileHandlingAssignment;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class MatchFile {

    public static void match_File(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some String : ");
        String temp = sc.next();
//        temp.toUpperCase();
        String temp2 = temp.toUpperCase();
        File f = new File("D:\\main");
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if (name.toUpperCase().startsWith(temp2)){
                    System.out.println(name);
                }
                return name.startsWith(temp2);
            }
            
        });
       
    }
    
}
