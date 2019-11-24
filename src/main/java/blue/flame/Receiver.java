/**
 * 
 */
package blue.flame;

import java.util.*;

import blue.flame.Character;

/**
 * @author jerry
 *
 */
public class Receiver implements Ass5K {

	private ArrayList<Villain> _villains = new ArrayList<Villain>();
	private ArrayList<Hero> _her0es = new ArrayList<Hero>();

	/**
	 * 
	 */
	public Receiver() {
		// TODO Auto-generated constructor stub
	}

	public String fight(ArrayList<Villain> villains, ArrayList<Hero> her0es) {
		
		Iterator<Villain> iter = villains.iterator();
		Iterator<Hero> hero_iter = her0es.iterator();
		while(iter.hasNext()) {
			Villain defendant = iter.next();
			Hero prosecutor = hero_iter.next();
			
			// announcer stuff.. and in this corner, etc etc
			System.out.println(new StringBuffer(prosecutor.getName()).append(" versus ").append(defendant.getName()));
			System.out.println(FIGHT);
			System.out.println(new StringBuffer(prosecutor.getName()).append(" stats: ").append(prosecutor.toString()));
			System.out.println(new StringBuffer(prosecutor.getName()).append(" stats: ").append(prosecutor.toString()));
			
			
			
			
		}//while
		
		
		
		
		
		return DARKNESS;
	}//fight
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
