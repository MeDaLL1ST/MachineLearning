package com.company;
import java.util.Scanner;

public class Simple_neural_net {

    static int input_neuron1; //1st layer
    static int input_neuron2; //1st layer
    static int output_cast1;
    static int output_cast2;
    static int out;                             // Hello! This code is the simpliest
    static double x1;                           // neural network that implements
    static double x2;                           // the "OR" information element.
    static double x_out;                        // If project dont working,do it:
    static double weight_i1=0.5;                // Edit configurations(top right) >> + >> Application >> Main class ... set Simple_neural_net >>
    static double weight_i2=0.5;                // >> apply >> ok
    static double end_wei1;                     // You can see principle of working in (Resources(left) >> Prin...et.png) and of course in the internet!
    static double end_wei2;
    static double act_wei11=weight_i1/2;
    static double act_wei12=weight_i1/2;
    static double act_wei21=weight_i2/2;
    static double act_wei22=weight_i1/2;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers throught the enter:");
        input_neuron1=scanner.nextInt();
        input_neuron2=scanner.nextInt();
        neural_net();
    }
    static void activation_function1(double x) {   // x=weight*last func value
        if (x>=0.5){
            output_cast1=1;
        }
        if (x<0.5){
            output_cast1=0;
        }
    }
    static void activation_function2(double x) {
        if (x>=0.5){
            output_cast2=1;
        }
        if (x<0.5){
            output_cast2=0;
        }
    }
    static void activation_output(double x_out) {
        if (x_out>=0.5){
            out=1;
        }
        if (x_out<0.5){
            out=0;
        }
        System.out.println("Result: " + out);
    }
        static void neuron1() { //2nd layer
        x1=(act_wei11*input_neuron1)+(act_wei21*input_neuron2);
        activation_function1(x1);
        end_wei1=act_wei11+act_wei21;
    }
        static void neuron2() { //2nd layer
        x2=(act_wei12*input_neuron1)+(act_wei22*input_neuron2);
        activation_function2(x2);
        end_wei2=act_wei11+act_wei21;
    }
        static void neuron_out() { //3rd layer
        x_out=(end_wei1*output_cast1)+(end_wei2*output_cast2);
        activation_output(x_out);
    }
        static void neural_net() {
        neuron1();
        neuron2();
        neuron_out();
    }
}
