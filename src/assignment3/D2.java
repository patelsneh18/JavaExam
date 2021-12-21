package assignment3;

import java.io.*;
import java.util.Vector;

class ListOfNumbers2 {
    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
            victor.addElement(i);

        this.readList("infile.txt");
    }

    public void readList(String fileName) {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File: " + fileName + " not found.");
        } catch (IOException io) {
            System.err.println(io);
        }
    }
}

public class D2 {
    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}

