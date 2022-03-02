package javamini;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int feeTotal;

    
    public Student(int id, String name,int grade){
        this.feePaid=0;
        this.feeTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

   

    public void setGrade(int grade){
        this.grade=grade;
    }


    public void payFee(int fee){
        feePaid+=fee;
        College.updateTotalMoneyEarned(feePaid);
    }

 
    public int getId() {
        return id;
    }

  
    public String getName() {
        return name;
    }

 
    public int getGrade() {
        return grade;
    }

    
    public int getFeePaid() {
        return feePaid;
    }

   
    public int getFeeTotal() {
        return feeTotal;
    }

    
    public int getRemainingFee(){
        return feeTotal-feePaid;
    }

    @Override
    public String toString() {
        return "The Student's name :"+name+
                "and the Total fee paid "+ feePaid+ "and The Grade of student is " +grade ;
    }
}