package my.move;

import ru.ifmo.se.pokemon.*;

public class ThunderPunch extends PhysicalMove{

	public ThunderPunch(){
		super(Type.ELECTRIC, 75, 100);
	}

	@Override
	protected String describe(){
		return "uses Thunder Punch";
	}

	@Override
	protected void applyOppEffects(Pokemon p){
		new Effect().chance(0.1).paralyze(p);
	}
}
