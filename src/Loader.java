/**
 * Created by Роман on 16.11.2016.
 */
public class Loader {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        System.out.println(murzik.getWeight());
        murzik.myaw();
        System.out.println (murzik.getWeight());
        while(murzik.getStatus() !="dead"){
        murzik.myaw();
        System.out.println(murzik.getStatus());
 }
        Cat vaska= new Cat();
//        System.out.println(murzik.getWeight());
//        for (int i=0;i<10;i++)
//            vaska.myaw();
////        System.out.println(vaska.differentWeight());
////        System.out.println(vaska.getStatus());
        while (vaska.getStatus() !="exploded"){
        vaska.feed(1.0);
        System.out.println(vaska.getStatus());
      //      while (vaska.getStatus()!=e)
        }

    }
}
