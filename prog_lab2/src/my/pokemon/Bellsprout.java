package my.pokemon;

import ru.ifmo.se.pokemon.*;
import my.move.*;

public class Bellsprout extends Pokemon{

	public Bellsprout(String name, int level){
	
		super(name,level);
		this.setType(Type.GRASS, Type.POISON);
		this.setStats(50, 75, 35, 70, 30, 40);
		this.setMove(new SweetScent(), new PoisonJab());
	}

} 
