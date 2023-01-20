package com.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Order(1)
@Component
public class MyAspect {


    @Before("execution(public * com.example.springaop.UserService.*(..))")
//    @AfterReturning(pointcut = "execution(public * com.example.springaop.UserService.*())",
//            returning = "result")
    public String beforeAspect(JoinPoint joinPoint, String result) {
        System.out.println("\n--------------------------------\n");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);


        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);

        for (Object arg : joinPoint.getArgs()) {
            arg = "Salom";
        }

        System.out.println(" Working before getAll() method ");
        System.out.println("I'm @Before aspect");
        System.out.println("\n--------------------------------\n");
        return "sds";
    }

}
