package entities.livingentity;

import entities.livingentity.Animal;

public abstract class Human extends Animal{

	private float age;

	public Human(int x, int y){
		super(x,y,20);
		this.age=0;
	}

	public float getAge() {
		return this.age;	
	}
	public void setAge(float age) {
		this.age=age;
	}

	public abstract void die();
	public abstract void reproduction(); 
}