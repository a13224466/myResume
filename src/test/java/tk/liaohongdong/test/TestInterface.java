package tk.liaohongdong.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tk.liaohongdong.pojo.TAdmin;
import tk.liaohongdong.service.TAdminService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInterface extends UnitTestBase {

	public TestInterface() {
		super("classpath:spring/applicationContext*.xml");
	}

	@Test
	public void heihei() {
		ClassPathXmlApplicationContext bean = super.getBean();
		TAdminService bean2 = (TAdminService) bean.getBean(TAdminService.class);
//		TAdminService bean = super.getBean("tAdminService");
		TAdmin findById = (TAdmin) bean2.selectTadminAll();
		System.out.println(findById.getName() + " " + findById.hashCode() + " . . . " + findById.getHeadImg());
	}

}
