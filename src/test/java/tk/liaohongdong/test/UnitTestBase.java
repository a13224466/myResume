package tk.liaohongdong.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

	private ClassPathXmlApplicationContext context;

	private String springXmlpath;

	public UnitTestBase() {
	}

	public UnitTestBase(String springXmlpath) {
		this.springXmlpath = springXmlpath;
	}

	@Before
	public void before() {
		if (StringUtils.isEmpty(springXmlpath)) {
			springXmlpath = "classpath:spring/applicationContext*.xml";
		}
		context = new ClassPathXmlApplicationContext(springXmlpath);
	}

	@After
	public void after() {
		context.destroy();
	}

	
	public ClassPathXmlApplicationContext getBean(){
		return context;
	}
//	@SuppressWarnings("unchecked")
//	public <T extends Object> T getBean(String beanId) {
//		return (T) context.getBean(beanId);
//	}
//
//	public <T extends Object> T getBean(Class<T> clazz) {
//		return context.getBean(clazz);
//	}

}
