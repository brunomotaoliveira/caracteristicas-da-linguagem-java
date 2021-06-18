package one.digitalinnovation.tipos.primitivos;

public class Primitivos {

    public static void main(String[] args) {
        //INTEIROS

        //byte nullByte = null;

        byte b;         //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129; //muito grande

        char c;         //16bits
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA';   //NOK
        //char c4 = -100;   //NOK

        short s;        //16bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647;     //32bits
        int i2 = -2147483648;
        //int i3 = -2147483649;     //to large

        long l = 3243242343242342342L;  //64bits
        long l2 = -3243242343242342342L;
        //long l3 = 3243242343242342344342L; // to large

        //FLUTUANTES

        float f = 65f;      //32bits
        float f2 = 65.0f;
        float f3 = -0.5f;  //1.4 E-45

        double d = 1024.99;     //64 bits
        double d2 = 10.2456;

        //Boleano

        boolean bo = true;
        boolean bo2 = false;

        // void v;  //palavra reservada
    }
}
