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
		Villain defendant = iter.next();
		Hero prosecutor = hero_iter.next();
		int counter = 1;
		//System.out.println("ROUND " + counter++);
		while(iter.hasNext()) {

			System.out.println("ROUND " + counter++);

			// announcer stuff.. and in this corner, etc etc
			System.out.println(new StringBuffer(prosecutor.getName()).append(" versus ").append(defendant.getName()));
			System.out.println(FIGHT);
			System.out.println(new StringBuffer(prosecutor.getName()).append(" stats: ").append(prosecutor.toString()));
			System.out.println(new StringBuffer(defendant.getName()).append(" stats: ").append(defendant.toString()));

			// this is it..
			// this is where the proverbial horse is buried..
			if(prosecutor.getStrength() > defendant.getStrength()) { // prosecutor wins -- got a conviction
				prosecutor.setStrength(prosecutor.getStrength() + defendant.getStrength());
				prosecutor.setSmarts(prosecutor.getSmarts() + defendant.getSmarts());
				defendant = iter.next();
				if(null == defendant) { return LIGHT; }
			} else { // defendant wins -- got an acquittal
				defendant.setStrength(defendant.getStrength() + prosecutor.getStrength());
				defendant.setSmarts(defendant.getSmarts() + prosecutor.getSmarts());
				prosecutor = hero_iter.next();
				if(null == prosecutor) { return DARKNESS; }
			}//if else
		}//while
		
		// default realism
		return DARKNESS;
	}//fight
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
