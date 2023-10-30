package my.pokemon;

import ru.ifmo.se.pokemon.*;
import my.move.*;

public class Weepinbell extends Bellsprout{

	public Weepinbell(String name, int level){
		super(name, level);
		this.setStats(65, 90, 50, 85, 45, 55);
		this.addMove(new Slam());
	}
}
