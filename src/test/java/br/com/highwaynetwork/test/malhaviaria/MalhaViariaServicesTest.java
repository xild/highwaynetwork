package br.com.highwaynetwork.test.malhaviaria;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.highwaynetwork.HighwayApplication;
import br.com.highwaynetwork.services.MalhaViariaServices;

@SpringApplicationConfiguration(classes = HighwayApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MalhaViariaServicesTest{

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Mock
    MalhaViariaServices services;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(services).build();
    }
    
    @Test
    public void convertGrafoParaNode(){
        fail();
    }
}
