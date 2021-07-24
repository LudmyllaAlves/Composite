/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

/**
 *
 * @author tatia
 */
public class AssBronze implements Assinaturas {
    
    @Override
    public void print(){
        System.out.println("Assinatura Bronze");
        System.out.println("Itens: ");
        System.out.println("1 Adesivo R$1,00");
        System.out.println("1 Busto R$10,00");
        System.out.println("1 Camiseta R$25,00");
        System.out.println("TOTAL: 35,00 \n");

    }
    
    
}
