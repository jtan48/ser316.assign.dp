/**
 * 
 */
package blue.flame;

import java.util.*;

/**
 * @author jerry
 *
 */
public class FightOperationExecutor {

	private final List<ExecuteFightOperation> _fightOperations = new ArrayList<>();
	
	/**
	 * 
	 */
	public FightOperationExecutor() {
		// TODO Auto-generated constructor stub
	}

    public String executeOperation(ExecuteFightOperation fightOperations) {
        _fightOperations.add(fightOperations);
        return fightOperations.execute();
    }//execute ops
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
