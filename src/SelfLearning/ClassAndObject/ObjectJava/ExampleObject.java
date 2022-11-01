package SelfLearning.ClassAndObject.ObjectJava;

public class ExampleObject implements Example {
    String myName;
    int myAge;
    String myAddres;
    Boolean isMarried;

    public ExampleObject(String myName, int myAge,
                         String myAddres, Boolean isMarried){
        this.myAge = myAge;
        this.myName = myName;
        this.myAddres = myAddres;
        this.isMarried =isMarried;
    }

    public String getMyName(){
        return myName;
    }
    public int getMyAge(){
        return myAge;
    }
    public String getMyAddres(){
        return myAddres;
    }
    public Boolean getIsMarried(){
        return isMarried;
    }

    @Override
    public String Example(){
        return ("I'm "+this.getMyName()+" , Age: "+this.getMyAge()+" , In: "+this.getMyAddres()+" , isMarried: "+this.getIsMarried());
    }
}
