/**
 * 
 */
package blue.flame;

/**
 * @author jerry
 *
 */
public final class ExecuteFightOperation implements ExecuteOperation {

	private Receiver receiver;
	
	/**
	 * 
	 */
	public ExecuteFightOperation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return receiver.fight();
	}//execute

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//class
