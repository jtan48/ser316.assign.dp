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
public class Ass5 implements Ass5K {

	@SuppressWarnings("rawtypes")
	private ArrayList<Villian> _villians = new ArrayList<Villian>();
	private ArrayList<Hero> _her0es = new ArrayList<Hero>();
	
	
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
	private final Ass5 init(String init_file) {
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
         
        // get character role (hero or villian)
        //String char_role = (String) obj.get("char_role");    
        int char_role = (int)obj.get("char_role");    
        System.out.println(char_name);

        // get character strength (1 to 100)
        //String char_strength = (String) obj.get("char_strength");    
        int char_strength = (int)obj.get("char_strength");    
        System.out.println(char_strength);

        // get character intelligence (1 to 100)
        //String char_smarts = (String) obj.get("char_smarts");    
        int char_smarts = (int)obj.get("char_smarts");    
        System.out.println(char_smarts);
        
        // get character state (alive, dead, resting)
        //String char_state = (String) obj.get("char_state");    
        int char_state = (int)obj.get("char_state");    
        System.out.println(char_state);
        
        //if(VILLIAN == Integer.parseInt(char_role)) _villians.add(CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        if(VILLIAN == char_role) _villians.add((Villian)CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        if(HER0 == char_role) _her0es.add((Hero)CharacterFactory.getCharacter(char_name, char_role, char_strength, char_smarts, char_state));
        
    }//parse_init

    //pf.this engage
    private final Ass5 execute() { 

    	
    	return this; 
    }//pf.this engage

    //pf.this teardown
    private final Ass5 teardown() { return this; }
		
}//class
