/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lecture08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class PaisesBean {
    
    private List<String> paises;

    public PaisesBean() {
        paises = new ArrayList<>();
        
        paises.add("COLOMBIA");
        paises.add("BRASIL");
        paises.add("VENEZUELA");
        paises.add("ECUADOR");
        paises.add("PANAMA");
    }

    public List<String> getPaises() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
    }
    
}
