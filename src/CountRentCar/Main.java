package CountRentCar;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public String NumberOfFamily() {
        System.out.print("Number of Family: ");
        String numberOfFamily = sc.nextLine();
        String[] arrNumberOfFamily = numberOfFamily.split("");
        for (String s : arrNumberOfFamily) {
            for (String ss : s.split("")) {
                try {
                    if (!(Integer.parseInt(ss) == 0 || Integer.parseInt(ss) == 1 || Integer.parseInt(ss) == 2 || Integer.parseInt(ss) == 3 ||
                            Integer.parseInt(ss) == 4 || Integer.parseInt(ss) == 5 || Integer.parseInt(ss) == 6 || Integer.parseInt(ss) == 7 ||
                            Integer.parseInt(ss) == 8 || Integer.parseInt(ss) == 9)) {
                        return "Please Input Integer Number";
                    }
                } catch (Exception e) {
                    return "Please Input Integer Number";
                }
            }
        }
        return numberOfFamily;
    }

    public String NumberEachMemberOfFamily() {
        System.out.print("Number Each Member of Family: ");
        String numberEachMember = sc.nextLine();
        String[] arrNumberEachMember = numberEachMember.split("");
        for (String s : arrNumberEachMember) {
            for (String ss : s.split("")) {
                try {
                    if (!(Objects.equals(ss, " ") || Integer.parseInt(ss) == 0 || Integer.parseInt(ss) == 1 || Integer.parseInt(ss) == 2 || Integer.parseInt(ss) == 3 ||
                            Integer.parseInt(ss) == 4 || Integer.parseInt(ss) == 5 || Integer.parseInt(ss) == 6 || Integer.parseInt(ss) == 7 ||
                            Integer.parseInt(ss) == 8 || Integer.parseInt(ss) == 9)) {
                        return "Please Input Integer Number";
                    }
                } catch (Exception e) {
                    return "Please Input Integer Number";
                }
            }
        }
        return numberEachMember;
    }

    public void Matched() {
        String numberOfFamily = NumberOfFamily();
        String numberEachMemberFamily = NumberEachMemberOfFamily();
        String[] numberEachMember = numberEachMemberFamily.split(" ");
        StringBuilder status = new StringBuilder();
        try {
            if (numberEachMember.length == Integer.parseInt(numberOfFamily)) {
                listNumberEachMemberFamily(numberEachMemberFamily);
                ArrayList<Integer> newListAlt = new ArrayList<>();

                for (int i = 0; i < listNumberEachMemberFamily(numberEachMemberFamily).size(); i++) {
                    newListAlt.add(listNumberEachMemberFamily(numberEachMemberFamily).get(i));
                }

                ArrayList<Integer> possibleRent = new ArrayList<>();
                int plus = 0;
                for (int i = 0; i < newListAlt.size(); i++) {
                    if (newListAlt.get(i) > 4) {
                        possibleRent.add(4);
                        if (newListAlt.get(newListAlt.size() - 1) > 4) {
                            newListAlt.add(0);
                        }
                        newListAlt.set(i, 0);
                        newListAlt.set(i + 1, newListAlt.get(i + 1) + newListAlt.get(i) - 4);
                    }
                    if (newListAlt.get(i) >= 0 && newListAlt.get(i) <= 4) {
                        int indexPlus = getRandomIndex(newListAlt,i);
                        if (newListAlt.get(indexPlus) > 0 && newListAlt.get(indexPlus)<4) {
                            plus = plus + (4 - newListAlt.get(i));
                            if(plus >= newListAlt.get(indexPlus)){
                                if (newListAlt.get(i) + plus != 0) {
                                    possibleRent.add(newListAlt.get(i) + plus);
                                }
                                if (newListAlt.get(newListAlt.size() - 1) > 4) {
                                    newListAlt.add(0);
                                }
                                newListAlt.set(i, 0);
                                newListAlt.set(indexPlus, 0);
                            }
                            else {
                                if (newListAlt.get(i) + plus != 0) {
                                    possibleRent.add(newListAlt.get(i) + plus);
                                }
                                if (newListAlt.get(newListAlt.size() - 1) > 4) {
                                    newListAlt.add(0);
                                }
                                newListAlt.set(i, 0);
                                newListAlt.set(indexPlus, newListAlt.get(indexPlus) - plus);
                            }
                        } else {
                            possibleRent.add(newListAlt.get(i) + plus);
                            if (newListAlt.get(newListAlt.size() - 1) > 4) {
                                newListAlt.add(0);
                            }
                            newListAlt.set(i, 0);
                        }
                        plus -=plus;
                    }
                }
                System.out.print("Minimum Car: " + possibleRent.size());
            } else {
                status.append("Input must be equal with count of family");
                System.out.println(status);
            }
        } catch (Exception e) {
            status.append("Please Input Integer Number");
            System.out.println(status);
        }
    }

    public ArrayList<Integer> listNumberEachMemberFamily(String param) {
        String[] arrParam = param.split(" ");
        ArrayList<Integer> listArrParam = new ArrayList<>();
        for (String s : arrParam) {
            listArrParam.add(Integer.parseInt(s));
        }
        return listArrParam;
    }

    public int getRandomIndex(ArrayList<Integer> list, Integer index) {
        Random rand = new Random();
        if(rand.nextInt(list.size()) == index){
            getRandomIndex(list,index);
        }
        return rand.nextInt(list.size());
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.Matched();
    }
}
