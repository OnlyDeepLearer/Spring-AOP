//package com.example.springaop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Aspect
//@Order(1)
//@Component
//public class MyAspect {
//
////
////    @Before("execution(public * com.example.springaop.UserService.*(..))")
//////    @AfterReturning(pointcut = "execution(public * com.example.springaop.UserService.*())",
//////            returning = "result")
////    public String beforeAspect(JoinPoint joinPoint) {
////        System.out.println("\n--------------------------------\n");
////
////        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
////        System.out.println("methodSignature = " + methodSignature);
////
////
////        Arrays.stream(joinPoint.getArgs()).forEach(System.out::println);
////
////        for (Object arg : joinPoint.getArgs()) {
////            arg = "Salom";
////        }
////
////        System.out.println(" Working before getAll() method ");
////        System.out.println("I'm @Before aspect");
////        System.out.println("\n--------------------------------\n");
////        return "sds";
////    }
//
//
//
//
//    @After("execution(public * com.example.springaop.UserService.*(..))")
//    private void afterAspect(){
//        System.out.println("\n******** After *********\n");
//    }
//
//
//
//    @AfterReturning("execution(public * com.example.springaop.UserService.*(..))")
//    private void afterReturningAspect(){
//
//        System.out.println("\n******** AfterReturning *********\n");
//    }
//
//
//    @AfterThrowing("execution(public * com.example.springaop.UserService.*(..))")
//    private void afterThrowingAspect(){
//        System.out.println("\n******** AfterThrowing *********\n");
//
//    }
//
//
//
//}
