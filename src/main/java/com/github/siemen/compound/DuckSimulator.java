
package com.github.siemen.compound;

import com.github.siemen.compound.impl.CountingDuckFactory;
import com.github.siemen.compound.impl.DuckCall;
import com.github.siemen.compound.impl.Flock;
import com.github.siemen.compound.impl.GooseAdapter;
import com.github.siemen.compound.impl.MallardDuck;
import com.github.siemen.compound.impl.QuackCounter;
import com.github.siemen.compound.impl.Quackologist;
import com.github.siemen.compound.impl.RedHeadDuck;
import com.github.siemen.compound.impl.RubberDuck;

/**
 * <b>描述：鸭子模拟器</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redHeadDuck = factory.createRedHeadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();

        //适配鹅为鸭子
        Quackable goose = new GooseAdapter(new Goose());

        // 按群管理
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock  flockOfMallards = new Flock();
        Quackable mallardDuckOne = factory.createMallardDuck();
        Quackable mallardDuckTow = factory.createMallardDuck();
        Quackable mallardDuckThree = factory.createMallardDuck();
        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTow);
        flockOfMallards.add(mallardDuckThree);
        flockOfDucks.add(flockOfMallards);

        Observer logist = new Quackologist();
        flockOfDucks.registerObserver(logist);

        System.out.println("Duck simulator...Whole Flock Simulator");
        simulate(flockOfDucks);
        System.out.println("Duck simulator...Mallard duck Simulator");
        simulate(flockOfMallards);



/*        System.out.println("Duck simulator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        */
        System.out.println("The ducks quacked .." + QuackCounter.getQuacks() + " ..times");

    }

/*    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall()) ;
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        //适配鹅为鸭子
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("Duck simulator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        System.out.println("The ducks quacked .." + QuackCounter.getQuacks() + " ..times");
    }*/

    private void simulate(Quackable duck) {
        duck.quack();
    }
}