//Fitness Tracker
//Create a User class with userName, age, weight, height.
//Method: calculateBMI(), displayUserInfo().

class fitnessTracker{
    private String userName;
    private int age;
    private float weight;
    private float height;

    public fitnessTracker(String userName,int age,float weight,float height){
        this.userName=userName;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    public fitnessTracker(){
        userName = "xyz";
        age = 21;
        weight = 63.45f;
        height = 180.1f;
    }

    public float calculateBMI(){
         float heightInmeter=height/100;
         float squareOfHeight=heightInmeter*heightInmeter;
         return weight/squareOfHeight;
    }
    public void displayUserInfo(){
        System.out.println("Name: "+userName);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
        System.out.println("Height: "+height);
    }
    public String bmicategory(){
        float bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi <25) return "Normal";
        else  return "Overweight";
    }
}

public class myfitnesstracker {
    public static void main(String[] args) {
        fitnessTracker bhavesh = new fitnessTracker("bhavesh", 21,63.45f,183);
        fitnessTracker sujal = new fitnessTracker("sujal",20,80f,178f);
        fitnessTracker abhijeet= new fitnessTracker("abhijeet",21,55,170);


        System.out.println("======USER 1======");
        bhavesh.displayUserInfo();
        System.out.println(bhavesh.calculateBMI());
        System.out.println(bhavesh.bmicategory());
        System.out.println();
        System.out.println("======USER 2======");
        sujal.displayUserInfo();
        System.out.println(sujal.calculateBMI());
        System.out.println(sujal.bmicategory());
        System.out.println();
        System.out.println("======USER 3======");
        abhijeet.displayUserInfo();
        System.out.println(abhijeet.calculateBMI());
        System.out.println(abhijeet.bmicategory());

    }
}
