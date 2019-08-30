class TestFirstApplication {
//@Test 
@Grab('junit')
//@SpringBootTest
   
   void welcomeTest() {
      assertEquals("Welcome to TutorialsPoint.Com", new FirstApplication().welcome())
   }
} 
