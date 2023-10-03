package Corejavaprogamswithbulidinmethods;

public class RemoveStringsEndingWithS {
    public static void main(String[] args) {
        String a[] = {"test", "tests", "tester", "testers"};

        for (String str : a) {
            if (!str.startsWith("s")) {
                System.out.println(str);
            }
        }
    }
}
