package n4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private int n;
    private List <PC> pc = new ArrayList<PC>();

    public void addPC(Scanner sc){
        System.out.println("Название компьютера: ");

        String title = sc.next();
        System.out.println("Цена: ");
        int cost = sc.nextInt();
        pc.add(new PC(title,cost));

    }

    public PC searchPC(String title){
        for (int i = 0; i<n;i++){
            if (pc.get(i).getName().equals(title)){
                return pc.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Количество PC: ");
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        shop.n = sc.nextInt();

        for (int i= 0; i<shop.n;i++){
            shop.addPC(sc);
        }
        System.out.println("Поиск: ");
        String title = sc.next();
        PC search = shop.searchPC(title);
        if (search == null){
            System.out.println("Такого компьютера не существует");
        }else{
            System.out.println(search.toString());
        }

    }
}
