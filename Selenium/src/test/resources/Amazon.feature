
Feature: Amazon user Address 

  
  Scenario: validate add address
    Given open browser and application
    Given  login into application
    When navigate to your account page
   When  clicks on your address to navigate to address page
    When clicks on add address
    Then fill all mandatory fields and clicks on add address button
    Then validate the address on your address page

  
 Scenario Outline: validate edit address
    Given open browser and application
    Given login into application
    When navigate to your account page
    When clicks on your address to navigate to address page
    When clicks on  edit button for existing address
    Then update address and clicks on update address button
    Then validate the address on your address page
    Example
   |Username    |password     |
   |  karim    	|  password123|
   | radhika   	| pasword456  |

  Scenario: validate delete address
    Given open browser and application
    Given login into application
    When navigate to your account page
    When clicks on your address to navigate to address page
    When clicks on  remove button for existing address
    Then clicks on yes button in confirmation pop_up window 
    Then validate the address on your address page
    

    