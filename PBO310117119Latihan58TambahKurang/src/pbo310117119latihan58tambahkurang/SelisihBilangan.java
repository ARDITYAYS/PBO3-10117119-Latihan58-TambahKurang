/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan58tambahkurang;

/**
 *
 * @author Yogaputra
 */
public class SelisihBilangan extends Bilangan{

    public void tampilSelisih() {
        int z = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + z);
    }
}
