package FirstProgram;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            String password = prompt ("input password");
            String validpPassword = "password";

            //jika password benar maka selamat datang Bang
            // jika password salah maka error message
            if (password.equals(validpPassword)){
                System.out.println("Selamat Datang Bang!!");
            } else {
                System.out.println("Password Salah Coba Lagi!!");
            }
            System.out.println("Terimakasih telah menggunakan sistem kami!");
        }
    }

    private static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
