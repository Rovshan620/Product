package com.example.SpringBootFundamental.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentService paymentService(){
        return new CreditCardService();
    }
    @Bean
    public PaymentService GpaymentService2(){
        return new GPayService();
    }
}
