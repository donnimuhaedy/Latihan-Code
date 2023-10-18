package FirstProgram;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Nilai Kamu :");
        int nilai = scanner.nextInt();
        String grade;

        if (true == nilai > 90) {
            grade = "A";
        } else if (true == nilai > 80) {
            grade = "B";
        } else if (true == nilai > 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade kamu adalah :" + grade);
    }
}
