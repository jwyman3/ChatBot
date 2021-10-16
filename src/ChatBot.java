/**
 * @author Jacob Wyman
 * N01430059
 * @date 2/7/2020
 * 
 * This is the ChatBot class. It is used in main to make ChatBot objects.
 * 
 * 
 *
 */


public class ChatBot {
	
	Memory mem = new Memory();
	
	public ChatBot() {
		mem.setName("Birtha");
		mem.setFavoriteHobby("Birthin Babies");
		mem.setFavoriteDOTW("Viernes");
		mem.setQuirk("I dont know nothing about birthing no babies");
		mem.setHeight(7);
		mem.setWeight(250);
	}
	


	public String interact(String userMessage) {
		replyHello();
		replyName(mem.getName());
		replyFavoriteThings(mem.getFavoriteHobby());
		replyQuirk(mem.getQuirk());
		replyAskAboutUser();
		
		return null;
	}
	
	
	private void replyHello() {
		System.out.println("Hello!");
		return;
	}
	
	private void replyName(String name) {
		System.out.println("My name is " + name );
		return;
	}
	
	private void replyFavoriteThings(String favoriteHobby) {
		System.out.println("My favorite thing to do is " + favoriteHobby);
		return;
	}
	
	private void replyQuirk(String quirk) {
	System.out.println("Im quirky! " + quirk);
		return;
	}
	
	private void replyAskAboutUser() {
		System.out.println("What about you? What is your favorite hobby?");
		return;
	}
	

}
