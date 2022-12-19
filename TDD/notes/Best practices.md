#TDD #GOOD_PRACTICES 

- Have good [Tests names](Tests%20names.md)
- Use @Before for avoiding duplicated code ([Tests annotations](Tests%20annotations.md))
- Duplicated scenarios must be deleted, only one test per scenario.
- Create different packages for src and tests
- Avoid testing a private method directly. It must be tested from a public method that invokes it
- Use [Test Data Builder](Test%20Data%20Builder.md)
- Don't search the final solution directly if it is complicated, do [Baby steps](Baby%20steps.md).
- [Mock objects](Mock%20objects.md) for testing when data is in a database or scenery depends on a third party code/condition.