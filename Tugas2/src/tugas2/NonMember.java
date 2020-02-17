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
public class NonMember extends Dealer {
    NonMember() {
        this.harga=harga;
        setDiskon(2000000);
    } 
    
    void hargaDiskon() {
        harga -= 2000000;
    }
}
