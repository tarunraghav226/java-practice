package Student;

public class Student {

    private  String name;
    private int roll;
    private float cpi;

    public Student(String name,int roll,float cpi){
        this.name=name;
        this.roll=roll;
        this.cpi=cpi;
    }

    public void setName(String name){this.name=name;}
    public void setRoll(int roll){this.roll=roll;}
    public void setCpi(float cpi){this.cpi=cpi;}

    public String getName(){return this.name;}
    public int getRoll(){return this.roll;}
    public float getCpi(){return this.cpi;}
}