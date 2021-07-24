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
public class AtivComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AssBronze assBronze = new AssBronze();
        AssPrata assPrata = new AssPrata();
        AssOuro assOuro = new AssOuro();
        AssPlatina assPlatina = new AssPlatina();
        
        Composite assinatura0 = new Composite();
        Composite assinatura1 = new Composite();
        Composite assinatura2 = new Composite();
        Composite assinatura3 = new Composite();
        
        assinatura0.add(assBronze);
        assinatura1.add(assPrata);
        assinatura2.add(assOuro);
        assinatura3.add(assPlatina);
        
        System.out.println("Assinaturas: \n");
        assinatura0.print();
        assinatura1.print();
        assinatura2.print();
        assinatura3.print();
    }
    
}
