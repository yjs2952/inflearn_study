package com.study.inflearn.jpaexample;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account ac = new Account();
        ac.setUsername("jason");
        ac.setPassword("jpa");

        Session session = entityManager.unwrap(Session.class);
        session.save(ac);

        entityManager.persist(ac);
    }
}
