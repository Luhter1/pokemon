import ru.ifmo.se.pokemon.*;
import my.pokemon.*;

public class main{

	public static void main(String[] args){
		Battle b = new Battle();
		
		Celesteela p1 = new Celesteela("Башня",10);
		Eevee p2 = new Eevee("Коричневый", 30);		
		Bellsprout p3 = new Bellsprout("Маленький лимон", 47);
		Jolteon p4 = new Jolteon("Желтый", 35);
		Weepinbell p5 = new Weepinbell("Лимон", 54);
		Victreebel p6 = new Victreebel("Большой лимон", 54);


		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
	
	
	}
}
