package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectLogin {
    @Around("@annotation(aspects.Log)")
    public Object log(ProceedingJoinPoint joinPoint) {
        Object result=null;
        Date d1 = new Date();
        System.out.println("Before...." + d1);
        try{result= joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Date d2 = new Date();
        System.out.println("After.... " + d2);
        System.out.println("ExecutionDuration : "+(d2.getTime()-d1.getTime()));
        return result;
    }
}
