package vehicle

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value(consumer(regex('/vehicle/[A-Z0-9]{18}')),
                producer('/vehicle/WDC1660631A7506890'))
    }
    response {
        status 200
        body([
                vin           : $(producer(regex(/[A-Z0-9]{18}/))),
                brand         : $(producer(anyNonBlankString())),
                owner         : $(producer(anyNonBlankString())),
                registeredDate: $(producer(regex(/[1-9][0-9]{11,12}/))),
                mileage       : $(producer(regex(/[1-9][0-9]{0,10}/)))
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
