package com.itheima.springboot_redis01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;
import java.util.Set;

@SpringBootTest
class SpringbootRedis01ApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void testSet(){

		SetOperations so = redisTemplate.opsForSet();

		so.add("name03","影宅","shadow house","艾米丽可","艾米丽可");

		Set name03 = so.members("name03");

		name03.forEach(System.out::println);


	}


	@Test
	void testList(){

		ListOperations lo = redisTemplate.opsForList();

		lo.leftPushAll("name02","刀剑神域Alicization","尤吉欧","kirito","Alici");


		List name02 = lo.range("name02", 0, -1);

		name02.forEach(System.out::println);


	}


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
