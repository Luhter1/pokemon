package my.move;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class PinMissile extends PhysicalMove{
	
	public PinMissile(){
		super(Type.BUG, 25, 95, 0, Math.random()<=0.75 ? (Math.random()<=0.5 ? 2 : 3) : (Math.random()<=0.5 ? 4 : 5));
	}	

	@Override
	protected String describe(){
	
		return "uses Pin Missile";
	}

}
