/**
 * Copyright(C) 2015 AUREOLE IT, INC. All rights reserved.
 *
 * (1)このソフトウェアは、AUREOLE株式会社に帰属する機密情報
 *    であり開示を固く禁じます。
 * (2)この情報を使用するには、AUREOLE株式会社とのライセンス
 *    契約が必要となります。
 *
 * This software is the confidential and proprietary information
 * of AUREOLE IT, INC. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with AUREOLE IT.
 */
package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hiendn
 *
 */
@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
