package br.cubas.test;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/7/19 1:50 PM
 */
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBanco {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();

        SchemaExport se = new SchemaExport(configuration);
        se.create(true, true);
    }
}