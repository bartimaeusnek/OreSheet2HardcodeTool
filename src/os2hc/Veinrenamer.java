package os2hc;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class Veinrenamer<T> extends AbstractBeanField<T> {

	@Override
	protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
		String ret = null;
		CharSequence s = "/";
		ret=value;
		if (ret.contains(s)) {
			ret = value.split("/")[1];
		}
		if (ret.contains("Vein")) {
			ret = ret.replaceAll("Vein", "");
		}
		ret = ret.replaceAll("&", "");
		ret = ret.replaceAll(" ", "");
		ret = ret.replaceAll("\\.", "");
		ret = ret.toLowerCase();
		return ret;
	}

}
