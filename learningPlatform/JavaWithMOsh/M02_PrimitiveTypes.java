package JavaWithMOsh;

public class M02_PrimitiveTypes {
    public static void main(String[] args) {
        // Variables are two types
        // 1) Primitive - for storing simple values like numbers, chars, booleans
                // Java run time will allocate the memory for these variables
        // 2) Reference - for storing complex objects like date, mail message
                // We have to allocate the membery by giving word 'new', java run time will release the memory

        //PRIMITIVE TYPES (Total = 8)
        // Type        Bytes    Range
        // byte        1       -128, 127
        // short       2       -32K, 32K
        // int         4       -2B, 2B
        // long        8       very big numbers
        // float       4       short decimals
        // double      8       long decimals
        // char        2       A, B, C.,
        // boolean     1       true/false

        byte age = 25;
        short populationInMunicipality = 10000;
        int cityPopulation = 10000000; 
        long totalPopulation =  8000000000L;
        float price = 29.99F;
        double electronSizeInMeter =  0.00000000000000282;
        char letter = 'A';
        boolean isEligible = true;

        System.out.println(age);
        System.out.println(populationInMunicipality);
        System.out.println(cityPopulation);
        System.out.println(totalPopulation);
        System.out.println(price);
        System.out.println(electronSizeInMeter);
        System.out.println(letter);
        System.out.println(isEligible);
    }
    
}
