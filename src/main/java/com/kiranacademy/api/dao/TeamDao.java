package com.kiranacademy.api.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiranacademy.api.entity.Team;



@Repository
public class TeamDao {

	@Autowired
	SessionFactory sf;
	
	public List<Team> getAllPlayer() {
		
		Session session =  sf.openSession();
		Criteria criteria = session.createCriteria(Team.class);
		List <Team> team = criteria.list();
		session.close();
		return team;
	}

	public boolean insertPlayer(Team team) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(team);
		session.save(team);
		tr.commit();
		session.close();
		return true;
	}

	public Team getPlayerByID(int age) {
		
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Team player = session.get(Team.class, age);
		session.close();
		return player;
	}

	
}
