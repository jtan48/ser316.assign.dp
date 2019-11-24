/**
 * 
 */
package blue.flame;

/**
 * @author jerry
 *
 */
public final class Hero extends Character {

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @param smarts the smarts to set
	 */
	public void setSmarts(int smarts) {
		this.smarts = smarts;
	}

	private String name;
	private int role;
	private int strength;
	private int smarts;
	private int state;
	
	/**
	 * 
	 */
	/*
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	public Hero(String name, int role, int strength, int smarts, int state) {
		// TODO Auto-generated constructor stub
		name = name;
		role = role;
		strength = strength;
		smarts = smarts;
		state = state;
	}//ctor

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getRole() {
		// TODO Auto-generated method stub
		return role;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return strength;
	}

	@Override
	public int getSmarts() {
		// TODO Auto-generated method stub
		return smarts;
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return state;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}
