class Farm 
{     
	//your code here
	int numberOfAnimals = 50;
	private Animal[] aBunchOfAnimals = new Animal[numberOfAnimals];
	public Farm() {
		for(int i=0;i<aBunchOfAnimals.length-1;i++) {
			int rand = (int)(Math.random()*6)+1;
			if(rand==1) {aBunchOfAnimals[i] = new Chick("chicken", "caw caw");}
			if(rand==2) {aBunchOfAnimals[i] = new Cow("cow", "moo");}
			if(rand==3) {aBunchOfAnimals[i] = new Pig("pig", "snort");}
			if(rand==4) {aBunchOfAnimals[i] = new Horse("horse", "meh");}
			if(rand==5) {aBunchOfAnimals[i] = new Dog("dog", "bark");}
			if(rand==6) {aBunchOfAnimals[i] = new Chick("chicken", "cluck", "cheep");}
		}
		aBunchOfAnimals[numberOfAnimals-1] = new NamedCow("cow", "Cliff", "moo moo");
	}

	public void animalSounds() {
		for(int i=0;i<aBunchOfAnimals.length;i++) {
			System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
		}
		System.out.println("cow's name is: " + ((NamedCow)aBunchOfAnimals[numberOfAnimals-1]).getName());
	}
}
