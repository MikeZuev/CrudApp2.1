package com.zuev.repositories.hibernateimpl;

import com.zuev.entities.Label;
import org.hibernate.Session;
import org.junit.Test;

public class TestHibernateLabel {
    @Test
    public void TestGetById(Long a){
        HibernateLabelRepository hibernateLabelRepository = null;

        Label newLabel = hibernateLabelRepository.getByld(1L);
        System.out.println(newLabel.toString());
    }

    @Test
    public void TestHibernateConnecton(){
        HibernateUtil hibernateUtil = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println(session.isConnected());

    }
}
