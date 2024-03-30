
public class Course{
  private String Judul;
  private String Deskripsi;
  private String NamaPengajar;
  private String Level;
  private int Harga;

  public Course(String Judul, String Deskripsi, String NamaPengajar, String Level, int Harga){
    this.Judul = Judul;
    this.Deskripsi = Deskripsi;
    this.NamaPengajar = NamaPengajar;
    this.Level = Level;
    this.Harga = Harga;
  }

  //getter n setter
  public String setJudul(){
    return Judul;
  }

  public void getJudul(String Judul){
    this.Judul = Judul;
  }
  
  public String setDeskripsi(){
    return Deskripsi;
  }

  public void getDeskripsi(String Deskripsi){
    this.Deskripsi = Deskripsi;
  }

  public String setNamaPengajar(){
    return NamaPengajar;
  }

  public void getNamaPengajar(String NamaPengajar){
    this.NamaPengajar = NamaPengajar;
  }

  public String setLevel(){
    return Level;
  }

  public void getLevel(String Level){
    this.Level = Level;
  }

  public int setHarga(){
    return Harga;
  }

  public void getHarga(int Harga){
   this.Harga = Harga; 
  }

  // method lain untuk display
  public void displayCourseInfo() {
    System.out.println("COURSE INFO");
    System.out.println("tile: " + Judul);
    System.out.println("description: " + Deskripsi);
    System.out.println("lecturer: " + NamaPengajar);
    System.out.println("level: " + Level);
    System.out.println("price: " + Harga);
  }

  public static void main(String[] args) {
    System.out.println("===");
    // Membuat objek dari class Course
    Course CourseInfo1 = new Course("data science", " learn about data science", "john doe", "all level", 150000);
    CourseInfo1.displayCourseInfo();

    System.out.println("===\n===");
    Course CourseInfo2 = new Course("algorithm", "master the basic of algorithm", "enki", "beginner", 75000);
    CourseInfo2.displayCourseInfo();

    System.out.println("===\n===");
    Course CourseInfo3 = new Course("docker", "learn about docker form zero to master", "ray krieger", "all level", 125000);
    CourseInfo3.displayCourseInfo();

    System.out.println("===");
  }
}
