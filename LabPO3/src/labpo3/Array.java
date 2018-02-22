/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo3;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[] value;

    Array(int[] value) {
        this.value = value;
    }

    public void displayEvenElements() {
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                System.out.print(value[i] + " ");
            }
        }
        System.out.println("");
    }

    public void displayUnevenElements() {
        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 != 0) {
                System.out.print(value[i] + " ");
            }
        }
        System.out.println("");
    }

}
