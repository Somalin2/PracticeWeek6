package mypackage;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
		}
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=1 && month>=12) {
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
//		this.day=day;
//		this.month=month;
//		this.year=year;
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	@Override
	public String toString() {
		return "\nDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
