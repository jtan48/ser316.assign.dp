/**
 * 
 */
package blue.flame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.*;

/**
 * @author jerry
 *
 */
public class Ass5 implements Ass5K, DuelTemplate {

	@SuppressWarnings("rawtypes")
	public ArrayList<Villain> _villains = new ArrayList<Villain>();
	public ArrayList<Hero> _her0es = new ArrayList<Hero>();
	
	
	/**
	 * 
	 */
	public Ass5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("what hath been wrought?");
		
		String filename = null == args[0] ? "jsonFile.json" : args[0];
		
		// the idiom of zen
		new Ass5().init(filename).execute().teardown();

	}//main

	//pf.this init
	public final Ass5 init(String init_file) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader(init_file)) {
            // slurps JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray init_list = (JSONArray) obj;
            System.out.println(init_list);
             
            // iterate init list
            init_list.forEach( item -> parse_init( (JSONObject) item ) );
 
        } catch (FileNotFoundException fnfx) {
            fnfx.printStackTrace();
        } catch (IOException iox) {
            iox.printStackTrace();
        } catch (ParseException px) {
            px.printStackTrace();
        } finally { 
        	return this;		
        }
	}//init
	
	//pfv
    private final void parse_init(JSONObject list) {

    	// get items within list
        JSONObject obj = (JSONObject) list.get("character");
         
        // get character name
        String char_name = (String) obj.get("char_name");    
        System.out.println(char_name);
        
        //System.out.println("why you blowing chunks here");
         
        // get character role (hero or villian)
        String role = (String) obj.get("char_role");    
        int char_role = Integer.parseInt(role);    
        System.out.println(char_name);

        // get character strength (1 to 100)
        String strength = (String) obj.get("char_strength");    
        int char_strength = Integer.parseInt(strength);    
        System.out.println(char_strength);

        // get character intelligence (1 to 100)
        String smarts = (String) obj.get("char_smarts");    
        int char_smarts = Integer.parseInt(smarts);    
        System.out.println(char_smarts);
        
        // get character state (alive, dead, resting)
        String state = (String) obj.get("char_state");    
        int char_state = Integer.parseInt(state);    
        System.out.println(char_state);
        
        //if(VILLAIN == Integer.parseInt(char_role)) _villians.add(CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        if(VILLAIN == char_role) _villains.add((Villain)CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        if(HER0 == char_role) _her0es.add((Hero)CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        
    }//parse_init

    //pf.this engage
    public final Ass5 execute() { 

        FightOperationExecutor executor = new FightOperationExecutor();
        //System.out.println(executor.executeOperation(new ExecuteFightOperation(_villains,_her0es)));
        //System.out.println(new Receiver().fight(_villains, _her0es));
        System.out.println(new Receiver().fight());
        
    	return this; 
    }//pf.this engage

    //pf.this teardown
    public final Ass5 teardown() { return this; }
		    
}//class
