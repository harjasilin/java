package course;

public class String1 {
    public static void main(String[] a) {
        String name = "lucky";

        String name2 = new String();
        name2 = "dsb cvjds";
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat("ioio"));

        StringBuffer sb = new StringBuffer("Navin");
        sb.append("rtfgvc");

        sb.insert(0, "dfcs");
        System.out.println(sb);
    }
}
