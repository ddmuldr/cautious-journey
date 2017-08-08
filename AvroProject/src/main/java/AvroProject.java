import com.example.User;

/**
 * Created by dmuld on 8/8/17.
 */
public class AvroProject {
    public static void main(String[] args) {
        User derek = User.newBuilder()
                .setName("Derek")
                .setFavoriteColor("blue")
                .setFavoriteNumber(10)
                .build();

        System.out.println("User built with Avro");
        System.out.println("--------------------");
        System.out.println(String.format("%s's favorite color is %s and favorite number is %s",
                derek.getName(),
                derek.getFavoriteColor(),
                derek.getFavoriteNumber()));
    }
}
