import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author percy
 * @create 2019-02-02  下午11:12
 * @descreption:增强类
 **/
@Aspect
public class Book {
    @Before(value = "execution(* MyBook.add(..))")
    public void beforeadd(){
        System.out.println("前置增强......");
    }
    @After(value = "execution(* MyBook.add(..))")
    public void afteradd(){
        System.out.println("后置增强......");
    }
    @Around(value = "execution(* MyBook.add(..))")
    public void aroundadd(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕增强开始......");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强结束......");
    }
    @AfterReturning(value = "execution(* MyBook.add(..))")
    public void after_returning_add(){
        System.out.println("最终增强......");
    }

}
