package com.hwua.jsonTese;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

public class CollectionsToJson {
//	处理CollectionsToJson
	public static void main(String[] args) {
	        List<String> list1 = new ArrayList<>();
	        list1.add("first");
	        list1.add("second");
	        JSONArray jsonArray1 = JSONArray.fromObject(list1);
	        System.out.println("List list1");
	        System.out.println(jsonArray1);
	       
	        List<Student> list2 = new ArrayList<Student>();
	        list2.add(new Student("xiapi1","男",10));
	        list2.add(new Student("xiapi2","女",11));
	        list2.add(new Student("xiapi3","男",12));
	        JSONArray jsonArray2 = JSONArray.fromObject(list2);
	        System.out.println("List<Student> list2");
	        System.out.println(jsonArray2);
	    }

}
