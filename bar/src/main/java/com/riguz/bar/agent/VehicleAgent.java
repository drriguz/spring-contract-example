package com.riguz.bar.agent;

import com.riguz.bar.dto.VehicleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class VehicleAgent {
    private final RestTemplate restTemplate;
    private final String url;

    @Autowired
    public VehicleAgent(RestTemplate restTemplate, @Value("${vehicle.service.url}") String url){
        this.restTemplate = restTemplate;
        this.url = url;
    }

    public VehicleDetail getVehicleDetail(String vin){
        URI uri = UriComponentsBuilder
                .fromUriString(url)
                .pathSegment("vehicle", vin)
                .build()
                .toUri();
        ResponseEntity<VehicleDetail> response = restTemplate.getForEntity(uri, VehicleDetail.class);
        return response.getBody();
    }
}
