import java.util.UUID;



class crazy {
    public String cool;
    crazy(){
        System.out.println("Hello");
    }
}
/*
    Enums are named constants
 */
@Deprecated
enum Module{
    Storage_db(UUID.fromString("49894213-e63c-415a-953a-f43a29b142f1")), Workspace(UUID.fromString("92a4a278-5eea-4dd0-8d6f-01031a1a21e2"));

    private UUID id;

    private Module(UUID id) {
        this.id = id;
    }

    private Module() {
        this.id = UUID.fromString("b0153396-f21f-47ed-b9fe-111d79302023");
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
public class hello extends crazy {
    hello(){
        System.out.println("Yo");
    }
    public static void main(String[] args){
        new crazy();
        Module temp = Module.Storage_db; 
        Module[] data = Module.values();
        System.out.println(temp.hashCode());
        // System.out.println(data);
        for(Module i:data ){
            System.out.println(i  + " : " + i.getId());
        }

        // crazy var = new crazy();
        // System.out.println(var.cool);
        // // System.out.println("Hello Bro Lets start learning");
        // String test;
        // // System.out.println(test);
        // test = "Hello";
        // System.out.println(test);

        // test = "Shivam";

        // System.out.println(test);
    }
}