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
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
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
    private static MockMvc mockMvc;


    public static ResultActions getAction(){

        MockHttpServletRequestBuilder msrb = MockMvcRequestBuilders.get("/animeInfo/text");

        ResultActions perform = null;
        try {
            perform = mockMvc.perform(msrb);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return perform;
    }



    @Test
    void testStaus() throws Exception {

        StatusResultMatchers status = MockMvcResultMatchers.status();

        ResultMatcher ok = status.isOk();

        ResultActions action = getAction();

        action.andExpect(ok);


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
