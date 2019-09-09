package com.zhangkai.test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zhangkai.common.utils.RandomUtil;
import com.zhangkai.common.utils.StringUtil;
import com.zhangkai.domain.User;
import com.zhangkai.service.UserService;

/**
 * 
 * @ClassName: UserTest
 * @Description: (1)ID使用1-10000的顺序号。（2分） (2)姓名使用3个随机汉字模拟，可以使用以前自己编写的工具方法。（4分）
 *               (3)性别在女和男两个值中随机。（4分） (4)手机以13开头+9位随机数模拟。（4分） (5)邮箱以3-20个随机字母
 *               + @qq.com | @163.com | @sian.com | @gmail.com | @sohu.com
 *               | @hotmail.com | @foxmail.com模拟。（4分）
 *               (6)生日要模拟18-70岁之间，即日期从1949年到2001年之间。（4分）
 * @author: ZK
 * @date: 2019年9月9日 上午9:14:13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
	@Autowired
	private UserService userService;

	@Transactional
	@Test
	public void addUserTest() throws UnsupportedEncodingException {
		int total = 0;
		String[] genders = { "男", "女" };
		String[] mobileSuf = { "@qq.com", "@163.com", "@sian.com", "@gmail.com", "@sohu.com", "@hotmail.com",
				"@foxmail.com" };
		long start = new Date().getTime();
		for (int i = 0; i < 10000; i++) {
			User user = new User();
			// 设置ID
			user.setId(i + 1);
			// 设置姓名使用3个随机汉字模拟
			user.setName(StringUtil.randomChineseString(3));
			// 设置性别
			int genderIndex = RandomUtil.random(0, 1);
			user.setGender(genders[genderIndex]);
			// (4)手机以13开头+9位随机数模拟
			String mobile = "13";
			for (int j = 0; j < 9; j++) {
				mobile += RandomUtil.random(0, 9);
			}
			user.setMobile(mobile);
			// (5)邮箱以3-20个随机字母 + @qq.com | @163.com | @sian.com | @gmail.com | @sohu.com |
			// @hotmail.com | @foxmail.com模拟。（4分）
			String email = "";
			for (int j = 0; j < RandomUtil.random(3, 20); j++) {
				email += RandomUtil.randomCharacter() + "";
			}
			email += mobileSuf[RandomUtil.random(0, mobileSuf.length-1)];
			user.setEmail(email);
			// (6)生日要模拟18-70岁之间，即日期从1949年到2001年之间。（4分）
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.set(Calendar.YEAR, RandomUtil.random(1949, 2001));
			user.setBirthday(c.getTime());
			System.out.println(user);
			userService.addUser(user);
			total++;
		}
		long time = new Date().getTime() - start;

		if (total >= 0) {
			System.out.println("数据源保存1万条记录所耗时间为：" + time + "毫秒");
			throw new RuntimeException("数据回滚");
		}

	}
}
