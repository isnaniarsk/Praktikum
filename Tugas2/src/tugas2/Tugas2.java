/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dealer D[] = new Dealer[3];
        D[0] = new Member();
        D[1] = new NonMember();
        D[2] = new Member();
        for (int i = 0; i < 3; i++) {
            System.out.println("Harga Motor untuk Customer " + i + " adalah " + D[i].getTotalHarga());
        }
        for (int i = 0; i < 3; i++) {
            D[i].hargaDiskon();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Harga Motor untuk Customer "+ i + " sekarang adalah "
                    + D[i].getTotalHarga());
        }
    }
    
}
