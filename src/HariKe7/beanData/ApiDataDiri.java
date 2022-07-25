package HariKe7.beanData;

public class ApiDataDiri {
    public DataDiri generateData(){
        DataDiri dataDiri = new DataDiri();
        dataDiri.setName("akbar");
        dataDiri.setAlamat("bogor");
        dataDiri.setJenisKelamin("Laki-laki");
        dataDiri.setUmur(32);
        dataDiri.setEmail("nugroho.akbar.r@gmail.com");

        return dataDiri;
    }

    public void cetakDataDiri(DataDiri dataDiri){
        System.out.println(dataDiri.getName());
    }


    public static void main(String[] args) {
        ApiDataDiri a = new ApiDataDiri();
        a.cetakDataDiri(a.generateData());
    }
}
