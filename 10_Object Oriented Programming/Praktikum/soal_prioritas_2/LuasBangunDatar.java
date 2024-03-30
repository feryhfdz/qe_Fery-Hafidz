public class LuasBangunDatar {
  private static final double PHI = 3.14;  
  // Luas persegi
  public static int getLuasPersegi(int sisi) {
    return sisi * sisi;
  }
  
  // Luas persegi panjang
  public static int getLuasPersegiPanjang(int p, int l) {
    return p * l;
  }
  
  // Luas lingkaran
  public static double getLuasLingkaran(int r) {
    return PHI * r * r;
  }
  
  // Luas trapesium
  public static float getLuasTrapesium(int alasA, int alasB, int t) {
    return ((alasA + alasB) * t) / 2;
  }
  
  
  public static void main(String[] args) {
    System.out.println("Luas Persegi: " + getLuasPersegi(12));
    System.out.println("===");
    System.out.println("Luas Persegi Panjang: " + getLuasPersegiPanjang(7, 8));
    System.out.println("===");
    System.out.println("Luas Lingkaran: " + getLuasLingkaran(21));
    System.out.println("===");
    System.out.println("Luas Trapesium: " + getLuasTrapesium(5, 6, 2));
  }
}
