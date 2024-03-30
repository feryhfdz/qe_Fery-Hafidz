
public class Course{
    private String Judul, Deskripsi, NamaPengajar, Level; 
    private int Harga;
  
    public Course(String Judul, String Deskripsi, String NamaPengajar, String Level, int Harga){
      this.Judul = Judul;
      this.Deskripsi = Deskripsi;
      this.NamaPengajar = NamaPengajar;
      this.Level = Level;
      this.Harga = Harga;
    }
  
    public String setJudul(String Judul){
      return Judul = Judul;
    }
  
    public void getJudul(){
      this.Judul;
    }
    
    public String setDeskripsi(){
      return Deskripsi;
    }
  
    public String getDeskripsi(String Deskripsi){
      return Deskripsi = Deskripsi;
    }
  
    public void setNamaPengajar(){
      this.NamaPengajar;
    }
  
    public String getNamaPengajar(String NamaPengajar){
      return NamaPengajar = NamaPengajar;
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
  
    public void displayCourseInfo() {
      System.out.println("COURSE INFO");
      System.out.println("TITLE: " + Judul);
      System.out.println("DESCRIPTION: " + Deskripsi);
      System.out.println("LECTURER: " + NamaPengajar);
      System.out.println("LEVEL: " + Level);
      System.out.println("PRICE: " + Harga);
    }
  
    public static void main(String[] args) {
      System.out.println("===");
      
      Course CourseInfo1 = new Course("Data Science", " Learn about Data Science", "John Doe", "All Level", 150000);
      CourseInfo1.displayCourseInfo();
      System.out.println("===\n===");
      Course CourseInfo2 = new Course("Algorithm", "Master the Basic of Algorithm", "Enki", "Beginner", 75000);
      CourseInfo2.displayCourseInfo();
      System.out.println("===\n===");
      Course CourseInfo3 = new Course("Docker", "Learn about Docker from Zero to Master", "Ray Krieger", "All Level", 125000);
      CourseInfo3.displayCourseInfo();
      System.out.println("===");
    }
  }
  