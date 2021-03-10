/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author SOFT1
 */
public class Array {
    public static void main(String args[]) {
        String[] nama = {"Adi", "Agil", "Aldi", "Almaas", "Angga"};
        System.out.println(nama[0]);
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama dengan index ke "+i+" : "+nama[i]);
        }
    }
}
