public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("agus");
        siswa.setAge(20);
        siswa.sestAdress("Malang");

        System.out.println("nama: "+siswa.getName()+"alamat"+siswa.getAdress()+"berumur"+siswa.getAge()+"tahun");
    }
}
