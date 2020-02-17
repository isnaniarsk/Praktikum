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
public class Member extends Dealer {
    Member() {
        this.harga=harga;
        setDiskon(4000000);
    }   
    
    void hargaDiskon() {
        harga -= 4000000;
    }
}
