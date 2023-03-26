import java.util.Scanner;
public class Student {

    private String nazwisko;
    private int wiek;
    private double ocena1;
    private double ocena2;

    public Student(){
    nazwisko = "Maciejewski";
    wiek = 25;
    ocena1 = 5;
    ocena2 = 4;
    }

    public void srednia(){
        double srednia=0;
        srednia = (ocena1+ocena2)/2;
        System.out.println(srednia);
    }

    public void wypisz(){
        System.out.println(nazwisko + wiek + ocena1 + ocena2);
        srednia();
    }
    public void setOcena(){

    }
    public void wprowadzanie(){

    }


}
