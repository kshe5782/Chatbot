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

public MyModel()
{
	
}

public MyModel(String currentUser)
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

{
	this.joke = "Thanos Joke Thanos Joke";
	this.currentUser = new String("Registered Nurse");
	this.content = new String("Bottom Text");
	
	this.responselist = new ArrayList<String>();
	this.spookylist = new ArrayList<String>();

buildalist();
}
private void buildalist()
{
responselist.add("heyy, we don't really talk but rate 6/10");	
responselist.add("Have you ever commited to tax fraud?");
responselist.add("Do you play Angry Birds Rio?");
responselist.add("Wanna commit tax fraud?");
responselist.add("I don't feel so good Mr.Stark");
responselist.add("Man does tax evasion sound good right now!");

}
}