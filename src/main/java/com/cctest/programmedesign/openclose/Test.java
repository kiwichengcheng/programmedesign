package com.cctest.programmedesign.openclose;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96,"testname",348d);
        System.out.println("课程ID:"+javaCourse.getId()+" 课程名称:"+javaCourse.getName()+" 课程价格:"+javaCourse.getPrice());
        Test test = new Test();
        System.out.println(test.getWorkId());
    }



    private Long getWorkId(){
        try {
            String hostAddress = Inet4Address.getLocalHost().getHostAddress();
            int[] ints = StringUtils.toCodePoints(hostAddress);
            int sums = 0;
            for(int b : ints){
                sums += b;
            }
            return (long)(sums % 32);
        } catch (UnknownHostException e) {
            // 如果获取失败，则使用随机数备用
            return RandomUtils.nextLong(0,31);
        }
    }
}
