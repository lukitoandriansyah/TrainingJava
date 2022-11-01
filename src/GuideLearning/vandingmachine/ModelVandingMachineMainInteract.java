package GuideLearning.vandingmachine;

import java.util.Scanner;

public class ModelVandingMachineMainInteract extends ModelVandingMachineChecking {
    Scanner sc = new Scanner(System.in);

    public int inputMoney() {
        Integer input = sc.nextInt();
        return input;
    }

    public void reInputMoneyCheck(){
        System.out.println("==============================");
        System.out.print("Masukkan uang anda: ");
        inputMoneyCheck();
    }

    public void inputMoneyCheck() {
        try{
            int input = inputMoney();
            int indicator = 0;
            for (int k = 0; k < moneyMayList.length; k++) {
                if (input == Integer.parseInt(moneyMayList[k])) {
                    indicator = 0;
                    savedInput += input;
                    chooseSnack(savedInput);
                } else if(input==0){
                    indicator += 1;
                    {
                        if (indicator == moneyMayList.length) {
                            System.out.println(" ");
                            System.out.println("========= Failed ========");
                            System.out.println("Anda harus memasukkan uang dahulu \n");
                            indicator = 0;
                            reInputMoneyCheck();
                        }
                    }
                }else {
                    indicator += 1;
                    {
                        if (indicator == moneyMayList.length) {
                            System.out.println(" ");
                            System.out.println("========= Failed ========");
                            System.out.println("Nominal uang anda input tidak diijinkan \n");
                            indicator = 0;
                            reInputMoneyCheck();
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println(" ");
            System.out.println("========= Failed ========");
            System.out.println("Nominal harus bilangan bulat positif sesuai nominal  yang diijinkan");
            System.out.println("");
        }

    }

    public void cancel(){
        System.out.println(" ");
        System.out.println("========= Succeeded ========");
        System.out.print("Anda membatalkan transaksi \n");
        System.out.println("Uang Anda sebesar " + savedInput + " kami kembalikan \n");
        savedInput=0;
    }

    public void reOptionLessMoney(){
        optionLessMoney();
    }

    public void optionLessMoney(){
        System.out.println("========== Choose One ========");
        System.out.println("1.  Tambah nominal uang");
        System.out.println("2.  Pilih menu lain");
        System.out.println("3.  Batalkan Transaksi");
        System.out.println("4.  Matikan mesin (Khusus Penjaga)");
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

            case 3:
                cancel();
                break;

            default:
                System.out.println("Pilihan Salah, Pilih 1, 2 atau 3 \n");
                reOptionLessMoney();
        }
    }

    public void reChooseSnack(int savedInput) {
        chooseSnack(savedInput);
    }
    public void chooseSnack(int input) {
        System.out.print("Nomor urut list produk yang mau anda beli: ");
        Integer inputChoose = sc.nextInt();
        if(inputChoose>stockList.length){
            System.out.println(" ");
            System.out.println("========= Failed ========");
            System.out.println("Input anda tidak bisa diproses, lakukan pemilihan menu ulang sesuai list yang ada" + "\n");
            reChooseSnack(input);
        }else {
            chooseStock(inputChoose, input);
        }
    }

    public void chooseStock(int inputChoose, int input){
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
                                d.serveBuy(snackList[i] + "\n");
                                System.out.print("Harga: " + priceList[j] + "\n");
                                System.out.print("Banyak Snack: " + inputTotalStock + "\n");
                                System.out.print("Total Harga: " + Integer.parseInt(priceList[j]) * inputTotalStock + "\n");
                                stockList[k] = String.valueOf(Integer.parseInt(stockList[j]) - inputTotalStock);
                                System.out.print("Uang Anda: " + savedInput + "\n");
                                d.serveCashBack((savedInput - (Integer.parseInt(priceList[j]) * inputTotalStock)) + "\n\n");
                                savedInput = 0;
                                break;
                            }else {
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.print("Uang anda kurang!!!\n");
                                System.out.print("Snack yang ingin anda beli memiliki harga Total Harga: " + (Integer.parseInt(priceList[j]) * inputTotalStock) + "\n");
                                System.out.println("Uang Anda: " + savedInput + "\n");
                                optionLessMoney();
                                break;
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
                                d.detectStock("Kosong, lakukan pemilihan menu ulang" + "\n");
                                reChooseSnack(input);
                                break;
                            }else{
                                System.out.println(" ");
                                System.out.println("========= Failed ========");
                                System.out.println("Input anda tidak bisa diproses, lakukan pemilihan menu ulang" + "\n");
                                reChooseSnack(input);
                                break;
                            }
                        }

                    }
                }
            }
        }
    }
}
