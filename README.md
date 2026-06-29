Summary
In this project I developed and tested three parts of a mobile application named Contact Service, Task Service, and Appointment Service. My testing approach focused on ensuring that each class met all of the functional requirements and validation rules described in the project specifications. I used JUnit to create unit tests that evaluated both normal operations and some common error conditions.

For the Contact Service I created tests that verified contact objects could be successfully created when valid information was provided and that exceptions were thrown when invalid data was entered. I also tested updating contact fields and deleting contacts from the service. These tests ensured that contact IDs remained unique and that all field length restrictions were enforced.

For the Task Service I followed a similar approach. Tests verified that task objects could be created, updated, and removed correctly. Validation tests confirmed that task IDs, names, and descriptions met the required constraints and that invalid values were rejected.

For the Appointment Service I focused on validating appointment IDs, appointment dates, and descriptions. Tests verified that appointments could not be scheduled in the past and that all required field restrictions were enforced. Additional tests confirmed that appointments could be added and deleted correctly.

My testing approach was closely aligned with the software requirements because every requirement was translated into one or more unit tests. For example, if a requirement specified that a contact ID could not exceed ten characters, I created tests that verified both valid IDs and IDs that exceeded the limit. This approach ensured that all requirements were directly evaluated through automated testing.

The quality of my JUnit tests was demonstrated through comprehensive coverage of the application requirements. I tested both positive scenarios, where valid data was accepted, and negative scenarios, where invalid data caused exceptions. This combination helped ensure that the application behaved correctly under expected conditions while also handling improper inputs safely.

The effectiveness of the tests was further demonstrated by the high code coverage achieved during execution. Coverage reports showed that the majority of constructors, methods, validation checks, and service operations were executed during testing. High coverage provided confidence that the code most important to system functionality was evaluated and verified. 

Although code coverage alone does not guarantee perfect software, it provided evidence that the tests exercised a large portion of the codebase. Combined with successfull execution of all test cases, this indicated that the JUnit tests were effective in validating the application’s behavior.

Writing the JUnit tests helped me better understand the relationship between software requirements and implementation. Each test case required careful analysis of the requirements to determine expected behavior and possible edge cases.

To ensure my code was technically sound, I used assertions to verify expected outcomes and exception testing to validate error handling. For example, assertions such as assertEquals() verified that object properties were stored correctly, while assertThrows() confirmed that invalid inputs generated exceptions. These tests ensured that the application enforced validation rules consistently.

I also focused on efficiency by creating targeted test cases that evaluated specific requirements without unnecessary duplication. Each test method was designed to evaluate a single behavior or validation rule, making the tests easier to maintain and understand. By isolating individual requirements within separate test methods, debugging became more efficient because failures could be traced directly to a specific requirement.

Reflection
Several software testing techniques were used in this project. The primary technique was unit testing which involves testing individual methods and classes independently from the rest of the system. Unit testing is effective because it allows developers to identify defects early in the development process and isolate problems within specific components.

I also used boundary value testing. Many requirements involved character limits and validation rules, which made boundary testing useful. For example, I tested values that were exactly at the maximum allowed length as well as values that exceeded those limits. This technique helps identify errors that often occur at the edges of acceptable input ranges.

Another technique employed was exception testing. Since the application required validation of IDs, names, descriptions, and appointment dates, I created tests that intentionally supplied invalid data and verified that exceptions were thrown. This confirmed that the application rejected invalid input as required.

There are also several testing techniques that were not used in this project. Integration testing, for example, evaluates interactions between multiple components rather than individual classes. System testing evaluates the entire application as a complete system. Performance testing measures response times and resource usage under varying workloads. User acceptance testing focuses on validating that software meets business needs from the end-user perspective.

Each testing technique serves a different purpose. Unit testing is most effective during development because it quickly identifies defects within individual components. Integration testing becomes important when components begin interacting with one another. System testing is valuable before deployment because it verifies complete system functionality. Performance testing is critical for applications that must support large numbers of users or process large amounts of data. User acceptance testing helps ensure that customer expectations are met before release.  

Mindset
While working on this project I developed a more cautious and detail oriented mindset. Rather than assuming the code would work correctly, I approached each requirement as an opportunity to identify possible failures. This mindset was important because even simple classes can contain hidden defects that only become visible under specific conditions.

Understanding the complexities and relationships within the code was also important. For example, changing the validation logic in an object class could affect service operations that depend on that object. A defect in a constructor could affect every method that creates new instances. Recognizing these relationships helped me create tests that examined both individual behaviors and their broader effects on application functionality.

I also attempted to limit bias while reviewing my code. Because developers might just expect their code to work as intended, it is easy to overlook potential defects. To reduce this bias I intentionally tested invalid inputs and edge cases rather than focusing solely on successful scenarios. I created tests that used null values, oversized strings, and invalid dates to challenge the assumptions made during development.

Bias can be problematic when testing one’s own code because familiarity can lead developers to avoid scenarios that could expose defects. By approaching testing from the perspective of a user attempting to break the system, I was able to create more objective and effective test cases.

Maintaining discipline and a commitment to quality is essential for software engineering professionals. Cutting corners during development or testing can allow defects to reach production environments, resulting in increased maintenance costs and reduced user trust. Thorough testing helps identify problems early when they are less expensive to fix.

Avoiding technical debt requires consistent attention to code quality, testing, and maintainability. I plan to avoid technical debt by writing clear and organized code, maintaining comprehensive test suites, and addressing defects promptly rather than postponing them. Automated testing, code reviews, and adherence to software engineering best practices will help ensure that future projects remain reliable, maintainable, and scalable.

References
JUnit Team. (2024). JUnit 5 user guide. https://junit.org/junit5/docs/current/user-guide/
Sommerville, I. (2016). Software engineering (10th ed.). Pearson.
