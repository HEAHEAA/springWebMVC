package com.springboot.springbootboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
src/main/java : 패키지와 클래스 파일
src/main/resource
-static : css/js 파일
-templates : html파일(표준)
-application.properties : 환경설정파일
*/

@SpringBootApplication
public class SpringBootBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBoardApplication.class, args);
    }

}
