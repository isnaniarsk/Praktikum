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
public class Dealer {
    double harga;
    private double diskon;

    Dealer() {
        harga = 20000000;
        diskon = 2000000;
        System.out.println("Harga mula-mula " + harga + " dan diskon " + diskon);
    }

    private double hitungHarga(double harga, double diskon) {
        return harga-diskon;
    }
    
    void hargaDiskon() {
        System.out.println("Diskon Member/Non Member");
    }

    void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    double getTotalHarga() {
        return hitungHarga(harga, diskon);
    }
}
