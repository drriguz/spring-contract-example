package vehicle

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value(consumer(regex('/vehicle/\\w.+')),
                producer('/vehicle/XXXXX'))
    }
    response {
        status 404
    }
}
