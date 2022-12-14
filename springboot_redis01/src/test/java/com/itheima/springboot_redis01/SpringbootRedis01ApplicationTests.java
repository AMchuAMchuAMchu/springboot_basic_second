package com.itheima.springboot_redis01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class SpringbootRedis01ApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void testHash(){

		HashOperations ho = redisTemplate.opsForHash();

		HashMap<String, String> animeMap = new HashMap<>();

		animeMap.put("anime01","影宅shadow house");
		animeMap.put("anime02","莉可丽丝Lycoris Recoil");
		animeMap.put("anime03","契约之吻Engage kiss");
		animeMap.put("anime04","彻夜之歌...");


		ho.putAll("name04",animeMap);

		Map name04 = ho.entries("name04");

		name04.entrySet().forEach(System.out::println);

	}



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
