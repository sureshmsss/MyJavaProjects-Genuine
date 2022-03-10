package comparator.ss.it.beans;

public class IT {
	int id;
	String name;

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

	@Override
	public String toString() {
		return "id-" + id + " name-" + name + "\n";
	}

	public IT(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
