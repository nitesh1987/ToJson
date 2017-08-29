package com.hwua.jsonTese;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;
//处理MapToJson
public class MapToJson {

	public static void main(String[] args) {
		        Map<String, Object> map1 = new HashMap<>();
		        map1.put("name","json");
		        map1.put("bool",Boolean.TRUE);
		        map1.put("int",new Integer(1));
		        map1.put("arr",new String[]{"a","b"});
		        map1.put("func","function(i){ return this.arr[i]; }");
		        JSONObject jsonObject1 = JSONObject.fromObject(map1);
		        System.out.println("Map map1");
		        System.out.println(jsonObject1);
		       
		        Map<String,Student> map2 = new HashMap<String,Student>();
		        map2.put("k1", new Student("xiapi1","男",10));
		        map2.put("k2", new Student("xiapi2","女",12));
		        map2.put("k3", new Student("xiapi3","男",13));
		        JSONObject jsonObject2 = JSONObject.fromObject(map2);
		        System.out.println("Map<String,Student> map2");
		        System.out.println(jsonObject2);

	}

}
