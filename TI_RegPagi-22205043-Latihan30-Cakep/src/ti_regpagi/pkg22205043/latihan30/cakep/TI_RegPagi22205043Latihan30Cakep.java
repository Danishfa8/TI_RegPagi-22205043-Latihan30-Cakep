/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan30.cakep;

import java.util.Scanner;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk menanyakan apakah author mengerjakan sendiri atau tidak
 */
public class TI_RegPagi22205043Latihan30Cakep {
    
    public static void main(String[] args) {
        final String hurufHitam = "\u001B[30m";
        final String hurufMerah = "\u001B[31m";
        final String hurufHijau = "\u001B[32m";
        final String hurufKuning = "\u001B[33m";
        final String hurufBiru = "\u001B[34m";
        final String hurufUngu = "\u001B[35m";
        final String hurufCyan = "\u001B[36m";        
        Scanner input = new Scanner(System.in);
        System.out.print(hurufMerah + "Kamu " + hurufHijau + "ngerjain sendiri " + hurufKuning + "latihan17 sampe " + hurufBiru + "latihan 30 ini?\nJawab " + hurufMerah + "Yoi/Enggak : ");
        String jawab = input.next().toUpperCase();

        if (jawab.equals("YOI")) {
            System.out.println(hurufMerah + "Cakep bener." + hurufUngu + "Good Job");
        } else {
            System.out.println(hurufMerah + "Tetep cakep sih\n" + hurufCyan + "Sing penting paham konsepnya yee,\n" + hurufHitam + "Keep the code works dude");
        }

    }

}
