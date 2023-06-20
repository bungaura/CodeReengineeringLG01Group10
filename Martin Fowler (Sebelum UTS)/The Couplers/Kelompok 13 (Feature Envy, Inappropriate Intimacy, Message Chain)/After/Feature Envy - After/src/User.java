public class User {
	
		public User() {
			
		}
	
        public String GetFullAddress()
        {
            String city = GetCity();
            String state = GetState();
            String streetName = GetStreetName();
            return streetName + ";" + city + ";" + state;
        }
        
        public String GetStreetName() {
            return "1 Medison Square";
        }
        
        public String GetCity() {
            return "NewYork";
        }
        
        public String GetState(){
            return "NY";
        }
        
        public static void main(String[] args) {
    		User user = new User();
    		System.out.println(user.GetFullAddress());
    	}
  
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Feature Envy Treatment:
- Melakukan move method
- Memindahkan method GetStreetName(), GetCity(), dan
  GetState() ke class "User.java"
- Menghapus class "ContactInfo.java" karena berisi
  method-method yang hanya digunakan oleh class "User.java"
*/


