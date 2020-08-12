//package com.example.demo.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Arrays;
//import java.util.Enumeration;
//
//@Aspect
//@Component
//@Order(-5)
//public class WebLogAspect {
//    private Logger logger =  LoggerFactory.getLogger(this.getClass());
//    ThreadLocal<Long> startTime = new ThreadLocal<Long>(); //记录时间，解决同步问题
//    @Pointcut("execution(public * com.example.demo.controller.*.*(..))")
//    public void webLog(){}
//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint){
//        //开始时间
//        startTime.set(System.currentTimeMillis());
//        // 接收到请求，记录请求内容
//        logger.info("WebLogAspect.doBefore()");
//
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//
//        HttpServletRequest request = attributes.getRequest();
//        // 记录下请求内容
//
//        logger.info("URL : " + request.getRequestURL().toString());
//
//        logger.info("HTTP_METHOD : " + request.getMethod());
//
//        logger.info("IP : " + request.getRemoteAddr());
//
//        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//
//        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
//
//        //获取所有参数方法一：
//
//        Enumeration<String> enu=request.getParameterNames();
//
//        while(enu.hasMoreElements()){
//
//            String paraName=(String)enu.nextElement();
//
//            System.out.println(paraName+": "+request.getParameter(paraName));
//
//        }
//    }
//    @AfterReturning("webLog()")
//    public void  doAfterReturning(JoinPoint joinPoint){
//        // 处理完请求，返回内容
//
//        logger.info("WebLogAspect.doAfterReturning()");
//        logger.info("耗时（毫秒） : " + (System.currentTimeMillis() - startTime.get()));
//    }
//    /** 后置异常通知**/
//    @AfterThrowing("webLog()")
//    public void throwss(JoinPoint jp){
//        logger.info("【注解：AfterThrowing】方法异常时执行.....");
//    }
//
//}
