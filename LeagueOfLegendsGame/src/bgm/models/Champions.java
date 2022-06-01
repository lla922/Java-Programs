package bgm.models;

public abstract class Champions<T> {
	
	private String name;
	
	public Champions(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
