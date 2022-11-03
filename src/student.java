public class student
{
    private String name;
    private int height; // in inches
    private int age;

    private String SSN;

    public student(String name, int height, int age) {
        setName(name);
        this.height = height;
        this.age = age;
    }

    public student ()
        {
            name = "";
            height = 0;
            age = 0;
        }



    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.matches("[A-Z][zA-Z]*"))
        {
            System.out.println("NOPE!");
            this.name = "Reginald";
        }
        else
        {
            this.name = name;
        }

    }


    public String getSSN() {
        return SSN;
    }

    //SSN foRMAT IS 3DIGITS, DASH, 2 DIGITS, DASH, 4 DIGITS

    public void setSSN(String SSN)
    {
        if(SSN.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
            this.SSN = SSN;

        }
        else {
            this.SSN = "please try again";
        }
    }



    @Override
    public String
    toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
