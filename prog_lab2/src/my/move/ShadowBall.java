package my.move;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{

	public ShadowBall(){
	
		super(Type.GHOST, 80, 100);
	}

	@Override
	protected String describe(){
		return "uses Shadow Ball";
	}

	@Override
	protected void applyOppEffects(Pokemon p){
		
		if(new Effect().chance(0.2).success()){
		p.setMod(Stat.SPECIAL_DEFENSE, -1);
		}
	}
}
