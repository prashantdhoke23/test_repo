package com.Day4;
public class EnumD{
public enum weekdays {
	SUN(1),MON(2),TUE(3),WEd(4),THR(5),FRI(6),SAT(7);
    private int value;
	weekdays(int value){
		this.value=value;
	}
}
private int id;
private String name;
private weekdays daysofjoining;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public weekdays getDaysofjoining() {
	return daysofjoining;
}

public void setDaysofjoining(weekdays daysofjoining) {
	this.daysofjoining = daysofjoining;
}

public EnumD(int id, String name, weekdays daysofjoining) {
	super();
	this.id = id;
	this.name = name;
	this.daysofjoining = daysofjoining;
}

@Override
public String toString() {
	return "EnumD [id=" + id + ", name=" + name + ", daysofjoining=" + daysofjoining.value + "]";//.value for values and .ordinal is for index od enum
}

public static void main(String[] args) {
	for(weekdays w: weekdays.values()) {
		System.out.println(w +"Original" + w.value);
	}
	EnumD ed=new EnumD(100,"Prashant",weekdays.FRI);
	System.out.println(ed);

}
}
