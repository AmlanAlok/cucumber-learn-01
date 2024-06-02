# cucumber-learn-01



### Error 5
java.lang.AssertionError: expected:<40> but was:<0>
at org.junit.Assert.fail(Assert.java:89)
at org.junit.Assert.failNotEquals(Assert.java:835)
at org.junit.Assert.assertEquals(Assert.java:647)
at org.junit.Assert.assertEquals(Assert.java:633)
at StepDefinitions.CheckoutSteps.theTotalPriceShouldBeC(CheckoutSteps.java:30)
at ✽.the total price should be 40c(file:///Users/amlanalok/Documents/Programming/Java/Cucumber/cucumber-learn-01/cucumber-learn-01/src/test/resources/Features/checkout.feature:5)

### Error 4
java: cannot find symbol
symbol:   variable checkout
location: class StepDefinitions.CheckoutSteps

### Error 3
java: cannot find symbol
symbol:   variable bananaPrice
location: class StepDefinitions.CheckoutSteps

### Error 2
java: cannot find symbol
symbol:   class Checkout
location: class StepDefinitions.CheckoutSteps

### Error 1
io.cucumber.java.PendingException: TODO: implement me
at StepDefinitions.CheckoutSteps.thePriceOfAIsC(CheckoutSteps.java:13)
at ✽.the price of a "banana" is 40c(file:///Users/amlanalok/Documents/Programming/Java/Cucumber/cucumber-learn-01/cucumber-learn-01/src/test/resources/Features/checkout.feature:3)






Installed plugins on IntelliJ
1. Cucumber for Java
2. Gherkins

Added dependencies in the pom.xml
1. cucumber-core
2. cucumber-java
3. cucumber-jvm-deps
4. gherkin

Very good setup video

https://www.youtube.com/watch?v=4e9vhX7ZuCw&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2

cucumber-java from io.cucumber is the correct way to implement.


