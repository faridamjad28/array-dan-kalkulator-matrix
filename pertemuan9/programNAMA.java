/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class programNAMA {
    public static void main(String[] args) {
    
        String namamhs[] = new String[5];
        for (int i=0; i<namamhs.length; i++){
            namamhs[i] = JOptionPane.showInputDialog(null, "inputkan nama mahasiswa ke " + i);
            System.out.println(namamhs[i]);
        }
        
        String carinama = JOptionPane.showInputDialog(null, "cari nama mahasiswa");
        
        for (int i=0; i<namamhs.length; i++){
            if(namamhs[i].equals(carinama)){
                JOptionPane.showMessageDialog(null, "nama yang anda cari adalah " +carinama +"ketemu pada indeks ke " + i);
            }
        }
}
}