package contracts.base;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.riguz.foo.ServiceApp;
import com.riguz.foo.dto.VehicleDetail;
import com.riguz.foo.service.VehicleService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

import static org.mockito.BDDMockito.given;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApp.class)
public class VehicleBase {

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private VehicleService vehicleService;

@Before
public void setUp() throws Exception {
    VehicleDetail i = new VehicleDetail();
    i.setVin("WDC1660631A7506890");
    i.setOwner("James 王");
    i.setBrand("Audi X5");
    i.setRegisteredDate(new Date(1502347667000L));
    i.setMileage(1200);
    RestAssuredMockMvc.webAppContextSetup(context);

    given(vehicleService.getVehicle("WDC1660631A7506890")).willReturn(i);
}
}

