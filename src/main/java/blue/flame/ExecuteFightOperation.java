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

	private Receiver receiver;

	/*
	private ArrayList<Character> _villians;
	private ArrayList<Character> _her0es;
	*/
	private ArrayList<Villain> _villians;
	private ArrayList<Hero> _her0es;
	
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
		_villians = villains;
		_her0es = her0es;
	}//ctor

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return receiver.fight(_villians, _her0es);
	}//execute

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//class
