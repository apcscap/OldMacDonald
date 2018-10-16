class NamedCow extends Cow
{
	// private String myType;
	// private String mySound;
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
	// public String getSound(){return mySound;}
	// public String getType(){return myType;}
	public String getName(){return myName;}
}