package os2hc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SpeadsheedGenerator {

	public SpeadsheedGenerator() {
		// TODO Auto-generated constructor stub
	}

	public static List<String> GT5CFG(File F, String Veinname) {
		try {
		FileReader in = new FileReader(F);
		BufferedReader reader = new BufferedReader(in,  (int) F.length());
		String st=null;
		List<String> raw= new ArrayList<String>();
		Boolean[] found = new Boolean[2];
		found[0] = false;
		found[1] = false;
	   
		do{
	    	st = reader.readLine();
	    	if (st != null && st.trim().equals("mix {")) {
	    		while(!((st == null)||((st != null)&&found[0]))){
	    			st = reader.readLine();
	    			if (st != null && st.trim().equals(Veinname+" {")) {
	    				while (!((st == null)||((st != null) && found[0]))){
	    					st = reader.readLine();
	    					if ((!(st == null)) && st.trim().equals("}"))
	    						found[0] = true;
	    					raw.add(st);
	    				   }
	    				}
	    			}
	        }
	    	
	    	if (st != null && st.trim().equals("dimensions {")) {
	    		while(!((st == null)||((st != null)&&found[1]))){
	    			st = reader.readLine();
	    			if (st != null && (st.trim().equals("mix {"))) {
	    				while(!((st == null)||((st != null)&&found[1]))){
	    					st = reader.readLine();
	    					if (st != null && st.trim().equals(Veinname+" {")) {
	    						while (!((st == null)||((st != null)&&found[1]))){
	    							st = reader.readLine();
	    							if ((!(st == null)) && st.trim().equals("}"))
	    								found[1] = true;
	    							raw.add(st);
	    				   		}
	    					}
	    				}
	    			}
	    		}
	    	}
	    }while(st != null);
		reader.close();
		return raw;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		}
	
	public static synchronized Oremix BeanGenerator(List<String> L,String Veinname){
		try {
		Oremix ret = new Oremix();
		ret.setOreName(Veinname);
		
		/*String s = L.get(i).split("=")[1];
		ret.setDensity(Integer.parseInt(s));
		++i;
		s = L.get(i).split("=")[1];
		ret.EA=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Moon=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Astroids=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Mars=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.BC=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.BE=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.BF=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Callisto=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Centauri=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Ceres=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Deimos=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Enceladus=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Europa=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Ganymede=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Haumea=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Io=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.KB=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Makemake=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Mercury=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Oberon=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Phobos=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Pluto=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Proteus=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.TcetiE=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Titan=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Triton=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.VB=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.Venus=Boolean.parseBoolean(s);
		++i;
		s = L.get(i).split("=")[1];
		ret.setNether(Boolean.parseBoolean(s));
		++i;
		s = L.get(i).split("=")[1];
		ret.setMinY(Integer.parseInt(s));
		++i;
		s = L.get(i).split("=")[1];
		ret.setMaxY(Integer.parseInt(s));
		++i;
		++i;
		++i;
		++i;
		++i;
		s = L.get(i).split("=")[1];
		ret.setOverworld(Boolean.parseBoolean(s));
		++i;
		s = L.get(i).split("=")[1];
		ret.setSize(Integer.parseInt(s));
		++i;
		++i;
		s = L.get(i).split("=")[1];
		ret.setEnd(Boolean.parseBoolean(s));
		//++i;
		//s = L.get(i).split("=")[1];
		//ret.setSize(Integer.parseInt(s));
		*/
		
		if (L.contains("B:\"Twilight Forest_true\"=true")||L.contains("B:\"Twilight Forest_false\"=true")) {
			ret.TF=true;
		}else
			ret.TF=false;
		if (L.contains("B:Underdark_true=true")||L.contains("B:Underdark_false=true")) {
			ret.DD=true;
		}else
			ret.DD=false;
		return ret;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
