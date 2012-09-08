Meta:
@author cvgaviao 

Scenario: A simple successful scenario
Given a test
When a test is executed
Then a tester is pleased

Scenario: Another simple successful scenario
Given a test
When a test is executed
Then a tester is pleased

Scenario: Yet another simple successful scenario
Given a test
When a test is executed
Then a tester is pleased <jjj> 


Scenario: trader is not alerted below threshold
 
Given a stock of symbol symbol and a threshold of 11
When the stock is traded at value
Then the alert status should be status
