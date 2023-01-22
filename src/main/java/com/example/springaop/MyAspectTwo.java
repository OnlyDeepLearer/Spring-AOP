package com.example.springaop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class MyAspectTwo {


    @Pointcut("execution(* com.example.springaop.UserService.getAll(..))")
    private void pointcutOne() {
    }


    @Pointcut("execution(* com.example.*.UserService.getAll(..))")
    private void pointcutTwo() {
    }


    @Pointcut("execution(* com.example.springaop.UserService.create(..))")
    private void pointcutThree() {
    }


    @Around("pointcutTwo()")
    public Object aroundAspect(ProceedingJoinPoint proceedingJoinPoint) {

        System.out.println("before around");
        Object proceed;

        try {
            proceed = proceedingJoinPoint.proceed();
            System.out.println("proceed = " + proceed);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


        System.out.println("after around");

        return proceed;


    }


//    @Before("pointcutOne() && pointcutTwo()")
//    private void beforeAspectForMethod2(JoinPoint joinPoint) {
//
//        System.out.println("joinPoint.getSignature() = " + joinPoint.getSignature());
//        System.out.println("\n---------------- before aspect 1-------------\n");
//    }


//    @Before("execution( * com.example.springaop.UserService.get(..))")
//    private void beforeAspectForMethod(JoinPoint joinPoint) {
//        System.out.println("\n---------------- before aspect 1-------------\n");
//    }


//    @AfterReturning(pointcut = "execution( * com.example.springaop.UserService.*(..))")
//    private void afterReturningAspectForMethod(JoinPoint joinPoint) {
//
//        System.out.println("\n---------------- after returning aspect-------------\n");
//    }


//    @AfterThrowing(pointcut = "execution( * com.example.springaop.*.*(..))", throwing = "ex")
//    private void afterThrowingAspectForMethod(Throwable ex) {
//
//        System.out.println("ex.getMessage() = " + ex.getMessage());
//        System.out.println("\n---------------- after throwing aspect-------------\n");
//    }
//
//    @After("execution( * com.example.springaop.*.*(..))")
//    private void afterAspectForMethod() {
//        System.out.println("\n---------------- after aspect-------------\n");
//    }

}
