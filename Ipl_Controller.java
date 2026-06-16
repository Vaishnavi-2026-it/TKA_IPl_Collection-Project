package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IplService;

public class Ipl_Controller {

    public static void main(String[] args) {

        IplService iplservice = new IplService();

        List<Player> allPlayers = iplservice.getAllPlayer();

        for(Player p : allPlayers) {

            System.out.println("Jersey No : " + p.getJn());
            System.out.println("Player Name : " + p.getPname());
            System.out.println("Runs : " + p.getRuns());
            System.out.println("Wickets : " + p.getWickets());
            System.out.println("Team : " + p.getTname());

            System.out.println("------------------------");
        }
        }
    }
