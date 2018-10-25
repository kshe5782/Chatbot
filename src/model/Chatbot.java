package model;

import java.util.ArrayList;



public class Chatbot
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

	public ArrayList<String> getresponselist(ArrayList<String> responselist)
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
		responselist.add("heyy, we don't really talk but tbh would rate 6/10");
		responselist.add("Have you ever commited to tax fraud?");
		responselist.add("Do you play Angry Birds Rio?");
		responselist.add("Wanna commit tax fraud?");
		responselist.add("I don't feel so good Mr.Stark");
		responselist.add("Man does tax evasion sound good right now!");
		responselist.add("Committing federal crimes with you is fun. Thanos Fraud Thanos Fraud!");
		responselist.add("We just commited tax fraud EASY SQUAD VICTORY ROYALE NOT CLICKBAIT!!!");
		responselist.add("you ever just hit a stanky tax fraud?");
		responselist.add("I like tax fraud too!");
		responselist.add("Listen I don't talk politics. Let's change the subject... how bout tax fraud?");
		
		
		
		spookylist.add("Boo...Boo...Thanos Halloween Thanos Halloween!!!!!");
		spookylist.add("Look behind you... there's a.... there's a...a a CWEEPER!");
		spookylist.add("Spooky tax fraud");
		spookylist.add("Everyone.On October 31st this year we should all go to people's doors and ask for Fortnite candy. The look on their face will be awesome");
		spookylist.add("It's spooky season BOIZ!");
		spookylist.add("In the mornin' I'm makin pumpkin waffles");
		spookylist.add("Happy Halloween!");
		spookylist.add("Sticks and stones will break my spooky bones, but not if I find my calcuim");
		spookylist.add("Calcium time");
	}
	public String bottomText(String userText)
	{
		String output = "";
		
		output += ("You said: " + userText);
		
		return output;
	}
public boolean legitimacyChecker(String input)
{
boolean isValid = true;
if(input==null);
{
isValid = false;
}
if(input.length() < 2)
{
	isValid = false;
}
else if(input.contains("asdf") || input.contains("palsjdd"))
{
	isValid = false;
}
return isValid;
}
}