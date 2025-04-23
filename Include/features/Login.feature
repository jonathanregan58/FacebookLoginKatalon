
#Feature: Login Feature
  
  #Scenario: Test Login with Valid Credentials
   # Given User navigates to Login Page
    #When User enters username and password
    #And click on login button
    #Then User is navigated to the Home Page
    
    
   
  
  #Scenario Outline: Test Login with Valid Credentials
   # Given User navigates to Login Page
    #When User enters <username> and <password>
    #And click on login button
    #Then User is navigated to the Home Page
    
    #Examples:
    #|username|password|
    #|abc     |123     |
    #|def     |456     |
    
    
    
@LoginFacebook
Feature: Login Facebook

  @tag1
  Scenario: Click Buat akun baru on Facebook Login Page in Bahasa Indonesia
    Given User is on Facebook Login Page in Bahasa Indonesia
    When User clicks on Buat akun baru button on Facebook Login Page in Bahasa Indonesia
    Then User is on Facebook Registration Page in Bahasa Indonesia
    
    @tag2
  Scenario: Click Lupa akun on Facebook Login Page in Bahasa Indonesia
    Given User is on Facebook Login Page in Bahasa Indonesia
    When User clicks on Lupa akun button on Facebook Login Page in Bahasa Indonesia
    Then User is on Facebook Find Your Account Page in Bahasa Indonesia
    
@tag3
  Scenario Outline: User menginputkan email dengan format yang tidak benar dan password yang salah
      Given User is on Facebook Login Page in Bahasa Indonesia
    When User enter the <Email> and <Password> on Facebook Login Page in Bahasa Indonesia
    And User click the Log in button on Facebook Login Page in Bahasa Indonesia
    Then pesan "Email atau nomor ponsel yang Anda masukkan tidak terhubung ke akun." appears on Facebook Login Page in Bahasa Indonesia1
   
   
   Examples: 
   |Email | Password |
   |aa|abcdefgh|
   
   
   
 @tag4
  Scenario Outline: User menginputkan email yang ada dan password yang salah
      Given User is on Facebook Login Page in Bahasa Indonesia
    When User enter the <Email> and <Password> on Facebook Login Page in Bahasa Indonesia
    And User click the Log in button on Facebook Login Page in Bahasa Indonesia
    Then pesan "Kata sandi yang Anda masukkan salah." appears on Facebook Login Page in Bahasa Indonesia2
   # And Lupa kata sandi link appears on Facebook Login Page in Bahasa Indonesia
     And User is directed to captcha verification page
   
   Examples: 
   |Email | Password |
   |hahahihi@gmail.com|abcdefgh|
   
    
   
   @tag5
  Scenario Outline: User menginputkan email yang ada dan password yang benar
      Given User is on Facebook Login Page in Bahasa Indonesia
    When User enter the <Email> and <Password> on Facebook Login Page in Bahasa Indonesia
    And User click the Log in button on Facebook Login Page in Bahasa Indonesia
    Then User is successfully logged in on Facebook in Bahasa Indonesia 
   
   Examples: 
   |Email | Password |
   |jonathan.regan58@yahoo.com|Jregan58@_ |
   
   
  # @tag7
  #Scenario: User mencoba akses google
     
   # Given User is success opening google chrome
   # When User types google chrome
    #Then User is successful
   
   
   
    
    
    
    
    
  
