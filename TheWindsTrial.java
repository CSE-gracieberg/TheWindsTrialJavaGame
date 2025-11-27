//Gracie Bergmann
//Homework 2:Choose Your Own Adventure

import java.util.Scanner;
import java.util.Random;

public class TheWindsTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner for user input
		Scanner key = new Scanner(System.in);
		
		//introduction and game setup
		System.out.println("				THE WIND'S TRIAL");
		System.out.println("THE WIND: I am the wind. I see all and protect all. I will guide you through your journey today. Things are not always as they seem. \nTo begin your journey into the forest you must prove yourself. Remember, kindness wins here. Have fun!");
		System.out.println("THE WIND: Hello there traveler! Welcome to the enchanted forest. I'm sorry about the mess, the creatures have been kind of... out of balance.");
		System.out.println("THE WIND: Oh. Silly me, I haven't even asked for your name. What shall I call you?");
		String name = key.nextLine();
		System.out.println("THE WIND: It is very nice to meet you "+name+ "! Now, I can't see very well what kind of creature are you? \nEnter \"Fairy\", \"Witch\", or \"Human\"");
		String response = key.nextLine(); //user gets to chose their character
		
		//fairy story line
		
		if (response.equalsIgnoreCase("Fairy")) //string comparison
{
		System.out.println("THE WIND: My my,that does make sense! Now since you're a fairy you can absorb a power. I have these potions you could drink to gain a power.\n I have one for fire powers and one for ice. One may be a bit more dangerous than the other in \n this forest. \n(Enter: \"Fire\" or \"Ice\")");
		 response = key.nextLine(); // user gets to chose powers
		System.out.println("THE WIND: Oh wow. Go ahead try out your new powers" +name+ "!"); 
		//fire will end story
		if(response.equalsIgnoreCase("Fire")) 
		{
			System.out.println("*you try to start a small flame in your hand, but you're much stronger than expected. You hit a tree.*");
			System.out.println("THE WIND: Oh no!! You're catching the trees on fire. Please leave the forest while I clean up this mess.");
			System.exit(0);
			//ending1
		}
			else if(response.equalsIgnoreCase("Ice"))
			{
			System.out.println("*You try to freeze a leaf mid-air, but miss. You hit a small bunny instead.*");
			System.out.println("THE WIND: Uhoh! Try to help me unfreeze to poor rabbit. \n(Enter \"Okay\" to help or \"No\" to leave)"); //user decides to help or leave
			response = key.nextLine();
			if(response.equalsIgnoreCase("Okay"))
			{
				System.out.println("*You help to unfreeze the rabbit by melting the icecube near the hot spring*");
				System.out.println("THE WIND: Thank you so much! The bunnies are offering you a gift for your adventures! Safe travels " +name+ "!");
				System.exit(0);
				// ending 2
			}
				else if(response.equalsIgnoreCase("No"))
				{
				System.out.println("THE WIND: Please leave the forest!");
					System.exit(0);
					//ending 3
				}
			}
		
}
		
		 //witch story line
		else if(response.equalsIgnoreCase("Witch")) 
	{
			System.out.println("THE WIND: Ah yes, I should have sensed your great power. Although, I can't quite tell how you'll treat your stay. \nAre you an Evil Witch or a Good Witch? (Enter \"Evil\" or \"Good\")"); //user chooses between evil or good witch
			response = key.nextLine();
			if(response.equalsIgnoreCase("Evil"))
				//evil will end the game
			{
				System.out.println("THE WIND: Oh. Oh no. I am afraid you're not welcome here.");
				System.out.println("*You attempt to argue, but you can't really fight the wind. You are pushed back out of the forest.*");
				System.exit(0);
				//Ending 9
			}
			else if(response.equalsIgnoreCase("Good"))
			{
				System.out.println("THE WIND: I have met few witches who claim to be on the side of good." +name+", I hope you serve this forest well!"
						+ "\n Hmm... You seem very powerful, do you think you could help heal this troll.");
				System.out.println("*You examine the troll. He is smelly and is growling. (Enter \"Heal\" or \"Leave\")");
				response = key.nextLine(); //user chooses to heal the troll or leave the forest
				if(response.equalsIgnoreCase("Heal"))
				{
					System.out.println("THE WIND: Oh! How perfect!");
					System.out.println("*You start brewing a potion and feed it to the troll* He grunts gratefully.*)");
					System.out.println("THE WIND: Oh, he wants to show you something!");
					System.out.println("*The troll begins to lead to into the forest. You end up at a river, but not just any river, there seems to be a barrier around it.*");
					System.out.println("THE WIND: He is offering you a protected base while you coninue your journey. Consider yourself lucky. I hope it serves you well, safe travels " +name+ "!");
					System.exit(0);
					//ending 10
				}
				else if(response.equalsIgnoreCase("Leave"))
					//leave will end the game
				{
					System.out.println("THE WIND: Oh, you seem to be no help at all. Maybe reconsider if you are truly evil?");
					System.exit(0);
				}
				
			}
	}
		
		//human story line
		else if (response.equalsIgnoreCase("Human")) 
{
				System.out.println("THE WIND: Hello... human named "+name+ ". You must be either really smart or rather brave to be venturing out into this forest.");
			int multiplicationAnswer = 82075;
				System.out.println("THE WIND: Hmm... I think I know how to figure out of youre up to this! I will make you solve a math problem! Now, tell me, what is 1225*67?");
				//user has to solve math problems correctly to move forward
			int multiply = key.nextInt();
			//compound boolean 
			//getting questions incorrect will end the game
		if(multiply < multiplicationAnswer || multiply > multiplicationAnswer)
		{
			System.out.println("THE WIND: That was incorrect. You do not have what it takes to go on this journey. You must go explore the village and improve your skills.");
			System.exit(0);
			//ending 4
		}
		else
			System.out.println("THE WIND: That was correct! But anyone could have gotten that right. How about 1722 divided 123?");
			int divisionAnswer = 14;
			int divide= key.nextInt();
			//number comparison? 
			if(divide > divisionAnswer || divide < divisionAnswer)
			{
				System.out.println("THE WIND: That was incorrect. You do not have what it takes to go on this journey. You must go explore the village and improve your skills.");
				System.exit(0);
				//ending 5
			}
			else
			{
				System.out.println("THE WIND: Wow "+name+ "! you are really smart. You may proceed into the forest. But I warn you it is rather dangerous. Oh! How about this?");
				key.nextLine();
				System.out.println("I will give you either a knife or a sandwich for your journey! Which would you like to chose? \nEnter \"Knife\" or \"Sandwich\""); //user chooses between weapon or food
			response = key.nextLine();
			if(response.equalsIgnoreCase("Knife"))
				//knife will end the game
			{
				System.out.println("THE WIND: Ah, yes. Protection is key to survival here you would think.");
				System.out.println("*You examine the knife and practice using it by taking quick stabs at the air.*");
				System.out.println("THE WIND: Oh my what is that in the bush?? OH! It's a baby dragon!!");
				System.out.println("*The baby dragon steps out of the bush and comes up to you. He sees your knife and runs into the bush.*");
				System.out.println("THE WIND: Be careful with that, lots of creatures see weapons as a sign of danger. It would be best to keep it away untill needed.");
				System.out.println("*The baby dragon comes back but is followed by the Dragon Queen. She sees your weapon and charges at you, scooping you from the ground*");
				System.out.println("THE WIND: Oh no! What a shame, I probably should not have offered the knife.");
				System.exit(0);
				//ending 6
			}
			else if(response.equalsIgnoreCase("Sandwich"))
			{
				System.out.println("THE WIND: Ah, yes. Food is always a great thing to have when traveling.");
				System.out.println("*You check out the sandwich. It's turkey, your favorite. Suddenly a small shuffling comes from a bush.*");
				System.out.println("THE WIND: What could that be?? Oh! it's a dragon!");
				System.out.println("*The dragon seems particularly interest in your sandwich*");
				System.out.println("THE WIND: He seems hungry? Share you sandwich? \nEnter \"Share\" or \"Keep\""); //user chooses to share sandwich or keep it
				response = key.nextLine();
						if(response.equalsIgnoreCase("Keep"))
							//keep will end the game
						{
							System.out.println("*The dragon is not very happy. He bites you. You decide to go back to the village for a medic*");
							System.exit(0);
							//ending 7
						}
						else if(response.equalsIgnoreCase("Share"))
						{
							System.out.println("*The dragon takes a large bite. He pulls the whole sandwich out of your hand and runs away*");
							System.out.println("THE WIND: Ha. That was very kind of you, unfortunatly "+name+ "that's the only one I had");
							System.out.println("*You hear rustling again, but much louder. Suddenly the Dragon Queen emerges. She growls, but does not seem to mean any harm*");
							System.out.println("THE WIND: She says thank you! And because of your kindness, she will be your protecter on this journey. Speaking of which, you should probably start heading out!");
							System.out.println("*You begin to explore the village and the Dragon Queen treads behind in case of danger.*");
							System.exit(0);
							//ending 8
						}
			}
}
	
}
		 else {
			    // 
			    System.out.println("THE WIND: That is not a valid choice. Please restart the game.");
			    System.exit(0);
			}
	
	
		}
	}
		
		
		
		
		
		
		
		
	
		
	


