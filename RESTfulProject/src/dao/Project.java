package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;
import dto.FeedObjectsHero;
import dto.FeedObjectsTerm;


public class Project {
	Integer a;
	
	public ArrayList<FeedObjectsHero> GetFeeds(Connection connection) throws Exception
	{
		ArrayList<FeedObjectsHero> feedData = new ArrayList<FeedObjectsHero>();
		try
		{
			//String uname = request.getParameter("uname");
			//PreparedStatement ps = connection.prepareStatement("SELECT title,name, description,url FROM website ORDER BY id DESC");
			PreparedStatement ps = connection.prepareStatement("SELECT  id, name FROM heroes ");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			//FeedObjects feedObject = new FeedObjects();
				FeedObjectsHero feedObject = new FeedObjectsHero();
				
				feedObject.setName(rs.getString("name"));
				//a = rs.getInt("id");
				
				feedObject.setId(rs.getInt("id"));
			/*feedObject.setTitle(rs.getString(1));
			feedObject.setName(rs.getString("name"));
			feedObject.setDescription(rs.getString("description"));
			feedObject.setUrl(rs.getString("url"));*/
			feedData.add(feedObject);
			}
			return feedData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public ArrayList<FeedObjectsTerm> GetTerms(Connection connection) throws Exception
	{
		ArrayList<FeedObjectsTerm> feedData = new ArrayList<FeedObjectsTerm>();
		try
		{
			//String uname = request.getParameter("uname");
			//PreparedStatement ps = connection.prepareStatement("SELECT title,name, description,url FROM website ORDER BY id DESC");
			PreparedStatement ps = connection.prepareStatement("SELECT  id, date FROM terms ");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			//FeedObjects feedObject = new FeedObjects();
				FeedObjectsTerm feedObject = new FeedObjectsTerm();
				
				feedObject.setDate(rs.getString("date"));
				//a = rs.getInt("id");
				
				feedObject.setId(rs.getInt("id"));
			/*feedObject.setTitle(rs.getString(1));
			feedObject.setName(rs.getString("name"));
			feedObject.setDescription(rs.getString("description"));
			feedObject.setUrl(rs.getString("url"));*/
			feedData.add(feedObject);
			}
			return feedData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}
