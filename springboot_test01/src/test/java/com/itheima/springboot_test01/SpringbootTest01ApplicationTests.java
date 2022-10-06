package com.itheima.springboot_test01;

import com.itheima.springboot_test01.test.AnimeName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.convert.PeriodFormat;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

//@SpringBootTest(properties = {"test.prop=testValue02"},args = {"--test.prop=testValue03"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(AnimeName.class)
@AutoConfigureMockMvc
class SpringbootTest01ApplicationTests {


    @Value("${test.prop}")
    private String testValue01;

    @Autowired
    private String animeName;

    @Autowired
    private MockMvc mockMvc;


    @Test
    void testHeaders() throws Exception {

        MockHttpServletRequestBuilder st = MockMvcRequestBuilders.get("/animeInfo/json");

        ResultActions perform = mockMvc.perform(st);

        HeaderResultMatchers header = MockMvcResultMatchers.header();

        ResultMatcher string = header.string("Content-Type", "application/json");

        perform.andExpect(string);


    }

    @Test
    void testJson() throws Exception {

        MockHttpServletRequestBuilder st = MockMvcRequestBuilders.get("/animeInfo/json");

        ResultActions perform = mockMvc.perform(st);

        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher json = content.json("{\"name\":\"Lycoris Recoil\",\"character01\":\"锦木千束/安济知佳\",\"character02\":\"井之上泷奈/若山诗音\",\"releaseTime\":2022,\"id\":5201314}");

        perform.andExpect(json);


    }



    @Test
    void testText() throws Exception {

        MockHttpServletRequestBuilder st = MockMvcRequestBuilders.get("/animeInfo/text");

        ResultActions perform = mockMvc.perform(st);

        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher lycoris_recoil = content.string("Lycoris Recoil");

        perform.andExpect(lycoris_recoil);


    }


    @Test
    void testStaus() throws Exception {

        MockHttpServletRequestBuilder st = MockMvcRequestBuilders.get("/animeInfo/text");

        ResultActions perform = mockMvc.perform(st);

        StatusResultMatchers status = MockMvcResultMatchers.status();

        ResultMatcher ok = status.isOk();

        perform.andExpect(ok);




    }

    @Test
    void testMockmvc(@Autowired MockMvc mockMvc) throws Exception {

        MockHttpServletRequestBuilder msrb = MockMvcRequestBuilders.get("/animeInfo/text");

        ResultActions perform = mockMvc.perform(msrb);

        System.out.println(perform);

    }


    @Test
    void testPropValue() {

        System.out.println("testValue::" + testValue01);

    }


    @Test
    void contextLoads() {


        System.out.println(this.animeName);

    }

}
