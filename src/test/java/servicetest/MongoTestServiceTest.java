package servicetest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shark.weipan.service.IMongoTestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/spring-context.xml", "/spring/spring-mvc.xml" })
/** 声明spring主配置文件位置，注意：以当前测试类的位置为基准,有多个配置文件以字符数组声明 **/
public class MongoTestServiceTest {

	// 创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(MongoTestServiceTest.class);

	@Autowired
	IMongoTestService mongoService;

	@Test
	public void testGetList() {
//		List<Student> list = mongoService.getList();
		assertEquals(1, 1);
	}
}
