import java.util.Scanner;


public class StudentTest {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

       
        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();
        
        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.nextLine();

        System.out.print("Ders ortalamanızı girin: ");
        int not = scanner.nextInt();
        
        Student student1= new Student(ad, soyad,not);
        student1.show();
        

        
      
        
       
	

}
}
