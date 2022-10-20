package LukitoAndriansyah;

import java.util.Scanner;

public class TestJava {
    Scanner sc = new Scanner(System.in);

    static String snacks = "Biskuit Chips Oreo Tango Cokelat";
    static String prices = "6000 8000 10000 12000 15000";
    static String stock = "20 20 20 20 20";
    static String moneyMay = "2000 5000 10000 20000 50000";
    static String[] stockList = stock.split(" ");
    static String[] snackList = snacks.split(" ");
    static String[] priceList = prices.split(" ");
    static String[] moneyMayList = moneyMay.split(" ");
    static boolean isRunning = true;
    static int savedInput = 0;


    public void priceList() {
        System.out.println("======= Price List Snack =====");
        for (int i = 0; i < snackList.length; i++) {
            for (int j = 0; j < priceList.length; j++) {
                for (int k = 0; k < stockList.length; k++) {
                    if (i == j && i == k) {
                        System.out.print(String.valueOf(i + 1) + ".  ");
                        System.out.print(snackList[i] + " : ");
                        System.out.print(Integer.parseInt(priceList[j]) + "  ");
                        if (Integer.parseInt(stockList[k]) > 0) {
                            System.out.println("Tersedia " + Integer.parseInt(stockList[k]));
                        }else{
                            System.out.println("Stok Habis");
                            stockList[k]= String.valueOf(0);
                        }

                    }
                }
            }
        }
    }

    public void moneyList() {
        System.out.println("========= List Money ========");
        for (String s : moneyMayList) {
            System.out.println("=>  " + s);
        }
        System.out.println(" ");
    }

    public int inputMoney() {
        int input = sc.nextInt();
        return input;
    }

    public void reInputMoneyCheck(){
        System.out.println("==============================");
        System.out.print("Masukkan uang anda: ");
        inputMoneyCheck();
    }

    public void inputMoneyCheck() {
        int input = inputMoney();
        int indicator = 0;
        for (int k = 0; k < moneyMayList.length; k++) {
            if (input == Integer.parseInt(moneyMayList[k])) {
                indicator = 0;
                savedInput += input;
                chooseSnack(savedInput);
            } else {
                indicator += 1;
                {
                    if (indicator == moneyMayList.length) {
                        System.out.println(" ");
                        System.out.println("========= Failed ========");
                        System.out.println("Nominal uang anda tidak diijinkan \n");
                        indicator = 0;
                        reInputMoneyCheck();
                    }
                }
            }
        }
    }

    public void reChooseSnack(int savedInput) {
        chooseSnack(savedInput);
    }

    public void reOptionLessMoney(){
        optionLessMoney();
    }

    public void optionLessMoney(){
        System.out.println("========== Choose One ========");
        System.out.println("1.  Tambah nominal uang");
        System.out.println("2.  Pilih menu lain");
        System.out.println("==============================");
        System.out.print("Pilihan Anda: ");
        Integer inputChoose= sc.nextInt();
        switch (inputChoose){
            case 1:
                System.out.println(" ");
                System.out.println("==============================");
                System.out.print("Masukkan uang anda: ");
                inputMoneyCheck();
                break;

            case 2:
                reChooseSnack(savedInput);
                break;
            default:
                System.out.println("Pilihan Salah, Pilih 1 atau 2 \n");
                reOptionLessMoney();
        }
    }

    public void chooseSnack(int input) {
        System.out.print("Nomor urut list produk yang mau anda beli: ");
        Integer inputChoose = sc.nextInt();
        System.out.print("Banyak produk yang mau anda beli: ");
        Integer inputTotalStock = sc.nextInt();
        for (int i = 0; i < snackList.length; i++) {
            for (int j = 0; j < priceList.length; j++) {
                for (int k = 0; k < stockList.length; k++) {
                    if (inputChoose == i + 1 && inputChoose == j + 1 && inputChoose == k + 1) {
                        if (inputTotalStock <= Integer.parseInt(stockList[k]) && Integer.parseInt(stockList[k]) > 0) {
                            if (savedInput >= Integer.parseInt(priceList[j]) && savedInput >= Integer.parseInt(priceList[j]) * inputTotalStock){
                                System.out.println(" ");
                                System.out.println("========= Succeeded ========");
                                System.out.print("Anda membeli: " + snackList[i] + "\n");
                                System.out.print("Harga: " + priceList[j] + "\n");
                                System.out.print("Banyak Snack: " + inputTotalStock + "\n");
                                System.out.print("Total Harga: " + Integer.parseInt(priceList[j]) * inputTotalStock + "\n");
                                stockList[k] = String.valueOf(Integer.parseInt(stockList[j]) - inputTotalStock);
                                System.out.print("Uang Anda: " + savedInput + "\n");
                                System.out.println("Kembalian Anda: " + (savedInput - (Integer.parseInt(priceList[j]) * inputTotalStock)) + "\n");
                                savedInput = 0;
                                break;
                            }else {
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.print("Uang anda kurang!!!\n");
                                System.out.print("Snack yang ingin anda beli memiliki harga Total Harga: " + (Integer.parseInt(priceList[j]) * inputTotalStock) + "\n");
                                System.out.println("Uang Anda: " + savedInput + "\n");
                                optionLessMoney();
                            }
                        } else {
                            if(inputTotalStock > Integer.parseInt(stockList[k]) && Integer.parseInt(stockList[k]) > 0){
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.println("Input anda melebihi stok yang tersedia, lakukan pemilihan menu ulang" + "\n");
                                reChooseSnack(input);
                                break;
                            }if(inputTotalStock <= Integer.parseInt(stockList[k]) && Integer.parseInt(stockList[k]) <= 0){
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.println("Stok Kosong, lakukan pemilihan menu ulang" + "\n");
                                reChooseSnack(input);
                            }else{
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.println("Input anda tidak bisa diproses, lakukan pemilihan menu ulang" + "\n");
                                reChooseSnack(input);
                            }
                        }

                    }
                }
            }
        }
    }

    public static void showMenu() {
        TestJava test = new TestJava();
        test.moneyList();
        test.priceList();
        System.out.println(" ");
        System.out.println("==============================");
        System.out.print("Masukkan uang anda: ");
        test.inputMoneyCheck();
    }

    public static void main(String[] args) {
        do {
            showMenu();
        } while (isRunning);
    }


}
