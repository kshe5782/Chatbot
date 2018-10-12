package model;

import java.util.ArrayList;

import java.swing.JOtionPane;

public class MyModel
{
	private String currentUser;
	private String joke;
	private String content;
	private ArrayList<String> spookylist;
	private ArrayList<String> responselist;

public Chatbot()
{
	
}

public Chatbot(String currentUser)
	{
		this.currentUser = currentUser;
	}

	public String askName()
	{
		String name = "";
		return name;
	}

	// getters and dem setters
	public String getCurrentUser(String currentUser)
	{
		return this.currentUser;
	}

	public String getJoke(String joke)
	{
		return this.joke;
	}

	public String getContent(String content)
	{
		return this.content;

	}

	public ArrayList<String> getspookylist(ArrayList<String> spookylist)
	{
		return this.spookylist;
	}
public ArrayList<String> getresponslist(ArrayList<String> responslist)
{
	return this.responselist;
}