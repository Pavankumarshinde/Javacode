
interface Human {
    void work();
}


public class Main1 {
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
        Human player= Main1 :: playing ;
        player.work();

        Human teacher = Main1 :: teaching;
        teacher.work(); 

        Human researcher = Main1 :: research;
        researcher.work();
        
    }
}
