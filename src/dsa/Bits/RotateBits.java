/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Bits;

/**
 *
 * @author yokukuma
 */
public class RotateBits {

    public static void main(String[] args) {

        String num1 = binaryEquivalane(123);
        System.out.println("Before Rotation: " + num1);
        Integer binaryNumAfterRotation = rotateNumberRight(123, 3);
        String num2 = binaryEquivalane(binaryNumAfterRotation);
        System.out.println("After rotation: " + num2);
    }

    private static String binaryEquivalane(int out) {
        if (out > 0) {
            int a = out % 2;
            out = out / 2;
            return binaryEquivalane(out) + "" + a;
        }
        return "";
    }

    private static Integer rotateNumberLeft(Integer binaryNum, int count) {
        binaryNum = (binaryNum << count) | (binaryNum >> (Integer.SIZE - count));
        return binaryNum;
    }

    private static Integer rotateNumberRight(Integer binaryNum, int count) {
        binaryNum = (binaryNum >> count) | (binaryNum << (Integer.SIZE - count));
        return binaryNum;
    }
}
