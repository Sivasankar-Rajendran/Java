package JavaWithMOsh;

public class M06_EscapeSequences {
    public static void main(String[] args) {

        String name = "John \"Peter\"";
        System.out.println(name);
        // \".. will help to add "
        System.out.println("Sun is \"big\"");

        // C:\Windows\...
        String path = "C:\\Windows\\...";
        System.out.println(path);
        // use \\ for drive location or path

        String path1 = "C:\nWindows\\...";
        System.out.println(path1);
        // \n will add new line

        String path2 = "C:\tWindows\\...";
        System.out.println(path2);
        // \t will add tab space

    }

}
