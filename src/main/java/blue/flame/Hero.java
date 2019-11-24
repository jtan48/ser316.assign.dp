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
		this._strength = strength;
	}

	/**
	 * @param smarts the smarts to set
	 */
	public void setSmarts(int smarts) {
		this._smarts = smarts;
	}

	private String _name;
	private int _role;
	private int _strength;
	private int _smarts;
	private int _state;
	
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
		_name = name;
		_role = role;
		_strength = strength;
		_smarts = smarts;
		_state = state;
	}//ctor

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public int getRole() {
		// TODO Auto-generated method stub
		return _role;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return _strength;
	}

	@Override
	public int getSmarts() {
		// TODO Auto-generated method stub
		return _smarts;
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return _state;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}
