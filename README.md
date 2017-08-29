package com.hwua.jsonTese;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

public class XmlToJson {
//在处理XML时，需要另添加"xom-1.2.8.jar"包。
	public static void main(String[] args) {
		String s="<student><name id='n1'>xiapi</name><sex class='s1'>男</sex><age>20</age></student>";
		XMLSerializer x =new XMLSerializer();
		JSON json = x.read(s);
		System.out.println("XmlToJson");
		System.out.println(json.toString());
	}

}

