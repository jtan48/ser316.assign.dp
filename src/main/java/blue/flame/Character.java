/**
 * 
 */
package blue.flame;

/**
 * @author jerry
 *
 */
public abstract class Character {

	/**
	 * 
	 */
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public abstract String getName();
	public abstract int getRole();
	public abstract int getStrength();
	public abstract int getSmarts();
	public abstract int getState();
	
	@Override
	public String toString() {
		return new StringBuffer("name: ").append(this.getName()).append("role: ").append(this.getRole()).append("strength: ").append(this.getStrength()).append("smarts: ").append(this.getSmarts()).append("state: ").append(this.getState()).toString();
	}//toString
	
}//character
