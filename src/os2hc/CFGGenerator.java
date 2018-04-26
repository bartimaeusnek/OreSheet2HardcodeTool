package os2hc;

import java.util.ArrayList;

public class CFGGenerator {

	public CFGGenerator() {
	}
	
	public static ArrayList<String> generateCFG(Oremix O){
		ArrayList<String> ret = new ArrayList<String>();
		ret.add("            "+O.getOreName()+" {");
		if(O.EA)
		ret.add("                B:EndAsteroid_false="+O.EA);
		if(O.Moon)
		ret.add("                B:GalacticraftCore_Moon_false="+O.Moon);
		if(O.Astroids)
		ret.add("                B:GalacticraftMars_Asteroids_false="+O.Astroids);
		if(O.Mars)
		ret.add("                B:GalacticraftMars_Mars_false="+O.Mars);
		if(O.BC)
		ret.add("                B:GalaxySpace_BarnardC_false="+O.BC);
		if(O.BE)
		ret.add("                B:GalaxySpace_BarnardE_false="+O.BE);
		if(O.BF)
		ret.add("                B:GalaxySpace_BarnardF_false="+O.BF);
		if(O.Callisto)
		ret.add("                B:GalaxySpace_Callisto_false="+O.Callisto);
		if(O.Centauri)
		ret.add("                B:GalaxySpace_CentauriA_false="+O.Centauri);
		if(O.Ceres)
		ret.add("                B:GalaxySpace_Ceres_false="+O.Ceres);
		if(O.Deimos)
		ret.add("                B:GalaxySpace_Deimos_false="+O.Deimos);
		if(O.Enceladus)
		ret.add("                B:GalaxySpace_Enceladus_false="+O.Enceladus);
		if(O.Europa)
		ret.add("                B:GalaxySpace_Europa_false="+O.Europa);
		if(O.Ganymede)
		ret.add("                B:GalaxySpace_Ganymede_false="+O.Ganymede);
		if(O.Haumea)
		ret.add("                B:GalaxySpace_Haumea_false="+O.Haumea);
		if(O.Io)
		ret.add("                B:GalaxySpace_Io_false="+O.Io);
		if(O.KB)
		ret.add("                B:GalaxySpace_Kuiperbelt_false="+O.KB);
		if(O.Makemake)
		ret.add("                B:GalaxySpace_MakeMake_false="+O.Makemake);
		if(O.Mercury)
		ret.add("                B:GalaxySpace_Mercury_false="+O.Mercury);
		if(O.Miranda)
		ret.add("                B:GalaxySpace_Miranda_false="+O.Miranda);
		if(O.Oberon)
		ret.add("                B:GalaxySpace_Oberon_false="+O.Oberon);
		if(O.Phobos)
		ret.add("                B:GalaxySpace_Phobos_false="+O.Phobos);
		if(O.Pluto)
		ret.add("                B:GalaxySpace_Pluto_false="+O.Pluto);
		if(O.Proteus)
		ret.add("                B:GalaxySpace_Proteus_false="+O.Proteus);
		if(O.TcetiE)
		ret.add("                B:GalaxySpace_TcetiE_false="+O.TcetiE);
		if(O.Titan)
		ret.add("                B:GalaxySpace_Titan_false="+O.Titan);
		if(O.Triton)
		ret.add("                B:GalaxySpace_Triton_false="+O.Triton);
		if(O.VB)
		ret.add("                B:GalaxySpace_VegaB_false="+O.VB);
		if(O.Venus)
		ret.add("                B:GalaxySpace_Venus_false="+O.Venus);
		if(O.TF)
		ret.add("                B:\"Twilight Forest_false\"="+O.TF);
		if(O.DD)
		ret.add("                B:Underdark_false="+O.DD);
		ret.add("            }");
		ret.add(" ");
		return ret;
	}
}
