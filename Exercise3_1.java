import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.*;


public class Exercise3_1{
    
	public static void main(String args[]){
		
		JSONParser parser = new JSONParser();
		try{
			
			Object obj = parser.parse(new FileReader("appSettings.json"));
			JSONObject jsonObject = (JSONObject)obj;
			
			Map element = ((Map)jsonObject.get("AppSettings"));
			
			Iterator<Map.Entry> iterator = element.entrySet().iterator();
			
			System.out.println("Printing elements from the Json file.\n");
			while(iterator.hasNext()) {
			    Map.Entry pair = iterator.next();
			    System.out.println(pair.getKey()+" : "+pair.getValue());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}