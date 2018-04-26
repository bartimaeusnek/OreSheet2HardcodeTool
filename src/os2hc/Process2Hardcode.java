package os2hc;

import java.util.ArrayList;
import java.util.List;

public class Process2Hardcode {

	public Process2Hardcode(List<Oremix> OML) {
		this.OML=OML;
		this.hardcode=new ArrayList<String>();
	}
	private List<Oremix> OML;
	private List<String> hardcode;


	public List<String> run() {
		for (int i=0; i<OML.size();i++) {
			hardcode.add(new String("new GT_Worldgen_GT_Ore_Layer(\"ore.mix."
						 +OML.get(i).getOreName()
						 +"\", "
						 +"true"
						 +", "
						 +Integer.toString(OML.get(i).getMinY())
						 +", "
						 +Integer.toString(OML.get(i).getMaxY())
						 +", "
						 +OML.get(i).getWeight()
						 +", "
						 +OML.get(i).getDensity()
						 +", "
						 +OML.get(i).getSize()
						 +", "
						 +Boolean.toString(OML.get(i).getOverworld())
						 +", "
						 +Boolean.toString(OML.get(i).getNether())
						 +", "
						 +Boolean.toString(OML.get(i).getEnd())
						 +", "
						 //+"false, false, false, "
						 +"Materials."
						 +OML.get(i).getPrimary().replaceAll(" ","")
						 +", "
						 +"Materials."
						 +OML.get(i).getSecondary().replaceAll(" ","")
						 +", "
						 +"Materials."
						 +OML.get(i).getInbetween().replaceAll(" ","")
						 +", "
						 +"Materials."
						 +OML.get(i).getAround().replaceAll(" ","")
						 +");"
						));
		}
		return this.hardcode;
	}
	
}
