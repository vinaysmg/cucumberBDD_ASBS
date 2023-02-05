# Hooks are block of code that runs before or after each scenario
# Hooks in cucumber is like listeners in TestNG, It will not be visible to people who read only feature file,
#   So its better to use hooks for only low leve logic such as opening, teardowning browser, deleting daata from Database
# Can define hooks using @After @Before annotations from io.cucumber.java
# Scenario Hooks - runs before and after each scenario
# Step hooks - runs before and after each step
# Conditional Hooks - hooks associated with tags for conditional execution, Hooks can be conditionaly selected for execution
# based on tags of the scenario
#  To run a perticular hook only for certain scenarios, you can associate a before or after hook with  a tag expression
#  Tags can be used with @After @Before @AfterStep @BeforeStep

  Feature: Executing feature file with hooks

    @Tag1
    Scenario: This is scenario 1
      Given given step
      When when step
      Then Then step


    Scenario: This is scenario 2
      Given given step
      When when step
      Then Then step