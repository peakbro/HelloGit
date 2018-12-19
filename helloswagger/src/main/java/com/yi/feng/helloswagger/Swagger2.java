package com.yi.feng.helloswagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yi.feng.helloswagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建Api基本信息（这些会展示在文档页面）
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SpringBoot中使用Swagg2构建Restful Api")
                .description("更多详情  请听下回分解")
                .termsOfServiceUrl("https://github.com/peakbro/HelloGit")
                .contact("峰")
                .version("1.0")
                .build();
    }
}
