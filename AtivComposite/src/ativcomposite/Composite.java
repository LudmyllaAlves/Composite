/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatia
 */
public class Composite implements Assinaturas {
    
    
    private List<Assinaturas> childAssinaturas = new ArrayList<Assinaturas>();
    
    @Override
    public void print() {
        for (Assinaturas assinatura : childAssinaturas ) {
            assinatura.print();
        }
    }
    
    public void add(Assinaturas assinatura) {
        childAssinaturas.add(assinatura);
    }
    
        public void remove(Assinaturas assinatura) {
        childAssinaturas.remove(assinatura);
    }
}

