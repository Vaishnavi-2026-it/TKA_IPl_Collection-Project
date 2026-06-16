package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class Ipl_Dao {
	private List<Player> ipl_db = null;
	
	public List<Player> getAllPlayer(){
	
		ipl_db = new ArrayList<>();
		
		// RCB

	    ipl_db.add(new Player(1, "Virat Kohli", 741, 0, "RCB"));
	    ipl_db.add(new Player(2, "Rajat Patidar", 395, 0, "RCB"));
	    ipl_db.add(new Player(3, "Phil Salt", 350, 0, "RCB"));
	    ipl_db.add(new Player(4, "Liam Livingstone", 250, 5, "RCB"));
	    ipl_db.add(new Player(5, "Jitesh Sharma", 300, 0, "RCB"));
	    ipl_db.add(new Player(6, "Tim David", 220, 0, "RCB"));
	    ipl_db.add(new Player(7, "Krunal Pandya", 180, 12, "RCB"));
	    ipl_db.add(new Player(8, "Bhuvneshwar Kumar", 50, 15, "RCB"));
	    ipl_db.add(new Player(9, "Josh Hazlewood", 20, 18, "RCB"));
	    ipl_db.add(new Player(10, "Yash Dayal", 15, 14, "RCB"));
	    ipl_db.add(new Player(11, "Suyash Sharma", 10, 11, "RCB"));

	    // GT
	    ipl_db.add(new Player(12, "Shubman Gill", 890, 0, "GT"));
	    ipl_db.add(new Player(13, "Sai Sudharsan", 650, 0, "GT"));
	    ipl_db.add(new Player(14, "Jos Buttler", 500, 0, "GT"));
	    ipl_db.add(new Player(15, "Rahul Tewatia", 250, 3, "GT"));
	    ipl_db.add(new Player(16, "Shahrukh Khan", 180, 0, "GT"));
	    ipl_db.add(new Player(17, "Washington Sundar", 150, 8, "GT"));
	    ipl_db.add(new Player(18, "Rashid Khan", 120, 22, "GT"));
	    ipl_db.add(new Player(19, "Mohammed Siraj", 30, 19, "GT"));
	    ipl_db.add(new Player(20, "Prasidh Krishna", 10, 17, "GT"));
	    ipl_db.add(new Player(21, "Sai Kishore", 25, 14, "GT"));
	    ipl_db.add(new Player(22, "Gerald Coetzee", 20, 12, "GT"));

	    // KKR
	    ipl_db.add(new Player(23, "Ajinkya Rahane", 450, 0, "KKR"));
	    ipl_db.add(new Player(24, "Sunil Narine", 350, 18, "KKR"));
	    ipl_db.add(new Player(25, "Quinton de Kock", 500, 0, "KKR"));
	    ipl_db.add(new Player(26, "Venkatesh Iyer", 420, 2, "KKR"));
	    ipl_db.add(new Player(27, "Rinku Singh", 390, 0, "KKR"));
	    ipl_db.add(new Player(28, "Andre Russell", 310, 15, "KKR"));
	    ipl_db.add(new Player(29, "Ramandeep Singh", 170, 1, "KKR"));
	    ipl_db.add(new Player(30, "Harshit Rana", 20, 16, "KKR"));
	    ipl_db.add(new Player(31, "Varun Chakravarthy", 15, 21, "KKR"));
	    ipl_db.add(new Player(32, "Anrich Nortje", 10, 13, "KKR"));
	    ipl_db.add(new Player(33, "Moeen Ali", 200, 6, "KKR"));

	    // RR
	    ipl_db.add(new Player(34, "Sanju Samson", 530, 0, "RR"));
	    ipl_db.add(new Player(35, "Yashasvi Jaiswal", 625, 0, "RR"));
	    ipl_db.add(new Player(36, "Riyan Parag", 575, 4, "RR"));
	    ipl_db.add(new Player(37, "Shimron Hetmyer", 280, 0, "RR"));
	    ipl_db.add(new Player(38, "Dhruv Jurel", 310, 0, "RR"));
	    ipl_db.add(new Player(39, "Nitish Rana", 340, 2, "RR"));
	    ipl_db.add(new Player(40, "Wanindu Hasaranga", 150, 17, "RR"));
	    ipl_db.add(new Player(41, "Jofra Archer", 40, 16, "RR"));
	    ipl_db.add(new Player(42, "Sandeep Sharma", 20, 14, "RR"));
	    ipl_db.add(new Player(43, "Maheesh Theekshana", 15, 13, "RR"));
	    ipl_db.add(new Player(44, "Tushar Deshpande", 10, 12, "RR"));

		
		return ipl_db;
	}
}
