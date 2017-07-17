package util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements Service{
	//소수점 두번째자리까지 반환
	public double decimalFormat(double param) {
		DecimalFormat form = new DecimalFormat("#.##");
	    return Double.parseDouble(form.format(param));
	}
	//char배열을 list로 변환
	public List<String> convertToList(char[] param) {
		List<String> list=new ArrayList<String>();
		for(char i:param){
			list.add(String.valueOf(i));
		}
		return list;
	}
	//list를 map으로 변환
	public Map<Integer, String> convertToMap(List<String> param) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		for(String x:param){
			map.put(param.indexOf(x), x);
		}
		return map;
	}
	//map을 list로 변환
	public List<String> convertToList(Map<Integer, String> param) {
		List<String> list=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:param.entrySet()){
			list.add(entry.getValue());
		}
		return list;
	}	
}
