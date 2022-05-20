package staticvariable;


public class StaticVariable {
    
    String name;
    int id;
    static String universityName = "Daffodil"; 
    
    StaticVariable(String n, int i){ 
          
        name = n;
        id = i;
        
}
    
    void display(){
    
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
        
    
    }


    public static void main(String[] args) {
        
        StaticVariable sv = new StaticVariable("Harun",2666);
        sv.display();
        
        StaticVariable sv1 = new StaticVariable("Habib",2629);
        sv1.display();
        
        StaticVariable sv2 = new StaticVariable("Riyaz",2667);
        sv2.display();
        
    }
    
}
