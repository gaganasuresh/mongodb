package junit.testing12;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class helloresourceTest {
    private MockMvc mockMvc;
    @InjectMocks
    private helloresource helloresource;

    @Before
    public void setUp() throws Exception{
        mockMvc= MockMvcBuilders.standaloneSetup((helloresource))
                .build();
    }
    @Test
    public void test1() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/testing"))
                .andExpect((MockMvcResultMatchers.status().isOk()))
                .andExpect(MockMvcResultMatchers.content().string("JUnit Testing"));
    }

}