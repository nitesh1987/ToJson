# ToJson
ArraysToJson，CollectionsToJson，MapToJson，XMLToJson
//处理ArraysToJson的示例代码
package com.hwua.jsonTese;

import net.sf.json.JSONArray;
//处理ArraysToJson
public class ArraysToJson {
	public static void main(String[] args) {
	        int[] intArray = new int[]{1,4,5};
	        JSONArray jsonArray1 = JSONArray.fromObject(intArray);
	        System.out.println("int[] intArray");
	        System.out.println(jsonArray1);
	       
	        boolean[] boolArray = new boolean[]{true,false,true};
	        System.out.println("boolean[] boolArray");
	        JSONArray jsonArray2 = JSONArray.fromObject(boolArray);
	        System.out.println(jsonArray2);
	       
	        int[][] int2Array = new int[][]{{1,2},{3,4}};
	        JSONArray jsonArray3 = JSONArray.fromObject(int2Array);
	        System.out.println("int[][] int2Array");
	        System.out.println(jsonArray3);
	       
	        float[] floatArray = new float[]{0.1f,0.2f,0.3f};
	        JSONArray jsonArray4 = JSONArray.fromObject(floatArray);
	        System.out.println("float[] floatArray");
	        System.out.println(jsonArray4);
	       
	        String[] strArray = new String[]{"hello","hebut","xiapi"};
	        JSONArray jsonArray5 = JSONArray.fromObject(strArray);
	        System.out.println("String[] strArray");
	        System.out.println(jsonArray5);
	    }
}
