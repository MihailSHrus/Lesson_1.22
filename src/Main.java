public class Main {
    public static void main(String[] args) {
        System.out.println("Пункт а)");
        int test1 = 20;
        double test2 = 99.99;
        Double d1 = Double.valueOf(test1);
        Double d2 = Double.valueOf(test2);
        System.out.println(d1 + "\n" + d2);
        System.out.println("Пункт б)");
        String test3 = "1";
        double d3 = Double.parseDouble(test3);
        System.out.println(d3);
        System.out.println("Пункт в)");
        byte s1 = Byte.parseByte(test3);
        short s2 = Short.parseShort(test3);
        int s3 = Integer.parseInt(test3);
        long s4 = Long.parseLong(test3);
        float s5 = Float.parseFloat(test3);
        double s6 = Double.parseDouble(test3);
        boolean s7 = Boolean.parseBoolean(test3);
        System.out.println("Строка 1 к byte = " + s1 + "\n" +
                            "Строка 1 к short = " + s2 + "\n" +
                            "Строка 1 к int = " + s3 + "\n" +
                            "Строка 1 к long = " + s4 + "\n" +
                            "Строка 1 к float = " + s5 + "\n" +
                            "Строка 1 к double = " + s6 + "\n" +
                            "Строка 1 к boolean = " + s7);
        System.out.println("Пункт г)");
        System.out.println("С помощью метода toString() получаем значение из объекта Double");
        System.out.println(d1.toString());
        System.out.println("Пункт д)");
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}