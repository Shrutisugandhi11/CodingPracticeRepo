package com.epam.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//AOP
//Config
@Aspect
@Configuration
public class AspectConfig {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //what kind of method calls i woiuld intercept
    //execution (* PACKAGE.*.*(..))
    //joint point provides the details of method being intercept
    @Before("execution (* com.epam..*.*(..))")
    public void before(JoinPoint joinPoint){
        //advice
        logger.info("Intercept calls -{}",joinPoint);
    }

    @AfterReturning(value = "execution (* com.epam..*.*(..))",returning = "result")
    public void after(JoinPoint joinPoint,Object result){
        logger.info("After call");
        logger.info("{} Intercept calls -{}",joinPoint,result);
    }

}
