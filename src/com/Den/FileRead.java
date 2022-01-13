package com.Den;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * FileRead Class reads file using the filepath parameter
 */
public class FileRead{
    /**
     * This will store contents from the file
     */
    StringBuffer fileContent = new StringBuffer();

    /**
     * The constructor assigns filePath string to class filepath
     * @param filePath location of the file
     */
    protected FileRead(String filePath)throws FileNotFoundException {
        // Initialize the File class
        File file = new File(filePath);

        // Initialize the Scanner instance
        Scanner scanner = new Scanner(file);

        // Loop over if there is still contents in the file
        while (scanner.hasNext()){
            this.fileContent.append(scanner.next());
        }

    }
    @Override
    public String toString(){
        return String.valueOf(this.fileContent);
    }
}
