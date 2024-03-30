public class LuasBangunDatar {
  private static final double PHI = 3.14;  
  // Menghitung luas persegi
  public static int getLuasPersegi(int sisi) {
    return sisi * sisi;
  }
  
  // Menghitung luas persegi panjang
  public static int getLuasPersegiPanjang(int panjang, int lebar) {
    return panjang * lebar;
  }
  
  // Menghitung luas lingkaran
  public static double getLuasLingkaran(int radius) {
    return PHI * radius * radius;
  }
  
  // Menghitung luas trapesium
  public static double getLuasTrapesium(int sisiA, int sisiB, int tinggi) {
    return 0.5 * (sisiA + sisiB) * tinggi;
  }
  
  
  public static void main(String[] args) {
    System.out.println("luas persegi: " + getLuasPersegi(12));
    System.out.println("luas persegi panjang: " + getLuasPersegiPanjang(7, 8));
    System.out.println("luas lingkaran: " + getLuasLingkaran(21));
    System.out.println("luas trapesium: " + getLuasTrapesium(5, 6, 2));
  }
}
