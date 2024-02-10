/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testing.soal2;

/**
 *
 * @author ASUS
 */
public class Soal2 {

    public static void main(String[] args) {
        /*Soal Analisis 2*/
        int i = 39;
        String s = (i < 40)?"life":(i>50)?"Universe":"Everything";
        /*Teknik yang digunakan adalah Ternary operator yangmana
        merupakan if else dalam satu baris. kondisi pada ternary 
        operator berada pada tanda kurung dengan format (If)?Then:Else 
        dan untuk menjadikan Else if cukup tambahkan kondisi setelah titik dua. 
        program akan mengecek kondisi berdasarkan urutan. Sehingga pada kasus 
        diatas program akan pertama mengecek apakah “i < 40”. karena 
        false, program kemudian akan mengecek apakah “I > 50”. Karena 
        false, program kemudian me-return “everything” (tidak ada kondisi/Else). 
        Maka Outputnya adalah everything.*/
        System.out.println(s);
    }
}
