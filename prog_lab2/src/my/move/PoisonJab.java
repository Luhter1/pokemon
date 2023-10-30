package my.move;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove{

	public  PoisonJab(){
		super(Type.POISON, 80, 100);
	}

	@Override
	protected String describe(){
		return "uses Poison Jab";
	}

	@Override
	protected void applyOppEffects(Pokemon p){

		new Effect().chance(0.3).poison(p);
	
	}
}
