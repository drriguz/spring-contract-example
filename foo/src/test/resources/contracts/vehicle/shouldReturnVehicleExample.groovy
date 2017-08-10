package vehicle

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value('/vehicle/WDC1660631A7506890')
    }
    response {
        status 200
        body([
                vin           : 'WDC1660631A7506890',
                brand         : 'Audi X5',
                owner         : 'James 王',
                registeredDate: 1502347667000,
                mileage       : 1200
        ])
        headers {
            header('Content-Type': value(
                    producer(regex('application/json.*')),
                    consumer('application/json')
            ))
        }
    }
}
