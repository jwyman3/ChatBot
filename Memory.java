/*
 * N01430059
 * Jacob Wyman
 * 
 * This is the memory class. It sets up the framework to make a memory object for the ChatBot class.
 */


public class Memory{

	String name;
	String favoriteHobby;
	String favoriteDOTW;
	String quirk;
	double height;
	double weight;
	
	public String setName(String name) {
		this.name = name;
		return name;
	};
	
	public String getName() {
		
		return name;
	}
	
	public String setFavoriteHobby(String favoriteHobby){
		this.favoriteHobby = favoriteHobby;
		return favoriteHobby;
	}
	
	public String getFavoriteHobby(){
		return favoriteHobby;
	}
	
	public  String setFavoriteDOTW(String favoriteDOTW) {
		this.favoriteDOTW = favoriteDOTW;
		return favoriteDOTW;
	}
	
	public String getFavoriteDOTW() {
		
		return favoriteDOTW;
	}
	
	public String setQuirk(String quirk) {
		this.quirk = quirk;
		return quirk;
	}
	
	public String getQuirk() {
		return quirk;
	}
	
	public double setHeight(double height) {
		this.height = height;
		return height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double setWeight(double weight) {
		this.weight = weight;
		return weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}
