package com.xworkz.calamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.calamities.dto.CalamitiesDTO;


@Component
public class CalamitiesDAOImp implements CalamitiesDAO{
	
	
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void save(CalamitiesDTO dto) {
		System.out.println("Start : daoImpl");
		System.out.println("invoked save() method in daoImpl");
		System.out.println(dto);
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End : daoImpl");

		} catch (Exception e) {
			System.out.println("unable to insert");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
