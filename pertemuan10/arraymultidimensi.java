/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class arraymultidimensi {

    public static void main(String[] args) {
        System.out.println("array satu dimensi");
        int bilangan[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i]);
        }

        System.out.println("array multidimensi");

        String mahasiswa[][] = {{"01", "Farid"}, {"02", "imtinanul"}, {"03", "amjad"}};
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[0].length; j++) {
                System.out.print(mahasiswa[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        String cari = JOptionPane.showInputDialog(null,"cari mahasiswa berdasarkan NIM");
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[0].length; j++) {
                if (mahasiswa[i][j].equals(cari)){
                    JOptionPane.showConfirmDialog(null,"mahasiswa dengan NIM " +cari + "ditemukan bernama " + mahasiswa[i][j+1]);
                }
                System.out.print(mahasiswa[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
