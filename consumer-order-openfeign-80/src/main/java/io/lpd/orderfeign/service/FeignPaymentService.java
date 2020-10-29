package io.lpd.orderfeign.service;

import feign.Param;
import io.lpd.apicommon.entities.CommonResult;
import io.lpd.apicommon.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PROVIDER-PAYMENT-8001")
public interface FeignPaymentService {


    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
