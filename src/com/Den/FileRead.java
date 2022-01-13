package com.Den;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * FileRead Class reads file using the filepath parameter
 */
public class FileRead{
    /**
     * This will store contents from the file
     */
    private StringBuffer fileContent = new StringBuffer();

    // Path of file
    private String filePath;

    /**
     * The constructor assigns filePath string to class fileContents
     * @param filePath location of the file
     */
    protected FileRead(String filePath)throws FileNotFoundException {
        // Assign the filepath
        this.filePath = filePath;

        // Initialize the File class
        File file = new File(filePath);

        // Initialize the Scanner instance
        Scanner scanner = new Scanner(file);

        // Loop over if there is still contents in the file
        while (scanner.hasNext()){
            this.fileContent.append(scanner.next());
        }

    }

    /**
     *  This will read file while preserving newline in the contents of the file
     * @return contents split by newline
     */
    public ArrayList readPreservedNewLine() throws FileNotFoundException {

        ArrayList<String> contentsWithNewLine = new ArrayList<>();

        // Initialize the File class
        File file = new File(this.filePath);

        // Initialize the Scanner instance
        Scanner scanner = new Scanner(file);

        // Loop over if there is still contents in the file
        while (scanner.hasNextLine()) {
            // Add every newline of content in the file
            contentsWithNewLine.add(scanner.nextLine());
        }
        return contentsWithNewLine;
    }

    @Override
    public String toString(){
        return String.valueOf(this.fileContent);
    }
}
