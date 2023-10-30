package my.move;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove{

	@Override
	protected String describe(){
		return "uses Sweet Scent";
	}

	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.EVASION, -1);
	}
}
