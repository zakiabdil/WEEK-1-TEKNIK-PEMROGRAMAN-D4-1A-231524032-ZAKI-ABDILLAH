/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testing.soal1;

/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Soal1
{
   public static void main(String[] args)
   {
        byte angka1 = 125;
        byte angka2 = 6; 
        byte hasil = (byte)/*penambahan dalam bentuk Byte*/ (angka1+angka2);/*Hasil dari program diatas adalah -125 karena byte adalah satuan dari    -128 sampai 127 (Core Java Volume I--Fundamentals, 10th Edition Page 47)*/
        System.out.println("Hasil 1 : "+hasil);
   }
}

