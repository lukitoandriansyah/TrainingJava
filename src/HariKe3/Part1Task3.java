package HariKe3;

public class Part1Task3 {
    String banyakSukuKata(String nama) {
        String[] arrKata = nama.split(" ");
        int jumlahKata = 0;
        for (int i = 0; i < arrKata.length; i++) {
            if (arrKata[i].equalsIgnoreCase("") ||
                    arrKata[i].equalsIgnoreCase(" ")) {

            } else {
                jumlahKata++;
            }
        }
        return Integer.toString(jumlahKata);
    }

    String banyakHurufVokal(String nama) {
        String[] arrHuruf = nama.split("");
        int jumlahHurufVokal = 0;
        int counter = 0;
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") ||
                    arrHuruf[i].equalsIgnoreCase("i") ||
                    arrHuruf[i].equalsIgnoreCase("u") ||
                    arrHuruf[i].equalsIgnoreCase("e") ||
                    arrHuruf[i].equalsIgnoreCase("o")) {
                arrHuruf[i] = Integer.toString(counter++);
                jumlahHurufVokal++;
            }
        }
        return Integer.toString(jumlahHurufVokal);
    }

    String banyakHuruf(String nama) {
        String[] arrHuruf = nama.split("");
        int jumlahHuruf = 0;
        for (int i = 0; i < arrHuruf.length; i++) {
            if (!(arrHuruf[i].equalsIgnoreCase(" "))) {
                jumlahHuruf++;
            }
        }
        return Integer.toString(jumlahHuruf);
    }

    void ubahHurufVokal(String nama) {
        String[] arrHuruf = nama.split("");
        int counter = 1;
        for (int i = 0; i < arrHuruf.length; i++) {
            if (arrHuruf[i].equalsIgnoreCase("a") ||
                    arrHuruf[i].equalsIgnoreCase("i") ||
                    arrHuruf[i].equalsIgnoreCase("u") ||
                    arrHuruf[i].equalsIgnoreCase("e") ||
                    arrHuruf[i].equalsIgnoreCase("o")) {
                arrHuruf[i] = Integer.toString(counter++);
            }
            System.out.print(arrHuruf[i]);
        }
    }//public static void main(String[] args) {
    //    System.out.println(banyakSukuKata("Lukito Andriansyah"));
    //    System.out.println(banyakHurufVokal("Lukito Andriansyah"));
    //    System.out.println(banyakHuruf("Lukito Andriansyah"));
    //    ubahHurufVokal("Lukito Andriansyah");
}

