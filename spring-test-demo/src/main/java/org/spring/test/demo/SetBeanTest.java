package org.spring.test.demo;

import static org.junit.Assert.assertNotNull;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SetBeanTest {
	public Properties props;

	public void setProps(Properties props) {
		this.props = props;
	}

	public List list;
	public String nullValue;
	public void setList(List list) {
		this.list = list;
	}

	public Map map;

	public void setMap(Map map) {
		this.map = map;
	}
	public void setNullValue(String nullValue) {
		this.nullValue = nullValue;
	}
	void print(){
//		assertNotNull(nullValue);
		System.out.println("List:>>>>>>>>>");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("map:>>>>>>>>>");
		Iterator<?> it=map.entrySet().iterator();
		while (it.hasNext()) {
			Entry en=(Entry) it.next();
			System.out.println(""+en.getKey()+":"+en.getValue());
		}
		System.out.println("props:>>>>>>>>>");
		Set set=props.stringPropertyNames();
		for (Object object : set) {
			System.out.println(props.get(object));
		}
	}
}
