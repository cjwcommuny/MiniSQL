package interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultInterpreterTest {
    private DefaultInterpreter interpreter = new DefaultInterpreter();

    @Before
    public void setUp() throws Exception {
    }

    public static void main(String[] args) {
        new DefaultInterpreterTest().testCreateTable();
        new DefaultInterpreterTest().testDropTable();
        new DefaultInterpreterTest().testCreateIndex();
        new DefaultInterpreterTest().testDropIndex();
        new DefaultInterpreterTest().testSelectInstruction1();
        new DefaultInterpreterTest().testSelectInstruction2();
        new DefaultInterpreterTest().testSelectInstruction3();
        new DefaultInterpreterTest().testInsertTuple();
        new DefaultInterpreterTest().testDeleteTuple1();
        new DefaultInterpreterTest().testDeleteTuple2();
        new DefaultInterpreterTest().testDeleteTuple3();
        new DefaultInterpreterTest().testQuit();
        new DefaultInterpreterTest().testExecFile();
    }

    public void testCreateTable() {
        interpreter.parseSingleInstruction(
                "create table student ( \n" +
                "    sno char(8),\n" +
                "    sname char(16) unique, \n" +
                "    sage int,\n" +
                "    sgender char (1), \n" +
                "    primary key ( sno )\n" +
                ");"
        );
    }

    public void testDropTable() {
        interpreter.parseSingleInstruction("drop table student;");
    }

    public void testCreateIndex() {
        interpreter.parseSingleInstruction("create index stunameidx on student ( sname );");
    }

    public void testDropIndex() {
        interpreter.parseSingleInstruction("drop index stunameidx;");
    }

    public void testSelectInstruction1() {
        interpreter.parseSingleInstruction("select * from student;");
    }

    public void testSelectInstruction2() {
        interpreter.parseSingleInstruction("select * from student where sno = '88888888';");
    }

    public void testSelectInstruction3() {
        interpreter.parseSingleInstruction("select * from student where sage > 20 and sgender = 'F';");
    }

    public void testInsertTuple() {
        interpreter.parseSingleInstruction("insert into student values (‘12345678’,’wy’,22,’M’);");
    }

    public void testDeleteTuple1() {
        interpreter.parseSingleInstruction("delete from student;");
    }

    public void testDeleteTuple2() {
        interpreter.parseSingleInstruction("delete from student where sno = ‘88888888’;");
    }

    public void testDeleteTuple3() {
        interpreter.parseSingleInstruction("delete from student values (‘12345678’,’wy’,22,’M’);");
    }

    public void testQuit() {
        interpreter.parseSingleInstruction("quit;");
    }

    public void testExecFile() {
        interpreter.parseSingleInstruction("execfile 'hello'");
    }
}