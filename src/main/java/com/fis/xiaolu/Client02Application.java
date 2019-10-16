package com.fis.xiaolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Client02Application!
 *
 */
@SpringBootApplication
public class Client02Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Client02Application start ......!" );
        SpringApplication.run(Client02Application.class, args);
        System.out.println( "Client02Application success ......!" );
        
    }
}
