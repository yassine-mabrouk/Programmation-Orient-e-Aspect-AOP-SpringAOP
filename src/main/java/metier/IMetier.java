package metier;

import org.springframework.stereotype.Component;

@Component
public interface IMetier {
    public  void process();
    public int compute();
}

