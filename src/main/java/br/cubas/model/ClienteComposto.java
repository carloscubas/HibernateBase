package br.cubas.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/7/19 2:31 PM
 */
@Entity
public class ClienteComposto {

    @EmbeddedId
    private ClientePk id;

    public ClientePk getId() {
        return id;
    }

    public void setId(ClientePk id) {
        this.id = id;
    }

}