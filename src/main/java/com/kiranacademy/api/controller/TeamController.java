package com.kiranacademy.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiranacademy.api.entity.Team;
import com.kiranacademy.api.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	TeamService tm;
	
	@GetMapping("/all")
	public List<Team> getAllPlayer() {
		
		List<Team> team =tm.getAllPlayer();
		return team;
		
		
}
	@PostMapping("add")
	public boolean insertPlayer(@RequestBody Team team) {
	boolean inserted = tm.insertPlayer(team);
	return inserted;
	}
	
	@GetMapping("player/{age}")
	Team getPlayerByID(@PathVariable int age) {
		Team player = tm.getPlayerByID(age);
		return player;
}}