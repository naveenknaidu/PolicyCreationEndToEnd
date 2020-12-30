#Author: Naveen K Medisetti
  @UATTesting
  Feature: This is to validate particular insurance product has correct price attached

    Scenario Outline: Navigating through ILH website and selecting the product and populating the customer details
      Given User invokes chrome browser invokes ILH website
      When User scrolls down the webpage
      When User clicks on  next step button
      When User clicks on compare plans button
      When User scrolls down the plans page
      When User clicks on get quote button number "<number>"
      When User enters date
      When User enters title as "<title>"
      When User enters first name as "<firstname>"
      When User enters surname as "<surname>"
      When User enters email address as "<emailaddress>"
      When User enters mobile number as "<mobile>"
      When User enters DOB as "<DOB>"
      When User selects no radio button
      And User clicks on the get quote button
      And User scroll down the webpage
      And User clicks on the plus sign
      Then User takes the screenshot saves the "<filename>"
      Then User enters account name "<accountname>"
      Then user enters IBAN details "<ibandetails>"
      Then User enters payment date "<paymentdate>"
      Then User enters address one "<addressone>"
      Then User enters towncity "<towncity>"
      Then User selects the county "<county>"
      Then User clicks on checkbox one
      Then User clicks on checkbox two
      Then User clicks on checkbox three
      Then User clicks on continue to review
      Then User click on confirm purchase

      Examples:
      | number  | title | firstname | surname | emailaddress | mobile  | DOB | filename | accountname | ibandetails | paymentdate | addressone  | towncity  | county  |
      | 1 | Mr  |Naveen     |Medisetti|test.email@irishlifehealth.ie  |0871234567|05/04/1990|BeneFit1|NaveenMedisetti|IE12BOFI90350984096555|6|40 CCCCC|Dublin|Co Carlow|
      | 2 | Mrs  |Sujee     |Medisetti|test.email@irishlifehealth.ie  |0871234567|05/04/1995|BeneFit|Sujee Medisetti|IE12BOFI90350984096555|6|40 CCCCC|Dublin|Co Dublin|
      | 3 | Mr  |Ahna     |Medisetti|test.email@irishlifehealth.ie  |0871234567|05/04/1996|SelectPlus|AhnaMedisetti|IE12BOFI90350984096555|6|40 CCCCC|Dublin|Co Cork|