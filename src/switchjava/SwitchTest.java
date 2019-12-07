package switchjava;

/**
 * Created by z002gh2 on 5/19/19.
 */
public class SwitchTest {
    public static void main(String[] args) {
        String channelName="DIGITAL AUDIO";
        String tableName;

        switch (channelName) {
            case "CATEGORY PR":
                tableName = "ods_category_pr";
                break;
            case "DIGITAL AUDIO":
                tableName = "ods_digital_audio";
                break;
            default:
                tableName = "Invalid Table";
                break;
        }
        System.out.println(tableName);
    }
}