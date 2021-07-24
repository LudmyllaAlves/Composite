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
public class AssPrata implements Assinaturas{
    
    @Override
    public void print() {
        System.out.println("Assinatura Prata");
        System.out.println("Itens: ");
        System.out.println("1 Quadrinho R$15,00");
        System.out.println("1 Chaveiro R$5,00");
        System.out.println("1 Camiseta 25,00");
        System.out.println("1 Caneta 3,00");
        System.out.println("1 Busto R$10,00");
        System.out.println("TOTAL: 50,00 \n");

    }
    
}
