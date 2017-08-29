package com.hwua.jsonTese;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.CycleDetectionStrategy;

public class BeanToJson {

	public static void main(String[] args) {
		 Student s1 = new Student("xiapi","男",22);
	        JSONObject jsonObject1 = JSONObject.fromObject(s1);
	        System.out.println("Student s1");
	        System.out.println(jsonObject1);
	       
	        Class c1 = new Class();
	        c1.setName("计算机应用1班");
	        c1.setDate(new Date());
	        JsonConfig config=new JsonConfig();
	        //设置循环策略为忽略
	        config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
	        //设置 json转换的处理器用来处理日期类型
	        //凡是反序列化Date类型的对象，都会经过该处理器进行处理
	        config.registerJsonValueProcessor(Date.class,
	                                    new JsonValueProcessor() {
	            //参数1 ：属性名参数2：json对象的值参数3：jsonConfig对象
	            public Object processObjectValue(String arg0, Object arg1,JsonConfig arg2) {
	                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	                Date d=(Date) arg1;
	                return sdf.format(d);
	            }
	            public Object processArrayValue(Object arg0, JsonConfig arg1) {
	                return null;
	            }
	        });
	        List<Student> students = new ArrayList<Student>();
	        students.add(new Student("xiapi1","男",10));
	        students.add(new Student("xiapi2","女",11));
	        students.add(new Student("xiapi3","男",12));
	        c1.setStudents(students);
	        JSONObject jsonObject2 = JSONObject.fromObject(c1,config);
	        System.out.println("Class c1");
	        System.out.println(jsonObject2);
	}

}
