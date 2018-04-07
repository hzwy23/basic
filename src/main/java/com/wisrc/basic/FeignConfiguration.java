package com.wisrc.basic;

import com.wisrc.webapp.utils.Result;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConditionalOnProperty(name = "spring.profiles.active", havingValue = "dev")
public class FeignConfiguration implements RequestInterceptor {

    private String HEADER_LABEL = "Authorization";
    private String TOKEN = "";

    @Autowired
    private LoginService loginService;

    @PostConstruct
    public void init() {
        Result result = loginService.login("admin", "add6f2f665bf00774adae98071ac1fc6");
        if (result.getCode() == 200) {
            Map<String, String> map = new HashMap<>((Map<String, String>) result.getData());
            this.TOKEN = map.get("token");
        }
    }

    // 获取登陆信息
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(HEADER_LABEL, TOKEN);
    }

}
