package com.springboot.Cricket1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.Cricket1.entity.Cricket;

@Repository
public class CricketDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Cricket> getAllStaffInfo()
	{
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Cricket.class);
		List<Cricket> getAllInfo = criteria.list();
		
		return getAllInfo;
	}
//	public void insertCricketStaffDetails(Cricket staff)
//	{
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(staff);
//		tx.commit();
//		
//	}

	public void insertCricketStaffDetails(Cricket staff) {
		// TODO Auto-generated method stub
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(staff);
		tx.commit();
	}

	public void updateCricketStaffDetails(Cricket staff) {
		// TODO Auto-generated method stub
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(staff);
		tx.commit();
	}
	
}
