package tech.pt_studio.demo0;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Demo0ApplicationTests {
    @Autowired(required = false)
    Author author;
    @Test
    void contextLoad(){
        System.out.println("author = " + author);
    }
}
