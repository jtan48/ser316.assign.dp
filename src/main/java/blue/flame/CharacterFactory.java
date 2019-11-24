/**
 * 
 */
package blue.flame;

/**
 * @author jerry
 *
 */
public final class CharacterFactory implements Ass5K {

	/**
	 * 
	 */
	private CharacterFactory() {
		// TODO Auto-generated constructor stub
	}//private ctor

	public final static Character getCharacter(String name, int role, int strength, int smarts, int state) {
		if(VILLAIN == role) return new Villain(name,role,strength,smarts,state);
		if(HER0 == role) return new Hero(name,role,strength,smarts,state);
		return null; //unknown riff raff
	}//getCharacter
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
