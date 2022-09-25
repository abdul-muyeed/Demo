package LabAssignment2;

import java.util.Scanner;

//  PROBLEM NO 2
public class input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Convert info = new Convert();
        System.out.println("Convert from?");
        info.setConvertFrom(obj.nextLine());
        System.out.println("Convert to?");
        info.setConvertTo(obj.nextLine());
        System.out.println("Value?");
        info.setValue(obj.nextDouble());

        System.out.printf("%.1f %s = %.1f %s",info.getValue(), info.getConvertFrom(),info.getConvertedValue(),info.getConvertTo());
    }
    
}
