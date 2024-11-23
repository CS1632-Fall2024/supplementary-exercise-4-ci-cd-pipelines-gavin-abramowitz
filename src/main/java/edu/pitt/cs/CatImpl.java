package edu.pitt.cs;

public class CatImpl implements Cat {

	// Member variables
	int id;
	String name;
	boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		rented = false;
		
	}

	public void rentCat() {
		rented = true;
		
	}

	public void returnCat() {
		rented = false;
	}

	public void renameCat(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}
}
