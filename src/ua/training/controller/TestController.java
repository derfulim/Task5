package ua.training.controller;

import org.junit.*;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class TestController {
//
//    @Rule
//    public final TextFromStandardInputStream systemInMock
//            = emptyStandardInputStream();
//
//    @Rule
//    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
//    private static Controller controller;
//
//    @BeforeClass
//    public static void init() {
//        controller = new Controller();
//    }
//
//    @Test
//     public void testGetInput() {
////        systemInMock.provideText("hello");
////
////        assertEquals( "hello",controller.getUserInput());
////
////        systemInMock.provideText("world");
////        log.clear();
////        controller.getUserInput();
////        assertEquals("{world", "world", log.getLog().trim());
//
//        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
//        System.setIn(in);
//        Scanner scanner = new Scanner(System.in);
//        Assert.assertEquals("My string",controller.getUserInput(scanner) );
//
//        System.setIn(System.in);
//
//     }
}
