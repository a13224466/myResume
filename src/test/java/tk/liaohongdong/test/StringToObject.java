package tk.liaohongdong.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import net.sf.json.JSONObject;

public class StringToObject {

	private final static String JSON_DATA = "{" + "  \"geodata\": [" + "    {" + "      \"id\": \"1\","
			+ "      \"name\": \"Julie Sherman\"," + "      \"gender\" : \"female\","
			+ "      \"latitude\" : \"37.33774833333334\"," + "      \"longitude\" : \"-121.88670166666667\"" + "    },"
			+ "    {" + "      \"id\": \"2\"," + "      \"name\": \"Johnny Depp\"," + "      \"gender\" : \"male\","
			+ "      \"latitude\" : \"37.336453\"," + "      \"longitude\" : \"-121.884985\"" + "    }" + "  ]" + "}";

	@Test
	public void a() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a1");
		list.add("a2");
		System.out.println(list);
	}

	// @Test
	// public void a1(){
	// Map<String, Object> list = new HashMap<String, Object>();
	// list.put("a","a");
	// list.put("a1","a1");
	// list.put("a2","a2");
	// System.out.println(list);
	// JSONArray js = JSONArray.fromObject(list);
	// js.toArray();
	// System.out.println(js.getClass());
	// }

	@Test
	public void a2() {
		String a = "{\"info\":\"深圳天气\"}";
		/**
		 * 将 Json 形式的字符串转换为 Map
		 */
		String str = "{\"name\":\"Tom\",\"age\":90}";
		JSONObject jsonObject = JSONObject.fromObject(str);
		Map<String, Object> map = (Map<String, Object>) JSONObject.toBean(jsonObject, Map.class);
		System.out.println("?");
		System.out.println(map);
		System.out.println("1");
		System.out.println(map.get("name"));

		/**
		 * 将 Json 形式的字符串转换为 JavaBean
		 */
		str = "{\"id\":\"A001\",\"name\":\"Jack\"}";
		jsonObject = JSONObject.fromObject(str);
		System.out.println(jsonObject);
		Person person = (Person) JSONObject.toBean(jsonObject, Person.class);
		System.out.println(person);
	}

}
