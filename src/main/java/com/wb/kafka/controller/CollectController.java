package com.wb.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wb.kafka.configuration.Response;

@RestController
@RequestMapping("kafka")
@SuppressWarnings({"rawtypes","unchecked"})
public class CollectController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
    private KafkaTemplate kafkaTemplate;
	@RequestMapping(value = "send", method = RequestMethod.GET)
	public Response sendKafka(@RequestParam("message")String message) {
		try {
			logger.info("kafka的消息={}", message);
			ListenableFuture send = kafkaTemplate.send("test", "key", message);
			logger.info("发送kafka成功.");
			return new Response("0", "发送kafka成功");
		} catch (Exception e) {
			logger.error("发送kafka失败", e);
			return new Response("-1", "发送kafka失败");
		}
	}
    @RequestMapping("test")
    public String test(){return "test";}

}