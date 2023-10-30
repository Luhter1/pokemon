package my.move;

import ru.ifmo.se.pokemon.*;

public class EerieImpulse extends StatusMove{

	@Override
	protected String describe(){
		return "uses Eerie Impulse";
	}

	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -2);
	}
}
