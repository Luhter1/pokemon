package my.move;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{

	@Override	
	protected String describe(){
		return "uses Confide";
	}

	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}


}
