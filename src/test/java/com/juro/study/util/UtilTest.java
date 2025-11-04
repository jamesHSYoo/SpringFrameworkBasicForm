package com.juro.study.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UtilTest {

    @Test
    public void testLogReturnTest(){

        double price = 322;
        double basePrice = 321;

        System.out.println(Util.getLogReturn(price, basePrice));

    }

    @Test
    public void testTryCatch(){

        int i = 0 ; 
        while(i < 20){
            
            try {
                System.out.println(i);
                if(i%2 == 0){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error occured!");
                // TODO: handle exception
            } finally{
                i++;
            }
            
        }


    }


}
