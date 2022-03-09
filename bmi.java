import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        cim("BMI index kiszámítása");
        int tomeg = beker("Testtömeg (kg) [40; 150]: ", 40, 150);
        int mag = beker("Testmagasság (cm) [100; 200]: ", 100, 200);
        double bmiIndex = bmi(tomeg, mag);
        ertekeles(tomeg, mag, bmiIndex);
    }

    private static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String szoveg, int min, int max) {
        Scanner scr = new Scanner(System.in);
        System.out.println(szoveg);
        int adat = scr.nextInt();
        return adat;
    }

    private static double bmi(int tomeg, int mag) {
        int magMeterben = mag / 100;
        double eredmeny = tomeg / Math.pow(magMeterben, 2);
        return eredmeny;
    }

    private static void ertekeles(int tomeg, int mag, double bmiIndex) {
        System.out.printf("Ön %d cm magas és d% kg tömegű, " + "így BMI indexe f%, " + "Tehát Ön túlsúlyos testalkatú",
                mag, tomeg, bmiIndex);
    }
}
