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

/**
 * @author jerry
 *
 */
public class Ass5 {

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
		
		init(filename);
		engage();
		teardown();
		

	}//main

	//psfv init
	private static final void init(String init_file) {
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
        }		
	}//init
	
    private static final void parse_init(JSONObject list) {

    	// get items within list
        JSONObject obj = (JSONObject) list.get("character");
         
        // get character name
        String char_name = (String) obj.get("char_name");    
        System.out.println(char_name);
         
        // get character role (hero or villian)
        String char_role = (String) obj.get("char_role");    
        System.out.println(char_name);

        // get character strength (1 to 100)
        String char_strength = (String) obj.get("char_strength");    
        System.out.println(char_strength);

        // get character intelligence (1 to 100)
        String char_smarts = (String) obj.get("char_smarts");    
        System.out.println(char_smarts);
        
        // get character state (alive, dead, resting)
        String char_state = (String) obj.get("char_state");    
        System.out.println(char_state);
        
    }//parse_init

    
    private static final void engage() {}
	private static final void teardown() {}
		
}//class
