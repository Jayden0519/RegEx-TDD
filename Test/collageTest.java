import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @Test
    void getJayPasseddIdNum()
    {
        collageStudent jay = new collageStudent();
        jayden.setIdNum("91094638");
        assertTrue(jay.getIdNum().matches(91094638));
    }

    @Test
    void getJayFailedIdNumAddedSpace()
    {
        collageStudent jay = new collageStudent();
        jayden.setIdNum("9109 4638");
        assertTrue(jay.getIdNum().matches("please try again"));
    }

    @Test
    void getJayFailedAddedLetter()
    {
        collageStudent jay = new collageStudent();
        jayden.setIdNum("9109Y4638");
        assertTrue(jay.getIdNum().matches("please try again"));
    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------*/

    @Test
    void getNameSofiaPassedPerfectly()
    {
        collageStudent sofia = new collageStudent();
        sofia.setName("Sofia");
        assertTrue(sofia.getName().matches("sofia"));
    }

    @Test
    void getNameSofiaFailedNum()
    {
        collageStudent sofia = new collageStudent();
        sofia.setName("So7ia");
        assertTrue(sofia.getName().matches("Please try again"));
    }

    @Test
    void getNameSofiaFailedSpace()
    {
        collageStudent sofia = new collageStudent();
        sofia.setName("Sof ia");
        assertTrue(sofia.getName().matches("Please try again"));
    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------*/

    @Test
    void getDormNumPassed()
    {
        collageStudent fabian = new collageStudent();
        fabian.setDormNum(7);
        assertTrue(fabian.getDormNum().matches(7));
    }

    @Test
    void getDormNumFailedStar()
    {
        collageStudent fabian = new collageStudent();
        fabian.setDormNum("*");
        assertTrue(fabian.getDormNum().matches("please try again"));
    }

    @Test
    void getDormNumFailedAbove9()
    {
        collageStudent fabian = new collageStudent();
        fabian.setDormNum(10);
        assertTrue(fabian.getDormNum().matches("please try again"));
    }

    @Test
    void setName() {
    }
}