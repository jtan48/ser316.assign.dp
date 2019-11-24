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
		//Hero prosecutor = new Hero("Boundless Beowulf", 1, 99, 38, 0);
		//if(hero_iter.hasNext()) prosecutor = hero_iter.next();
		//if(null == prosecutor) return DARKNESS;
		int counter = 1;
		//System.out.println("ROUND " + counter++);
		while(iter.hasNext()) {

			//Villain defendant = iter.next();
			//if(null == defendant) return LIGHT;
			Villain defendant = new Villain("Borg Queen", 0, 101, 101, 0);
			Hero prosecutor = new Hero("Boundless Beowulf", 1, 99, 38, 0);

			System.out.println("ROUND " + counter++);

			// announcer stuff.. and in this corner, etc etc
			System.out.println(new StringBuffer(prosecutor.getName()).append(" versus ").append(defendant.getName()).toString());
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
	
	public String fight() {
		
		ArrayList<Villain> villains = new ArrayList<Villain>();
		villains.add(new Villain("Celestial Dragon", 0, 108, 101, 0));
		villains.add(new Villain("Borg Queen", 0, 101, 101, 0));
		villains.add(new Villain("Cancer Cain", 0, 89, 18, 0));
		villains.add(new Villain("Gluttony Grendel", 0, 42, 38, 0));
		villains.add(new Villain("Joker", 0, 36, 78, 0));
		
		ArrayList<Hero> her0es = new ArrayList<Hero>();
		her0es.add(new Hero("Ensign Kim", 1, 88, 78, 0));
		her0es.add(new Hero("Seven of Nine", 1, 48, 78, 0));
		her0es.add(new Hero("Boundless Beowulf", 1, 99, 38, 0));
		her0es.add(new Hero("Captain America", 1, 16, 12, 0));
		
		Iterator<Villain> iter = villains.iterator();
		Iterator<Hero> hero_iter = her0es.iterator();
		Villain defendant = iter.next();
		Hero prosecutor = hero_iter.next();
		int counter = 1;
		while(iter.hasNext()) {

			System.out.println("ROUND " + counter++);

			// announcer stuff.. and in this corner, etc etc
			String pname = prosecutor.getName();
			String dname = defendant.getName();
			//System.out.println(new StringBuffer(pname).append(" versus ").append(dname).toString());
			System.out.println(pname + " versus " + dname);
			System.out.println(FIGHT);
			System.out.println(new StringBuffer(prosecutor.getName()).append(" stats: ").append(prosecutor.toString()));
			System.out.println(new StringBuffer(defendant.getName()).append(" stats: ").append(defendant.toString()));

			// this is it..
			// this is where the proverbial horse is buried..
			if(prosecutor.getStrength() > defendant.getStrength() || RESTING == defendant.getState()) { // prosecutor wins -- got a conviction
				prosecutor.setStrength(prosecutor.getStrength() + defendant.getStrength());
				prosecutor.setSmarts(prosecutor.getSmarts() + defendant.getSmarts());
				if(iter.hasNext()) { defendant = iter.next(); }
				else { return LIGHT; }
			} else { // defendant wins -- got an acquittal
				defendant.setStrength(defendant.getStrength() + prosecutor.getStrength());
				defendant.setSmarts(defendant.getSmarts() + prosecutor.getSmarts());
				if(hero_iter.hasNext()) { prosecutor = hero_iter.next(); }
				else { return DARKNESS; }
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
