package Produc;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product(1, "stylo", 3000, 20, "bútbi");
        Product product1 = new Product(2, "milk", 10000, 30, "sữa tươi");
        Product product2 = new Product(3, "candy", 30000, 10, "socola");
        Product product3 = new Product(4, "bread", 5000, 10, "bánh mì");
        Product product4 = new Product(5, "salt", 5000, 20, "muối");
        Product[] products = {product, product1, product2, product3, product4};
        int choie;
        do {
            System.out.println("Menu.");
            System.out.println("1.Tạo mới 1 đối tượng Product và thêm vào mảng");
            System.out.println("2.Sửa thông tin 1 đối tượng Product dựa theo id nhập vào");
            System.out.println("3.Xóa 1 đối tương Product khỏi mảng dựa theo id nhập vào");
            System.out.println("4.Hiển thị tất cả các Product có trong mảng");
            System.out.println("5.Hiển thị các Product có giá lớn nhất (price)");
            System.out.println("6.Hiển thị các Product có giá nhỏ nhất (price)");
            System.out.println("7.Hiển thị các Product có số lượng lớn nhất (quantity)");
            System.out.println("8.Hiển thị các Product có số lượng nhỏ nhất (quantity)");
            System.out.println("9.Tính tổng tiền hàng hiện có (tổng của giá x số lượng của tất cả sản phẩm)");
            System.out.println("0.Exit");
            System.out.println("Nhập choie: ");
            choie = scanner.nextInt();
            switch (choie) {
                case 1:
                    System.out.println("1.Tạo mới 1 đối tượng Product và thêm vào mảng");

                    System.out.println("nhập id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập name");
                    String name = scanner.nextLine();
                    System.out.println("prime");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập quantity");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập descripton");
                    String description = scanner.nextLine();


                    Product product5 = new Product(id, name, price, quantity, description);
                    Product[] arrNewProduct = new Product[6];
                    for (int i = 0; i < arrNewProduct.length - 1; i++) {
                        arrNewProduct[i] = products[i];
                    }
                    arrNewProduct[arrNewProduct.length - 1] = product5;

                    for (int i = 0; i < arrNewProduct.length; i++) {
                        System.out.println(arrNewProduct[i].toString());
                    }
                    break;
                case 2:
                    System.out.println("2.Sửa thông tin 1 đối tượng Product dựa theo id nhập vào");
                    System.out.println("nhập id");
                    id = scanner.nextInt();
                    for (int i = 0; i < products.length; i++) {
                        if (products[i].getId() == id) {
                            System.out.println("edit id");
                            products[i].setId(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("nhập name");
                            products[i].setName(scanner.nextLine());
                            System.out.println("nhâp price");
                            products[i].setPrice(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("nhập Quantity");
                            products[i].setQuantity(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("nhập Description");
                            products[i].setDescription(scanner.nextLine());
                            System.out.println(products[i].toString());
                        }

                    }

                    break;
                case 3:
                    System.out.println("3.Xóa 1 đối tương Product khỏi mảng dựa theo id nhập vào");
                    System.out.println("nhập id");
                    id = scanner.nextInt();
                    Product[] products1 = new Product[products.length - 1];
                    int index = 0;
                    for (int i = 0; i < products.length; i++) {
                        if (products[i].getId() == id) {
                            index = i;

                        }
                    }
                    int index1 = 0;
                    for (int i = 0; i < products.length; i++) {
                        if (i != index) {
                            products1[index1] = products[i];
                            index1++;

                        }
                    }
                        products =products1;
                    for (int i = 0; i < products1.length; i++) {
                        System.out.println(products1[i].toString());
                    }


                case 4:
                    System.out.println("4.Hiển thị tất cả các Product có trong mảng");
                    for (int i = 0; i <products.length ; i++) {
                        System.out.println(products[i].toString());
                    }

                case 5:
                    System.out.println("5.Hiển thị  Product có giá lớn nhất (price)");
                    double max =products[0].getPrice();
                    int count =0;
                    for (int i = 0; i < products.length; i++) {
                        if(products[i].getPrice()>max){
                     max = products[i].getPrice() ;
                         count=i;
                        }
                    }
                    System.out.println(products[count].toString());

                case 6:
                    System.out.println("6.Hiển thị các Product có giá nhỏ nhất (price)");
                    double min =products[0].getPrice();
                    int count1 =0;
                    for (int i = 0; i < products.length; i++) {
                        if(products[i].getPrice()>min){
                            min = products[i].getPrice() ;
                            count1=i;
                        }
                    }
                    System.out.println(products[count1].toString());
                case 7:
                    System.out.println("7.Hiển thị các Product có số lượng lớn nhất (quantity)");
                    double max1 =products[0].getQuantity();
                    int count2 =0;
                    for (int i = 0; i < products.length; i++) {
                        if(products[i].getQuantity()>max1){
                            max1= products[i].getQuantity() ;
                            count2=i;
                        }
                    }
                    System.out.println(products[count2].toString());
                case 8:
                    System.out.println("8.Hiển thị các Product có số lượng nhỏ nhất (quantity)");
                    double min1 =products[0].getQuantity();
                    int count3 =0;
                    for (int i = 0; i < products.length; i++) {
                        if(products[i].getQuantity()>min1){
                            min1 = products[i].getQuantity() ;
                            count3=i;
                        }
                    }
                    System.out.println(products[count3].toString());
                case 9:
                    System.out.println("9.Tính tổng tiền hàng hiện có (tổng của giá x số lượng của tất cả sản phẩm)");
                    double sum =0;
                    for (int i = 0; i < products.length; i++) {
                        sum += products[i].getPrice()*products[i].getQuantity();
                    }
                    System.out.println(sum);
                case 10:
                    System.exit(0);

            }

        }
        while (choie != 0);
    }
}

