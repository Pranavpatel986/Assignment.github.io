package fileHandlingAssignment;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class MatchFile {
	public static void main(String[] args) {
		match_File();
	}
    public static void match_File(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some String : ");
        String substring1 = sc.next();
        String substring = substring1.toUpperCase();
        File f = new File("D:\\main");
        
        List<String> filesContainingSubstring = new ArrayList<String>();

        if( f.exists() && f.isDirectory() )
        {
            String[] files = f.list(); //get the files in String format.
            for( String fileName : files )
            {
            	
                if( fileName.toUpperCase().contains( substring ) ) 
                     filesContainingSubstring.add( fileName );
            }
        }

        for( String fileName : filesContainingSubstring )
        {
           System.out.println( fileName ); //or do other operation 
        }
     }
       
}
    




