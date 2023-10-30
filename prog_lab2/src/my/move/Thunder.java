package my.move;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove{

	public Thunder(){
		super(Type.ELECTRIC, 110, 70);
	}

	@Override
	protected String describe(){
		return "uses Thunder";
	}

	@Override
	protected void applyOppEffects(Pokemon p){

		new Effect().chance(0.3).paralyze(p);
	}
}
