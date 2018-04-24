package os2hc;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class MaterialRenamer<T> extends AbstractBeanField<T> {

	protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
		String ret = value;
		
		ret = ret.replaceAll(" ", "");	
		
		if (ret.contains("Ore"))
			ret=ret.split("Ore")[0];
		if (ret.contains("Stone"))
			ret=ret.split("Stone")[0];
		
		switch (ret) {
		//case "Neutronium":{
		//	ret = "CosmicNeutronium";
		//	break;
		//}
		case "YellowGarnet":{
			ret = "GarnetYellow";
			break;
		}
		case "RedGarnet":{
			ret = "GarnetRed";
			break;
		}
		case "TerraInfused":{
			ret = "InfusedEarth";
			break;
		}
		case "AquaInfused":{
			ret = "InfusedWater";
			break;
		}
		case "AerInfused":{
			ret = "InfusedAir";
			break;
		}
		case "IgnisInfused":{
			ret = "InfusedFire";
			break;
		}
		case "OrdoInfused":{
			ret = "InfusedOrder";
			break;
		}
		case "PerditioInfused":{
			ret = "InfusedEntropy";
			break;
		}
		case "Uranium238":{
			ret = "Uranium";
			break;
		}
		case "Plutonium239":{
			ret = "Plutonium";
			break;
		}
		case "Shadowiron":{
			ret = "ShadowIron";
			break;
		}
		case "Aw.Draconium":{
			ret = "DraconiumAwakened";
			break;
		}
		case "EnrichedNaquadah":{
			ret = "NaquadahEnriched";
			break;
		}
		case "Sheldonite":{
			ret = "Cooperite";
			break;
		}
		case "LigniteCoal":{
			ret = "Lignite";
			break;
		}
		default:
			break;
		}
		return ret;
	}

}
