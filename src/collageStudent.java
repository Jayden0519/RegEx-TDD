public class collageStudent
{
    private String name;
    private int IdNum; // an 8-digit number
    private int dormNum; // a dorm number varying from 0 - 9

    public collageStudent(String name, int IdNum, int dormNum) {
        setName(name);
        this.IdNum = IdNum;
        this.dormNum = dormNum;
    }
    public collageStudent ()
        {
            name = "";
            IdNum = 0;
            dormNum = 0;
        }

    public String getName()
    {
        return name;
    }
    public int getIdNum()
    {
        return IdNum;
    }

    public int getDormNum()
    {
        return dormNum;
    }


    public void setName(String name) {
        if(!name.matches("[A-Z][zA-Z]*"))
        {
            System.out.println("Please try again");
            this.name = "jayden";
        }
        else
        {
            this.name = name;
        }
    }


    @Override
    public String
    toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", height=" + IdNum +
                ", age=" + dormNum +
                '}';
    }
}
