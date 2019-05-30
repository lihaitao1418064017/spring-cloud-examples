package io.ymq.example.feign.consumer;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author LiHaitao
 * @description HystrixClientFallbackFactory:
 * @date 2019/5/22 15:39
 **/
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClient> {
    @Override
    public HomeClient create(Throwable throwable) {
        return  ()->"feign + hystrix ,提供者服务挂了";
    }
}
