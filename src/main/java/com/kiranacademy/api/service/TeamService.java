package com.kiranacademy.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiranacademy.api.dao.TeamDao;
import com.kiranacademy.api.entity.Team;


@Service
public class TeamService {

	@Autowired
	TeamDao dao;
	public List<Team> getAllPlayer() {
		
		List<Team> team = dao.getAllPlayer();
		return team;
	}
	public boolean insertPlayer(Team team) {
		
		return dao.insertPlayer(team);
	}
	public Team getPlayerByID(int age) {
		// TODO Auto-generated method stub
		
		return dao.getPlayerByID(age);
	}

}
