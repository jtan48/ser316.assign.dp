/**
 * 
 */
package blue.flame;

import java.util.ArrayList;


/**
 * @author jerry
 *
 */
public final class ExecuteFightOperation implements ExecuteOperation {

	private Receiver receiver = new Receiver();

	/*
	private ArrayList<Character> _villians;
	private ArrayList<Character> _her0es;
	*/
	private ArrayList<Villain> _villains = new ArrayList<Villain>();
	private ArrayList<Hero> _her0es = new ArrayList<Hero>();
	
	/**
	 * 
	 */
	/*
	public ExecuteFightOperation(ArrayList<Character> villians, ArrayList<Character> her0es) {
		// TODO Auto-generated constructor stub
		_villians = villians;
		_her0es = her0es;
	}//ctor
	*/

	/**
	 * 
	 */
	public ExecuteFightOperation(ArrayList<Villain> villains, ArrayList<Hero> her0es) {
		// TODO Auto-generated constructor stub
		_villains = villains;
		_her0es = her0es;
	}//ctor

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return new Receiver().fight(_villains, _her0es);
	}//execute

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//class
