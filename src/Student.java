public class Student {
    public String ad;
    public String soyad;
    public int not = -1; // Başlangıç değeri olarak geçersiz bir not

    public Student(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void setNot(int not) {
        if (not < 0 || not > 100) {
            System.out.println("Geçerli not girin!");
            this.not = -1; // Geçersiz not
        } else {
            this.not = not;
        }
    }

    public String getHarfNotu() {
        if (not < 0 || not > 100) {
            return "Geçersiz not, harf notu hesaplanamadı.";
        }
        if (not >= 90) return "A";
        else if (not >= 80) return "B";
        else if (not >= 70) return "C";
        else if (not >= 60) return "D";
        else return "F";
    }

    public void show() {
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        if (not >= 0 && not <= 100) {
            System.out.println("Harf Notu: " + getHarfNotu());
        } else {
            System.out.println("Geçersiz not girildi.");
        }
    }
}
