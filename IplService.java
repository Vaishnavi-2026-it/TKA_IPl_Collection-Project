package com.tka.service;

import java.util.List;

import com.tka.dao.Ipl_Dao;
import com.tka.entity.Player;

public class IplService {

	private List<Player> ipl_db = null;
	private Ipl_Dao ipldao= null;
	
	public List<Player> getAllPlayer(){
		
		ipldao = new Ipl_Dao();
		
		ipl_db = ipldao.getAllPlayer();
		return ipl_db;
		
	}
}
