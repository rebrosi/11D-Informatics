package uti;

public class DVD extends Product{
	private int lengthMinutes;
	private int ageRating;
	private String filmStudio;
	
	DVD(int itemNumber, String name, int qtyInStock, double price,
			int lengthMinutes, int ageRating, String filmStudio){
		super(itemNumber, name, qtyInStock, price);
	}
	public double getInventoryValue() {
		return super.getPrice() * super.getQtyInStock() * 1.05;
	}
	public String toString()
	{
	     return "\n\nItem Number      : " + super.getItemNumber() 
	   			+ "\nName             : " + super.getName()
	   			+ "\nMovie Length     : " + getLengthMinutes()
	   			+ "\nAge Rating       : " + getAgeRating()
	   			+ "\nFilm Studio      : " + getFilmStudio()
	   			+ "\nQuantity in stock: " + super.getQtyInStock() 
	   			+ "\nPrice            : " + super.getPrice()
	   			+ "\nStock Value      : " + super.getInventoryValue()
	   			+ "\nProduct Status   : " + (super.getActive()?"Active":"Discontinued");
	}
	public int getLengthMinutes() {
		return lengthMinutes;
	}

	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	public String getFilmStudio() {
		return filmStudio;
	}

	public void setFilmStudio(String filmStudio) {
		this.filmStudio = filmStudio;
	}
}
