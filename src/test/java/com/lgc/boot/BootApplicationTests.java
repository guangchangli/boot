package com.lgc.boot;

import com.lgc.boot.util.ValidationUtil;
import com.lgc.boot.validate.Account;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class BootApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void test1() throws IOException {
		Account account = new Account();
		account.setAlias("kalakala");
		account.setUserName("wokalakala");
		account.setPassWord("Sff3");
		ValidationUtil.ValidResult validResult = ValidationUtil.validateBean(account);
		if(validResult.hasErrors()){
			String errors = validResult.getErrors();
			System.out.println(errors);
		}
	}
}
