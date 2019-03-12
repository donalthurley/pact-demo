package com.example.demo;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hurleyd on 2019-01-30
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
public class MvcTest {

    @InjectMocks
    DemoController demoController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        RestAssuredMockMvc.standaloneSetup(demoController);
    }

}