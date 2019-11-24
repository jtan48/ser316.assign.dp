/**
 * 
 */
package blue.flame;

/**
 * @author jerry
 *
 */
public interface DuelTemplate {
	public abstract Object init(String instructions);
	public abstract Object execute();
	public abstract Object teardown();
}
