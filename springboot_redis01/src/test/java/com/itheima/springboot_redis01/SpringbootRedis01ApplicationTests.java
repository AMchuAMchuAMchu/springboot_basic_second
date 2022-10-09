package com.itheima.springboot_redis01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootRedis01ApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;


	@Test
	void testValue(){

		ValueOperations vp = redisTemplate.opsForValue();

		vp.set("name01","影宅...");

		Object name01 = vp.get("name01");

		System.out.println(" >> "+name01);

	}


	@Test
	void contextLoads() {
	}

}
