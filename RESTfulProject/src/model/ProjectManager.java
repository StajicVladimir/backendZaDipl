package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Database;

import dao.Project;
import dto.FeedObjectsHero;
import dto.FeedObjectsTerm;

public class ProjectManager {
	
	
	public ArrayList<FeedObjectsHero> GetFeeds()throws Exception {
		ArrayList<FeedObjectsHero> feeds = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				Project project= new Project();
				feeds=project.GetFeeds(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return feeds;
	}
	
	public ArrayList<FeedObjectsTerm> GetTerms()throws Exception {
		ArrayList<FeedObjectsTerm> feeds = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				Project project= new Project();
				feeds=project.GetTerms(connection);
		
		} catch (Exception e) {
			throw e;
		}
		return feeds;
	}

}
