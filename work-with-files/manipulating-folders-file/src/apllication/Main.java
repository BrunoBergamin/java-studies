package apllication;

import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.printf("Directory creat successfully: " + success);


        sc.close();
    }
}