package cn.edkso.oco.aop;


import cn.edkso.oco.common.util.R;
import cn.edkso.oco.config.shiro.ThreadLocalToken;
import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TokenAspect {
    @Autowired
    private ThreadLocalToken threadLocalToken;

    @Pointcut("execution(public * cn.edkso.oco.controller.*.*(..))")
    public void aspect() {

    }

    @Around("aspect()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        R r = (R) point.proceed();
        String token = threadLocalToken.getToken();
        if (token != null) {
            r.put("token", token);
            threadLocalToken.clear();
        }
        return r;
    }
}
