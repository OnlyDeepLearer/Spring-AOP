package com.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class MyAspectThree {


    @Before("execution( * com.example.springaop.UserService.*(..))")
    private void beforeAspectForMethod(JoinPoint joinPoint) {



//        for (Object arg : joinPoint.getArgs()) {
//            System.out.println("arg = " + arg);
//        }
//
//        System.out.println("joinPoint.getSignature() = " + joinPoint.getSignature());


        System.out.println("\n---------------- before aspect 2-------------\n");

    }



}
