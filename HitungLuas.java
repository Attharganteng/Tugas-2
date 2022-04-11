package com.Pemlan;

import java.util.Scanner;

public class HitungLuas {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();

        int pilih = in.nextInt();
        if (pilih == 1){
            persegi.sisi = in.nextDouble();
            System.out.printf("%.0f", persegi.LuasPersegi(persegi.sisi));
        }else if (pilih == 2){
            segitiga.alas = in.nextDouble();
            segitiga.tinggi = in.nextDouble();
            System.out.printf("%.0f", Math.floor(segitiga.LuasSegitiga(segitiga.alas, segitiga.tinggi)));
        }else if (pilih == 3){
            lingkaran.jari = in.nextDouble();
            lingkaran.LuasLingkaran(lingkaran.jari);
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi{
    double sisi;

    double LuasPersegi(double sisi){
        this.sisi = sisi;
        return sisi * sisi;
    }
}

class Segitiga{
    double alas;
    double tinggi;

    double LuasSegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        return 0.5 * alas * tinggi;
    }
}

class Lingkaran{
    double jari;
    double luas = 0;

    void LuasLingkaran(double jari){
        this.jari = jari;
        if (jari % 7 == 0) {
            luas = 22/7 * jari * jari;
            System.out.print(luas);
        }else if (jari % 7 != 0) {
            luas = 3.14 * jari * jari;
            System.out.printf("%.1f", Math.floor(luas));
        }
    }
}