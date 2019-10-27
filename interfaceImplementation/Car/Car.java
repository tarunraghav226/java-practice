package Car;
import .interfaces.Owner;
public class Car implements Owner{
    private String carOwner;
    private String carPrice;
    private String carCompany;
    private String carFurniture;
    private String carLights;
    private String carModel;
    private String carMirrorsAndShields;
    private String carWheel;

    public Car(){
        this.carOwner="";
        this.carPrice="";
        this.carCompany="";
        this.carFurniture="";
        this.carLights="";
        this.carModel="";
        this.carMirrorsAndShields="";
        this.carWheel="";
    }

    public Car(String carOwner,String carPrice,String carCompany,String carFurniture,String carLights,String carModel,String carMirrorsAndShields,String carWheel){
        this.carOwner=carOwner;
        this.carPrice=carPrice;
        this.carCompany=carCompany;
        this.carFurniture=carFurniture;
        this.carLights=carLights;
        this.carModel=carModel;
        this.carMirrorsAndShields=carMirrorsAndShields;
        this.carWheel=carWheel;
    }

    public void setCarOwner(String carOwner){this.carOwner=carOwner;}
    public void setCarPrice(String carPrice){this.carPrice=carPrice;}
    public void setCarCompany(String carCompany){this.carCompany=carCompany;}
    public void setCarFurniture(String carFurniture){this.carFurniture=carFurniture;}
    public void setCarLights(String carLights){this.carLights=carLights;}
    public void setCarModel(String carModel){this.carModel=carModel;}
    public void setCarMirrorsAndShields(String carMirrorsAndShields){this.carMirrorsAndShields=carMirrorsAndShields;}
    public void setCarWheel(String carWheel){this.carWheel=carWheel;}

    public String getCarOwner(){return this.carOwner;}
    public String getCarPrice(){return this.carPrice;}
    public String getCarCompany(){return this.carCompany;}
    public String getCarFurniture(){return this.carFurniture;}
    public String getCarLights(){return this.carLights;}
    public String getCarModel(){return this.carModel;}
    public String getCarMirrorsAndShields(){return this.carMirrorsAndShields;}
    public String getCarWheel(){return this.carWheel;}

    public void displayOwnerName(){
        System.out.println("Owner Name Is -- > "+this.getCarOwner());
    }
}