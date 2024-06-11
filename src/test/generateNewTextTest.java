package src.test;

import src.Graph.DrawGraphic;

import static org.junit.Assert.assertEquals;

public class generateNewTextTest {
    DrawGraphic d = new DrawGraphic("./TEST.txt");
    static String[] testCase={
            "To explore new world you need courage",
            "seek new and civilizations",
            "there is no bridge word",
            "To explore new world\n you need courage\n",
            "To explore new@ w&*orld you need courage"
    };

    static String[] expects={
            "To explore strange new world you need courage",
            "seek out new life and new civilizations",
            "there is no bridge word",
            "To explore strange new world you need courage",
            "To explore strange new w orld you need courage"
    };

    @org.junit.Test
    public void generateNewTextTest_1() {
        String result = d.generateNewText(testCase[0]);
        assertEquals(expects[0],result);
    }

    @org.junit.Test
    public void generateNewTextTest_2() {
        String result = d.generateNewText(testCase[1]);
        assertEquals(expects[1],result);
    }

    @org.junit.Test
    public void generateNewTextTest_3() {
        String result = d.generateNewText(testCase[2]);
        assertEquals(expects[2],result);
    }

    @org.junit.Test
    public void generateNewTextTest_4() {
        String result = d.generateNewText(testCase[3]);
        assertEquals(expects[3],result);
    }

    @org.junit.Test
    public void generateNewTextTest_5() {
        String result = d.generateNewText(testCase[4]);
        assertEquals(expects[4],result);
    }
}
