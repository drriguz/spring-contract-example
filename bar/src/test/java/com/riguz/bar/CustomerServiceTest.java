package com.riguz.bar;

import com.riguz.bar.dto.CustomerInfo;
import com.riguz.bar.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.riguz:foo:+:stubs:10000", workOffline = true)
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void shouldReturnCustomerDetail(){
        CustomerInfo info = this.customerService.getCustomerInfo("123");
        System.out.println(info);
        assertEquals(1, info.getVehicles().size());
    }
}
