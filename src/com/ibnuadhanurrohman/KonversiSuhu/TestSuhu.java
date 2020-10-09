package com.ibnuadhanurrohman.KonversiSuhu;

import java.util.Scanner;

public class TestSuhu {
    static double CelciustoFahreinheit(double Celcius) {//method mengubah celcius ke fahreinheit
        return (Celcius * 9 / 5) + 32;
    }
    static double FahreinheittoKelvin(double Fahreinheit) {//method mengubah fahreinheit ke kelvin
        return (Fahreinheit - 32) * 5 / 9 + 273;
    }
    static double KelvintoReamur(double Kelvin) {//method mengubah kelvin ke reamur
        return (Kelvin - 273) * 4 / 5;
    }
    static double ReamurtoCelcius(double Reamur) {//method mengubah reamur ke celcius
        return (Reamur * 5/4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Suhu");
        System.out.print("Celcius\t : ");
        double num1 = scanner.nextDouble();
        System.out.print("Fahreinheit\t : ");
        double num2 = scanner.nextDouble();
        System.out.print("Kelvin\t : ");
        double num3 = scanner.nextDouble();
        System.out.print("Reamur\t : ");
        double num4 = scanner.nextDouble();
        System.out.println();
        System.out.println("---Konversi Suhu---");
        System.out.println("Celcius to Fahreinheit\t : " + CelciustoFahreinheit(num1) + " F");
        System.out.println("Fahreinheit to Kelvin\t : " + FahreinheittoKelvin(num2) + " K");
        System.out.println("Kelvin to Reamur\t : " + KelvintoReamur(num3) + " R");
        System.out.println("Reamur to Celcius\t : " + ReamurtoCelcius(num4) + " C");
    }
}
