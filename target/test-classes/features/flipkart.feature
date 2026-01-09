Feature: Flipkart basic functionality validation

  Scenario: Validate login popup UI
    Given user opens Flipkart website
    Then login popup should be displayed
    And mobile number input field should be visible

  Scenario: Search for a product
    Given user opens Flipkart website
    When user searches for "mobile phones"
    Then search results should be displayed

  Scenario: Validate homepage UI
    Given user opens Flipkart website
    Then Flipkart logo should be visible
