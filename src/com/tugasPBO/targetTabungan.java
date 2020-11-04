package com.tugasPBO;

import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menentukan berapa lama waktu menabung hingga saldo mencapat target

public class targetTabungan {

    public int saldoAwal, target;
    public String bunga;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan saldo awal : ");
        saldoAwal = scanner.nextInt();
        System.out.print("masukkan bunga : (%)");
        bunga = scanner.next();
        System.out.print("masukkan target tabungan : ");
        target = scanner.nextInt();
    }

    public static void main(String[] args){

        targetTabungan obj = new targetTabungan();
        obj.input();
        obj.hitung(obj.saldoAwal,obj.bunga,obj.target);
    }

    public void hitung(int saldoAwal, String bunga, int target){
        double bungaString= Double.parseDouble(bunga); //ubah string ke double
        double bungaFinal = bungaString/ 100 + 1;
        int i = 1;
        while(saldoAwal < target){
            saldoAwal *= bungaFinal;
            System.out.println("saldo di bulan ke-" + i + " Rp " + saldoAwal);
            i++;
        }
    }
}
