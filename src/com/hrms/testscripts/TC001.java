package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;


import com.hrms.lib.*;

public class TC001 {
	@Test
	public void login ()throws Exception{
		DOMConfigurator.configure("log4j.xml");
			General g = new General();
			g.openapplication();
			g.login();
			g.addemp();
			g.delemp();
			g.logout();
			g.closebrowser();
		}
}
