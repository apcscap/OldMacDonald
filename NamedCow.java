class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound) {
		myType = type;
		mySound = sound;
		myName = name;
	}
	public NamedCow() {
		myType = "unknown";
		mySound = "unknown";
		myName = "unkown";
	}
	public String getName(){return myName;}
}