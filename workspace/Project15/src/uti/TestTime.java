package uti;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(5, 23, 55);
		
		t1.setTime (System.currentTimeMillis());
		System.out.println("The time of t1" + " is " + t1.getHours() + " hours, " + 
				t1.getMinutes() + " minutes and " + t1.getSeconds() + " seconds.");
		System.out.println("The time of t2" + " is " + t2.getHours() + " hours, " + 
				t2.getMinutes() + " minutes and " + t2.getSeconds() + " seconds.");
		System.out.println("The time of t3" + " is " + t3.getHours() + " hours, " + 
				t3.getMinutes() + " minutes and " + t3.getSeconds() + " seconds.");
	}

}
