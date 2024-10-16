import java.util.Scanner;
public class Student {
	public String ad;
    public String soyad;
    public int not;

    public Student(String ad, String soyad, int not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not =not;
    }
    
    public void setAd(String ad) {
        this.ad= ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setdersOrtalama(int not) {
        this.not = not;
    }

   
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNot() {
        return not;
    }
    
    public String getHarfNotu() {
    	if (not >= 90 && not <= 100) {
            return "A";
        } else if (not >= 80 && not < 90) {
            return "B";
        } else if (not >= 70 && not < 80) {
            return "C";
        } else if (not >= 60 && not < 70) {
            return "D";
        } else if (not >= 0 && not < 60) {
            return "F";
        } else {
            return "Geçerli bir not girin";
        }
    	
    }
    
    public void show() {
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ders Ortalaması: " + not);
        System.out.println("Harf Notu: " + getHarfNotu());}
       
    


    
    

       

}
