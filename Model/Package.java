package Model;

public class Package extends Element{
	private int value;

	public Package(String name, int size) {
		super(name);
		this.setSize(size);
	}

	public Package(float x, float y, String name, int size, int value) {
		super(x,y,name,size);
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
