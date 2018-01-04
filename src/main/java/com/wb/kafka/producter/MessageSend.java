package com.wb.kafka.producter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**   
* @Description 消息发送者
* @author 王斌
* @date 2018年1月4日 上午9:43:40 
* @version V1.0   
*/
@Component
public class MessageSend {
	 @Autowired
	    private KafkaTemplate kafkaTemplate;
	 public void sendMessage(String message){
		 kafkaTemplate.send("test", "key", message);
	 }
}
