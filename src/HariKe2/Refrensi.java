package HariKe2;

public class Refrensi {
    public static void main (String args[]){
        String kalimat1 = "Saya akan berusaha sekuat tenaga agar impian saya"
                ;
        int spasi = 0,
                hurufHidup = 0,
                huruf = 0;


        int panjangTeks = kalimat1.length();
        for (int i = 0; i < panjangTeks; i ++)
        {

            char kar = Character.toLowerCase(kalimat1.charAt(i));
            if (kar == 'a' || kar == 'e' || kar == 'i' || kar == 'o' || kar == 'u')
                hurufHidup ++;


            if (Character.isLetter (kar))
                huruf ++;


            if (Character.isWhitespace(kar))
                spasi ++;
        }

        System.out.println("Kalimatnya adalah : "+kalimat1);
        System.out.println("Jumlah huruf hidup = " + hurufHidup);
        System.out.println("Jumlahkonsonan = " + (huruf - hurufHidup));
        System.out.println("Jumlah spasi = " + spasi);
    }
}