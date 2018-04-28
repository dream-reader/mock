package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@Component
public class IOtest {
    private static final Logger log = LoggerFactory.getLogger(IOtest.class);

    @PostConstruct
    public void init()
    {
        IntStream.rangeClosed(1, 20).forEach(t -> {

            new Thread(() -> {

                while (true)
                {
                    log.info("i@##$%#$^%$&^%^*DFGDFGSDFGSDFGWERTWERTGWERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFFFFF");
                }
            }).start();

        });
    }

//    public static void main(String[] args) {
//        System.out.println("i@##$%#$^%$&^%^*DFGDFGSDFGSDFGWERTWERTGWERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFFFFF".getBytes().length);
//    }

}
