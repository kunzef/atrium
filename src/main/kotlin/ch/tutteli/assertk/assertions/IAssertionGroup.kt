package ch.tutteli.assertk.assertions

interface IAssertionGroup : IAssertion {
    val name: String
    val subject: Any
    val assertions: List<IAssertion>

    override fun holds() = assertions.all(IAssertion::holds)
}