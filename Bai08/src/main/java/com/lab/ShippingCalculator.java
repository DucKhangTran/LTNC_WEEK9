package com.lab;
/**
 * Thư mục target: Nơi chưa sản phẩm tạm thời và cuối cùng của quá trình build
 * Pha package: Một giai đoạn trong vòng đời của Maven có nhiệm vụ đóng gói sản phẩm
 * thành các định dạng lưu trữ như .jar .war để phân phối hoặc triển khai
 */
public class ShippingCalculator {
  public double calculate(double weight, String type) {
    if (weight <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }
    if (type.equals("EXPRESS")) return weight * 5000 + 20000;
    if (type.equals("STANDARD")) return weight * 3000;
    throw new IllegalArgumentException("Unknown type: " + type);
  }

  public static void main(String[] args) {
    ShippingCalculator calculator = new ShippingCalculator();
    double weight = 10;
    String type = "STANDARD";
    System.out.println(calculator.calculate(weight , type));
  }
}
