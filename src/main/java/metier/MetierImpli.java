package metier;

import aspects.Log;
import aspects.SecureByAspect;
import org.springframework.stereotype.Component;

@Component
public class MetierImpli implements  IMetier{
    @Override
    @Log
    public void process() {
        System.out.println("Process running ....");
    }


    @Override
    @SecureByAspect(roles= {"ADMIN","USER"})
    public int  compute() {
     int data =100;
        System.out.println("Execution compute ....");
        System.out.println("interaction withd data :"+ data);
        return data ;
    }


}
