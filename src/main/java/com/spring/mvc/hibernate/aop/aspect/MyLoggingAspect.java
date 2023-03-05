package com.spring.mvc.hibernate.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.spring.mvc.hibernate.aop.DAO.*.*(..))")
    public Object aroundAllRepMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        String methodName = methodSignature.getName();

        System.out.println("Начинает работать " + methodName);

        Object targetMethodRes = proceedingJoinPoint.proceed();
        System.out.println(""+ methodName + " закончил работу");

        return targetMethodRes;
    }
}
