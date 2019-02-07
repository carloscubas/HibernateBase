package br.cubas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/5/19 2:59 PM
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private Long idCliente;

    private String nome;

    private String endereco;

    @Lob
    private String obs;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private String email;

    public Long getIdCliente () {
        return idCliente;
    }

    public void setIdCliente (final Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (final String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento () {
        return dataNascimento;
    }

    public void setDataNascimento (final Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getObs () {
        return obs;
    }

    public void setObs (final String obs) {
        this.obs = obs;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (final String email) {
        this.email = email;
    }
}
