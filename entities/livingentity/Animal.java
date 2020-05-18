package entities.livingentity;

import entities.livingentity.LivingEntity;

public abstract class Animal extends LivingEntity{

	public Animal(int x, int y, float pv){
		super(x,y,pv);
	}

	public abstract void die();
	public abstract void reproduction(); 
}