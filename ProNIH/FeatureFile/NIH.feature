Feature: Validate to BMI calculation in NHI application.
Scenario: BMI calculation using STANDARD Measurement.
Given  User open URL " https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm "
When  User click on measurement as Standard
And  User enter the Height 5 as feet in height field
And  User enter the Height 8 as inches in height field
And  User enter the Weight 160 in Weight field
Then  User click on COMPUTE BMI button