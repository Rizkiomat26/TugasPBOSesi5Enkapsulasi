public class Main {
   public static void main(String[] args) {
     
      Student s1 = new Student("Satria Rizki Rohmat", "Mangkalaya");
      s1.addCourseGrade("PBO1", 94);
      s1.addCourseGrade("PBO2", 77);
      s1.printGrades();

      System.out.println("Rata-rata nya " + s1.getAverageGrade());
      Teacher t1 = new Teacher("Nugraha, M.Kom", "Cibadak");
      System.out.println(t1);
      String[] courses = {"PBO1", "PBO2", "PBO1"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " Dapat Ditambahkan");
         } else {
            System.out.println(course + " Tidak dapat di tambahkan");
         }
      }
      
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " Dapat di hapus");
         } else {
            System.out.println(course + " Tidak dapat di hapus");
         }
      }
      
   }
}