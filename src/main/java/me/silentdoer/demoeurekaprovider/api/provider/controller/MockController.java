package me.silentdoer.demoeurekaprovider.api.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/mock")
public class MockController {

    /**
     * 对外提供的服务（demo是给payment-service提供服务）
     */
    @GetMapping("/a_service_api")
    public String aServiceApi() {
        return "数据库的法律";
    }
}
