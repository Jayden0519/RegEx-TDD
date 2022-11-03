import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @Test
    void getAge() {
        student janeth = new student("janeth", 600, 7);
        assertTrue(janeth.getAge() == 7);
    }

    @Test
    void getNameYashFialedSpace() {
        student yashveer = new student();
        yashveer.setName("Yash veer");
        assertTrue(yashveer.getName().matches("Reginald"));
    }

    @Test
    void getNameYashFail1stCap() {
        student yashveer = new student();
        yashveer.setName("yashveer");
        assertTrue(yashveer.getName().matches("Reginald"));
    }

    @Test
    void getNameYashFailedStar() {
        student yashveer = new student();
        yashveer.setName("yashveer*");
        assertTrue(yashveer.getName().matches("Reginald"));
    }

    @Test
    void getNameYashPassedMidCap() {
        student yashveer = new student();
        yashveer.setName("Yashveer");
        assertTrue(yashveer.getName().matches("Reginald"));
    }

    @Test
    void getNameYashFailedNumber() {
        student yashveer = new student();
        yashveer.setName("y4shveer");
        assertTrue(yashveer.getName().matches("Reginald"));
    }

    @Test
    void SSNPassed1()
    {
        student jayden = new student();
        jayden.setSSN("123-45-6789");
        assertTrue(jayden.getSSN().matches("123-45-6789"));
    }

    @Test
    void SSNPassed2()
    {
        student jayden = new student();
        jayden.setSSN("123-45-6780");
        assertTrue(jayden.getSSN().matches("123-45-6780"));
    }

    @Test
    void SSNFail414()
    {
        student jayden = new student();
        jayden.setSSN("1234-1-6780");
        assertTrue(jayden.getSSN().matches("please try again"));
    }

    @Test
    void SSNFailLetters()
    {
        student jayden = new student();
        jayden.setSSN("123-A5-6780");
        assertTrue(jayden.getSSN().matches("please try again"));
    }


    @Test
    void SSNFailNoDashes()
    {
        student jayden = new student();
        jayden.setSSN("123-A5-6780");
        assertTrue(jayden.getSSN().matches("please try again"));
    }


















    @Test
    void setName() {
    }
}