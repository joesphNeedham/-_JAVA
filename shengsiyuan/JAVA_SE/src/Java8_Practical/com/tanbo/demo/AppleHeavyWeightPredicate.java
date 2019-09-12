package Java8_Practical.com.tanbo.demo;

/**
 * @program: JavaSePractice
 * @description:
 * @author: TanBo
 * @create: 2019-09-12 13:23
 **/
public class AppleHeavyWeightPredicate implements ApplePredicate{
    public boolean test(Apple apple){
        return apple.getWeight()>15;
    }

}
