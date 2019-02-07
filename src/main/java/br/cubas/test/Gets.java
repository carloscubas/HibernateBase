package br.cubas.test;

import br.cubas.model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author s2it_csilva
 * @version $Revision: $<br/>
 * $Id: $
 * @since 2/7/19 2:16 PM
 */
public class Gets {

    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry =
                new ServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .buildServiceRegistry();
        SessionFactory sessionFactory =
                configuration.buildSessionFactory(serviceRegistry);

        Session s = sessionFactory.openSession();

        Cliente cliente = (Cliente) s.get(Cliente.class, 20000l);
        if(cliente != null){
            System.out.println("O cliente existe");
        }else{
            System.out.println("O cliente não existe");
        }

    }

}
