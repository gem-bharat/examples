package com.Test;

import com.Test.entity.Student;
import com.Test.jdbc.JdbcConnection;
import com.Test.lambda.LambdaDemo;
import com.Test.optional.Optionalobj;
import com.Test.streams.Streams;

public class Test {
    public static <exception extends Throwable> void main(String[] args) {
        System.out.println("Maven Test");
        System.out.println("Hello World");

        //creating student
        Student student = new Student();
        student.setId(1L);
        student.setName("Bharat");
        student.setPhone("xyz");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getPhone());

        //Lambda
        LambdaDemo lambdaDemo=new LambdaDemo();
        lambdaDemo.lambdaExample();

        //JDBC
        JdbcConnection jdbcConnection = new JdbcConnection();
        jdbcConnection.CreateConnection();

        //stream
        Streams streams = new Streams();
        streams.streamUsage();

        //optionalFunctionality
        Optionalobj optionalobj =new Optionalobj();

        try {
            optionalobj.nonOptional();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        optionalobj.optionalFUnctionality();


    }
}
