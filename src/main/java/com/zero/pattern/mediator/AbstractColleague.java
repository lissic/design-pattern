package main.java.com.zero.pattern.mediator;

/**
 * @author zero
 * @description AbstractColleague
 * @date 2022/5/14 12:20
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
