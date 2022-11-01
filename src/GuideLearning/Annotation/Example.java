package GuideLearning.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
//&nbsp;

/*
    @Rentention di sini berguna untuk memasukkan nilai
    ke dalam memori penyimpanan sementara.
*/
@Retention(RetentionPolicy.RUNTIME)

/*
    @interface CobaAnotasi,
    berguna sebagai pendeklarasian variable.
*/
@interface CobaAnotasi{
    public String kata();
    public int nilaiA();
    public int nilaiB();
}

public class Example {
    @CobaAnotasi(kata = "nilai yang kuberikan ", nilaiA = 150, nilaiB = 25 )  //Isian variabel yang telah dideklarasikan
    public static void Metadata(){
        try{
            Example anno = new Example();
            Class c = anno.getClass();
            Method m = c.getMethod("Metadata");   /*
                                                            deklarasi string di dalam .getMethod harus sama dengan
                                                            nama method tersebut.
                                                        */
            CobaAnotasi coba = m.getAnnotation(CobaAnotasi.class);
            int selisih = coba.nilaiA() - coba.nilaiB();
            System.out.println(coba.kata() + "= "+coba.nilaiA()+", "+coba.nilaiB()+". "+selisih);
        }
        catch (NoSuchMethodException ex){
            Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SecurityException ex){
            Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Untuk running program, cukup jalankan method yang bersangkutan saja.
    public static void main(String[] args) {
        Metadata();
    }
}
