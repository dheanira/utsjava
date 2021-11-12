/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsjava;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Utsjava {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
        
        //main menu
        System.out.println("Program Java Menghitung Berat Badan Ideal");
        System.out.println("_________________________________________");
        System.out.println("Pilih Jenis Kelamin : ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("_________________________________________");
        
        // logic
        System.out.print("Masukkan Jenis Kelamin : ");
        jenis_kelamin = input.nextInt();
        System.out.print("Masukkian Berat Badan : ");
        berat = input.nextFloat();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = input.nextFloat();
        meter = tinggi/100;
        
        // rumus BMI
        bmi = (berat/(meter * meter));
        
        //cetak Berat Badan BMI
        System.out.print("BMI: " + bmi + " ");
        
        if (bmi < 17.0){
            System.out.println("Kurus, Kekurangan berat badan tingkat berat");
        } else if (bmi <= 18.4) {
            System.out.println("Kurus, Kekurangan berat badan tingkat ringan");
        } else if (bmi <= 25.0) {
            System.out.println("Normal");
        } else if (bmi <= 27.0) {
            System.out.println("Overweight, Kelebihan berat badan tingkat ringan");
        } else {
            System.out.println("Obesitas, Kelebihan berat badan tingkat berat");
        }
       
        // perhitungan dengan rumus broca
        switch (jenis_kelamin)
        {
            case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
            case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
            default : broca = 0;
        }
        
        hasil = (int) broca;
        System.out.println("Berat Badan ideal anda menurut Broca " + hasil + "kg" );       
    }
}

