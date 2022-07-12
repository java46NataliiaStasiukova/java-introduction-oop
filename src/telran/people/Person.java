package telran.people;

public class Person {
private long id;
private int birthYear;
private String email;
public Person(long id, int birthYear,String email) {
	setEmail(email);
	this.id = id;
	this.birthYear = birthYear;
}
public void setEmail(String email) {
	this.email = email;
}
public long getId() {
	return id;
}
public int getBirthYear() {
	return birthYear;
}
public String getEmail() {
	return email;
}
}
/**
public class Rectangle {
private int width;
private int height;
public Rectangle(int width, int height) {
	setWidth(width);
	setHeight(height);
}

public int getWidth() {
	return width;
}
public int getHeight() {
	return height;
}
public void setWidth(int width) {
	if(width < 0 ) {
		width = -width;
	}
	this.width = width;
}
public void setHeight(int height) {
	if(height < 0 ) {
		height = -height;
	}
	this.height = height;
}
public void draw() {
	for(int i = 0; i < height; i++) {
		for(int j = 0;j < width; j++) {
			System.out.print("*" + " ");
		}
		System.out.println();
	}
}
*/