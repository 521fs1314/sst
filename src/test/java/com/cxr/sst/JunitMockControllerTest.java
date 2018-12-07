package com.cxr.sst;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
public class JunitMockControllerTest {

    //@Autowired
    private MockMvc mvc;


    private MockHttpSession session;

    //@Before
    public void initSession() throws Exception {

        this.session = new MockHttpSession();
        this.session.setAttribute("roleId",1);
    }

    //@Test
    public void ResultIsJSONTest() throws Exception {

        MvcResult result = this.mvc.perform(get("/mock/json").param("String 1","String 2").session(this.session))
                .andExpect(status().isOk())
                //.andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.code").value(1002)).andReturn();
                //.andExpect(jsonPath("$.code").value(1003));
        System.out.println(result.getRequest().getSession().getAttribute("roleId"));


    }

    //@Test
    public void ResultIsHTMLTest() throws Exception {
        MvcResult result = this.mvc.perform(get("/mock/html"))
                .andExpect(status().isOk())
                .andExpect(xpath("//input[@name='name']").exists()).andReturn();
                //.andReturn();
        System.out.println(result.getRequest().getSession().getAttribute("roleId"));
    }

    //@Test
    public void ResultIsHtmlListTest() throws Exception {
        this.mvc.perform(get("/mock/list"))
                .andExpect(status().isOk())
                //.andExpect(xpath("//ul[@name='ul']/li").nodeCount(4));
                .andExpect(xpath("//ul[@name='ul']/li").nodeCount(5));
        //.andReturn();

    }
}
