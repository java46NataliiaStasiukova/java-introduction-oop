package telran.people;

public class Person implements Comparable<Person>{
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
@Override
public int compareTo(Person o) {
	
	return Long.compare(this.id, o.id);
}
}
