public class reviews {
   String usuario;
   int day;
   int month;
   int year;
   int stars;
   String reviewText;

   //Constuctos
   public reviews(String usuario, int day, int month, int year, int stars, String reviewText) {
      this.usuario = usuario;
      this.day = day;
      this.month = month;
      this.year = year;
      this.stars = stars;
      this.reviewText = reviewText;
   }
   
   //Setter
   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }
   public void setDay(int day) {
      this.day = day;
   }
   public void setMonth(int month) {
      this.month = month;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public void setStars(int stars) {
      this.stars = stars;
   }
   public void setReviewText(String reviewText) {
      this.reviewText = reviewText;
   }
   //Getters
   public String getUsuario() {
      return usuario;
   }
   public int getDay() {
      return day;
   }
   public int getMonth() {
      return month;
   }
   public int getYear() {
      return year;
   }
   public int getStars() {
      return stars;
   }
   public String getReviewText() {
      return reviewText;
   }
}
//caca