package io.lpd.orderfeign.controller;


import io.lpd.apicommon.entities.CommonResult;
import io.lpd.apicommon.entities.Payment;
import io.lpd.orderfeign.service.FeignPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-20 0:05
 */
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private FeignPaymentService feignPaymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return feignPaymentService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return feignPaymentService.paymentFeignTimeout();
    }
}
