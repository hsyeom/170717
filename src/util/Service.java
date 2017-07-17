package util;

import java.util.List;
import java.util.Map;

public interface Service {
	public List<String> convertToList(char[] param);
	public Map<Integer,String> converToMap(List<String> param);
	public List<String> converToList(Map<Integer,String> param);
	public double decimalFormat(double param);
}
