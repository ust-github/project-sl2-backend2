package com.example.demo.config;

import com.ustri.digital.edgeops.core.security.UserJoiner;
import com.ustri.digital.edgeops.core.service.UserRoleService;
import com.ustri.digital.edgeops.hz.HzMembers;
import com.ustri.digital.edgeops.hz.HzService;
import com.ustri.digital.edgeops.modreg.ModuleRegistrator;
import com.ustri.digital.edgeops.modreg.RemoteModuleRegistrator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModuleConfig {
    @Bean
    public UserRoleService userRoleService(HzService hzService) {
        return hzService.createRmiProxy(UserRoleService.class, HzMembers.ADMIN);
    }

    @Bean
    public UserJoiner userJoiner(HzService hzService) {
        return hzService.createRmiProxy(UserJoiner.class, HzMembers.ADMIN);
    }

    @Bean
    public ModuleRegistrator moduleRegistrator() {
        return new RemoteModuleRegistrator(HzMembers.ADMIN);
    }
}
