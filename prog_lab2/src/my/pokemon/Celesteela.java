package my.pokemon;

import ru.ifmo.se.pokemon.*;
import my.move.*;

public class Celesteela extends Pokemon{
	
	public Celesteela(String name, int level){
		
		super(name, level);
		this.setType(Type.STEEL, Type.FLYING);
		this.setStats(97, 101, 103, 107, 101, 61);
		this.setMove(new Thunder(), new ZapCannon(), new ThunderPunch(), new EerieImpulse());
	}

}
