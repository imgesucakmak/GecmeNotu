import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad1 = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad1 = scanner.nextLine();

        int not1;
        while (true) {
            System.out.print("Ders ortalamanızı girin (0-100 arası): ");
            not1 = scanner.nextInt();
            if (not1 >= 0 && not1 <= 100) {
                break;
            } else {
                System.out.println("Geçersiz not. Lütfen 0-100 aralığında bir not girin.");
            }
        }

        Student student1 = new Student(ad1, soyad1);
        student1.setNot(not1);

        
        scanner.nextLine(); 

        System.out.print("Adınızı girin: ");
        String ad2 = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad2 = scanner.nextLine();

        int not2;
        while (true) {
            System.out.print("Ders ortalamanızı girin (0-100 arası): ");
            not2 = scanner.nextInt();
            if (not2 >= 0 && not2 <= 100) {
                break;
            } else {
                System.out.println("Geçersiz not. Lütfen 0-100 aralığında bir not girin.");
            }
        }

        Student student2 = new Student(ad2, soyad2);
        student2.setNot(not2);

        
        student1.show();
        student2.show();

        scanner.close();
    }
}
