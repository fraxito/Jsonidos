/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Arrays;

/**
 *
 * @author JORGE_HP
 */
public class Examen {
private int[] lista = {10, 20, 30, 40, 50};

public void misterio(int[] _lista){
    int tmp = _lista[_lista.length -1];
    for (int i=1; i <_lista.length; i++){
        _lista[i] = lista[i-1];
    }
    _lista[0] = tmp;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Examen e = new Examen();
        e.misterio(e.lista);
        
        System.out.println(Arrays.toString(e.lista));
    }
    
}
