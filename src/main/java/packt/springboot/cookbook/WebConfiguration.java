package packt.springboot.cookbook;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    /**
     * Out	of	the	box,	Spring	Boot	automatically	adds OrderedCharacterEncodingFilter	and	HiddenHttpMethodFilter
     * this one is convenient Tomcat 8 filter to translate IP behind the load balancer proxy
     *
     * @return
     */
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
    /**
     * together with addInterceptors (came from WebMvcConfigurerAdapter)
     * @return
     */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }
}
