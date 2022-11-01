package GuideLearning.vandingmachine;

public class ModelVandingMachineChecking extends ModelVandingMachineDo {
    ModelVandingMachineDo d = new ModelVandingMachineDo();

    public void priceList() {
        System.out.println("======= Price List Snack =====");
        for (int i = 0; i < snackList.length; i++) {
            for (int j = 0; j < priceList.length; j++) {
                for (int k = 0; k < stockList.length; k++) {
                    if (i == j && i == k) {
                        System.out.print(i + 1 + ".  ");
                        System.out.print(snackList[i] + " : ");
                        System.out.print(Integer.parseInt(priceList[j]) + "  ");
                        if (Integer.parseInt(stockList[k]) > 0) {;
                            d.detectStock("Tersedia " + Integer.parseInt(stockList[k]));
                        }else{
                            d.detectStock("Tersedia " + Integer.parseInt(stockList[k]));
                            System.out.println("Habis");
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

}
