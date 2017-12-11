package com.xtwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @作者：侯建军
 * @公司：山西迅腾伟业科贸有限公司
 * @日期：2017年12月11日下午6:48:42
 * @描述: 用户控制器
 */
@Controller
public class UserController {
	/**
	 * 首页
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
