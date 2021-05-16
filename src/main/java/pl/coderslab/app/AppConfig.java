package pl.coderslab.app;


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.LocaleContextResolver;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import javax.persistence.EntityManagerFactory;
//import java.util.Locale;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "pl.coderslab")
//@EnableTransactionManagement
//@EnableJpaRepositories
//public class AppConfig implements WebMvcConfigurer {
//
//    @Bean
//
//    public LocalEntityManagerFactoryBean entityManagerFactory() {
//
//        LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
//
//        emfb.setPersistenceUnitName("workshopHibernate");
//
//        return emfb;
//
//    }
//
//
//    @Bean
//
//    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
//
//        return new JpaTransactionManager(emf);
//
//    }
//
//    @Bean
//
//    public ViewResolver viewResolver() {
//
//        InternalResourceViewResolver viewResolver =
//
//                new InternalResourceViewResolver();
//
//        viewResolver.setPrefix("/WEB-INF/views/");
//
//        viewResolver.setSuffix(".jsp");
//
//        return viewResolver;
//
//    }
//
//
//    @Override
//
//    public void configureDefaultServletHandling(
//
//            DefaultServletHandlerConfigurer configurer) {
//
//        configurer.enable();
//
//    }
//
//
//    @Bean(name = "localeResolver")
//
//    public LocaleContextResolver getLocaleContextResolver() {
//
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//
//        localeResolver.setDefaultLocale(new Locale("pl", "PL"));
//
//        return localeResolver;
//
//    }
//
//
//}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import javax.persistence.EntityManagerFactory;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
@Configuration
@EnableWebMvc
@ComponentScan("pl.coderslab")
@EnableTransactionManagement
@EnableJpaRepositories("pl.coderslab.repository")
public class AppConfig implements WebMvcConfigurer {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean entityManagerFactoryBean
                = new LocalEntityManagerFactoryBean();
        entityManagerFactoryBean.setPersistenceUnitName("workshopHibernate");
        return entityManagerFactoryBean;
    }
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager =
                new JpaTransactionManager(entityManagerFactory);
        return jpaTransactionManager;
    }
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    @Bean(name = "localeResolver")
    public LocaleContextResolver getLocaleContextResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl", "PL"));
        return localeResolver;
    }
//    @Override public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
//        stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "html", Charset.forName("UTF-8"))));
//        converters.add(stringConverter); }
}