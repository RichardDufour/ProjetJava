package entities.livingentity;

import entities.entityclass.Entity;

public abstract class LivingEntity extends Entity{

	private float pv;

	public LivingEntity(int x, int y, float pv){
		super(x,y);
		this.pv=pv;
	}

	public float getPV() {
		return this.pv;	
	}
	public void setPV(float pv) {
		this.pv=pv;
	}

	public abstract void die();
	public abstract void reproduction(); 
}