import java.util.*;
import java.util.stream.Collectors;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;



public class main {
    public static void main(String[] args) {
//        String fileName = "C:/example/file1.txt";
//
//        String toFile = "C:/example/file2.txt";
//
//        copyFile(fileName, toFile);
        Cash cash = new Cash();
        //cash B = new cash();
        Thread A = new Thread(cash,"A");
        Thread B = new Thread(cash,"B");
        A.start();
        B.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

//    private static void copyFile(String fileName, String toFile) {
//
//    }

}



//    public static List<String> get(List<Book> book) {
//            return book.stream()
//                    .sorted(Comparator.comparing(Book::getPrice).reversed())
//                    .map(Book::getBookname)
//                    .collect(Collectors.toList());
//    }
//    public static Map<String, List<Book>> get1(List<Book> book){
//        return book.stream()
//                .collect(Collectors.groupingBy(Book::getPublish));
////                .collect(Collectors.toMap(Book::getPublish,()->));
//    }