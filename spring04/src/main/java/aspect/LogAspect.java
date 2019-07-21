package aspect;


import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    public Object Log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start:"+joinPoint.getSignature().getName());
        Object o = joinPoint.proceed();
        System.out.println("end:"+joinPoint.getSignature().getName());
        return o;

    }
}
