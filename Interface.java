
interface Human {
    void work();
}


public class Interface {
    public static void playing()
    {
        System.out.println("My work is to perform better");
    }
    public static void teaching()
    {
        System.out.println( "My work is to teach better");   
    }
    public static void research()
    {
        System.out.println("publish research paper");
    }
    public static void main(String[] args) {
        Human player= Interface :: playing ;
        player.work();

        Human teacher = Interface :: teaching;
        teacher.work(); 

        Human researcher = Interface :: research;
        researcher.work();
        
    }
}
