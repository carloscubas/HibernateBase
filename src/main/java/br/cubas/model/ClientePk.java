package br.cubas.model;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/7/19 2:29 PM
 */
import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ClientePk implements Serializable {

    private static final long serialVersionUID = 1L;

    public ClientePk(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    private String rg;

    private String cpf;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}