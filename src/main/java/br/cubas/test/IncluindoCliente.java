package br.cubas.test;

import java.util.Date;

import br.cubas.model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/5/19 3:03 PM
 */
public class IncluindoCliente {

    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session s = sessionFactory.openSession();

        Cliente cliente = new Cliente();
        cliente.setNome("napoleao bonaparte");
        cliente.setDataNascimento(new Date());
        cliente.setEndereco("bauru");

        Transaction t = s.beginTransaction();
        s.save(cliente);
        t.commit();
    }

}
