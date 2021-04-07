package com.dunshan.mall.auth.feign;

import com.dunshan.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dunshan on 2020/7/16.
 */
@FeignClient("mall-portal")
public interface PortalFeign {
    @GetMapping("/portal/sso/login/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
