/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class indexbean {
    private String dato;

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }
    
    public String validar()
    {
        if(dato.equals("1234")){
        return "principal.xhtml";
        }
        return "";
    }    
}
