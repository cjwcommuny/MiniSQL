package interpreter;

import middlelayer.DatabaseFacadeImpl;
import org.junit.Before;

public class DefaultInterpreterTest {
    @Before
    public void setUp() throws Exception {
    }

    public static void main(String[] args) {
        testCreateTable();
    }


    public static void testCreateTable() {
        var interpreter = new DefaultInterpreter(
                new DatabaseFacadeImpl(null, null, null, null));
        interpreter.interpret();
    }

//    public void testParser() {
//        new DefaultInterpreterTest().testCreateTable();
//        new DefaultInterpreterTest().testDropTable();
//        new DefaultInterpreterTest().testCreateIndex();
//        new DefaultInterpreterTest().testDropIndex();
//        new DefaultInterpreterTest().testSelectInstruction1();
//        new DefaultInterpreterTest().testSelectInstruction2();
//        new DefaultInterpreterTest().testSelectInstruction3();
//        new DefaultInterpreterTest().testInsertTuple();
//        new DefaultInterpreterTest().testDeleteTuple1();
//        new DefaultInterpreterTest().testDeleteTuple2();
//        new DefaultInterpreterTest().testDeleteTuple3();
//        new DefaultInterpreterTest().testQuit();
//        new DefaultInterpreterTest().testExecFile();
//    }
//
//    public void testCreateTable() {
//        interpreter.lexSingleInstruction(
//                "create table student ( \n" +
//                "    sno char(8),\n" +
//                "    sname char(16) unique, \n" +
//                "    sage int,\n" +
//                "    sgender char (1), \n" +
//                "    primary key ( sno )\n" +
//                ");"
//        );
//    }
//
//    public void testDropTable() {
//        interpreter.lexSingleInstruction("drop table student;");
//    }
//
//    public void testCreateIndex() {
//        interpreter.lexSingleInstruction("create putIndex stunameidx on student ( sname );");
//    }
//
//    public void testDropIndex() {
//        interpreter.lexSingleInstruction("drop putIndex stunameidx;");
//    }
//
//    public void testSelectInstruction1() {
//        interpreter.lexSingleInstruction("select * from student;");
//    }
//
//    public void testSelectInstruction2() {
//        interpreter.lexSingleInstruction("select * from student where sno = '88888888';");
//    }
//
//    public void testSelectInstruction3() {
//        interpreter.lexSingleInstruction("select * from student where sage > 20 and sgender = 'F';");
//    }
//
//    public void testInsertTuple() {
//        interpreter.lexSingleInstruction("insert into student values ('12345678','wy',22,'M');");
//    }
//
//    public void testDeleteTuple1() {
//        interpreter.lexSingleInstruction("delete from student;");
//    }
//
//    public void testDeleteTuple2() {
//        interpreter.lexSingleInstruction("delete from student where sno = ‘88888888’;");
//    }
//
//    public void testDeleteTuple3() {
//        interpreter.lexSingleInstruction("delete from student where sno = ‘88888888’ and kk = 'lala';");
//    }
//
//    public void testQuit() {
//        interpreter.lexSingleInstruction("quit;");
//    }
//
//    public void testExecFile() {
//        interpreter.lexSingleInstruction("execfile 'C:/hello/xx.txt';");
//    }
}