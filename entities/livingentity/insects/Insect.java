package entities.livingentity;

import entities.livingentity.LivingEntity;

public abstract class Insect extends LivingEntity{

	public Insect(int x, int y){
		super(x,y,10);
	}

	public abstract void die();
	public abstract void reproduction(); 
}