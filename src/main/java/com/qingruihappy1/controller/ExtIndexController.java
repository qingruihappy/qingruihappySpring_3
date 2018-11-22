package com.qingruihappy1.controller;

import com.qingruihappy1.extspringmvc.extannotation.ExtController;
import com.qingruihappy1.extspringmvc.extannotation.ExtRequestMapping;

@ExtController
@ExtRequestMapping("/ext")
public class ExtIndexController {
	//ext/test/?name=122&age=6440654
	@ExtRequestMapping("/test")
	public String test() {
		System.out.println("手写springmvc框架...");
		return "index";
	}

}
