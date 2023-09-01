package code.buildon.aws.codewhisperer.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
public class TrackExecutionTimeAspect {

    @Around("@annotation(TrackExecutionTime)")
    public Object trackExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        var stopWatch = new StopWatch();

        stopWatch.start();
        Object proceed = joinPoint.proceed();
        stopWatch.stop();

        String methodName = joinPoint.getSignature().getDeclaringTypeName() +
        "." + joinPoint.getSignature().getName();
        System.out.println("⏰ " + methodName + " executed in " + stopWatch.getTotalTimeMillis() + "ms");
        
        return proceed;

    }

}
