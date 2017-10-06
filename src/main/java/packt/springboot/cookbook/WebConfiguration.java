package packt.springboot.cookbook;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    /**
     * Out	of	the	box,	Spring	Boot	automatically	adds OrderedCharacterEncodingFilter	and	HiddenHttpMethodFilter
     * this one is convenient Tomcat 8 filter to translate IP behind the load balancer proxy
     * @return
     */
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }
}
