package my.move;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove{

	public ZapCannon(){
		super(Type.ELECTRIC, 120, 50);
	}

	@Override
	protected String describe(){
		return "uses Zap Cannon";
	}	

	@Override
	protected void applyOppEffects(Pokemon p){
		new Effect().paralyze(p);
	}
}
