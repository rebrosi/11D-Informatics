package uti;

public class CD extends Product{
	private String artist;
	private int numberOfSongs;
	private String label;
	 
	CD(int itemNumber, String name, int qtyInStock, double price,
			String artist, int numberOfSongs, String label){
		super(itemNumber, name, qtyInStock, price);
	}
	public String toString()
	{
	     return "\n\nItem Number      : " + super.getItemNumber() 
	   			+ "\nName             : " + super.getName()
	   			+ "\nArtist           : " + getArtist()
	   			+ "\nSongs on Album   : " + getNumberOfSongs()
	   			+ "\nRecord Label     : " + getLabel()
	   			+ "\nQuantity in stock: " + super.getQtyInStock() 
	   			+ "\nPrice            : " + super.getPrice()
	   			+ "\nStock Value      : " + super.getInventoryValue()
	   			+ "\nProduct Status   : " + (super.getActive()?"Active":"Discontinued");
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	 
}
