package com.topsec.hrpms;

import com.topsec.hrpms.dao.ChecksDao;
import com.topsec.hrpms.dao.EmpDao;
import com.topsec.hrpms.pojo.PayPojo;
import com.topsec.hrpms.service.CheckService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrpmsApplicationTests {

    @Autowired
    private EmpDao empDao;
    @Autowired
    private CheckService checkService;
    @Autowired
    ChecksDao checksDao;

    @Test
        public void contextLoads() throws Exception {

       /* CheckDate checkDate = new CheckDate();
        Boolean boo = checkDate.isEffectiveDate(new Date(),"2019-04-01","2019-05-01");
        System.out.println(boo);*/

        //List<Object[]> result = checkService.getCheckByYearAndMonth("2019","03");
        List<Object[]> result = checksDao.getCheckByYearAndMonth("2019","03");

        List<PayPojo> payPojos = castEntity(result,PayPojo.class);

        //condition:如果condition结果为true,则通过测试
        Assert.assertTrue(payPojos.size()>0);
        //condition:如果condition结果为false,则通过测试.
        Assert.assertFalse(payPojos.size()<0);
        for (PayPojo payPojo : payPojos){
            System.out.println(payPojo.toString());
        }

    }

    public static <T> List<T> castEntity(List<Object[]> list,Class<T> clazz)throws Exception{
        List<T> returnList = new ArrayList<T>();
        Object[] co = list.get(0);
        Class[] c2 = new Class[co.length];

        //确定构造方法
        for (int i = 0; i < co.length; i++){
            c2[i] = co[i].getClass();
        }

        for (Object[] o : list) {
            Constructor<T> constructor = clazz.getConstructor(c2);
            returnList.add(constructor.newInstance(o));
        }
        return returnList;
    }

}
