package com.wb.kafka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**   
* @Description TODO
* @author 王斌
* @date 2018年1月4日 上午8:54:11 
* @version V1.0   
*/
@RestController
@RequestMapping("kafka")
public class SendMessageController {
@RequestMapping(method=RequestMethod.GET,value="send-message")
	public Object sendMessage(@RequestParam("message")String message){ return "success"+message; }
}
