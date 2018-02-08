package ch.tutteli.atrium.creating.charsequence.contains.checkers

import ch.tutteli.atrium.creating.charsequence.contains.CharSequenceContains
import ch.tutteli.atrium.creating.throwUnsupportedOperationException

/**
 * A dummy implementation of [ICharSequenceContainsCheckers] which should be replaced by an actual implementation.
 */
object CharSequenceContainsCheckers : ICharSequenceContainsCheckers {
    override fun newAtLeastChecker(
        times: Int,
        nameContainsNotFun: String,
        atLeastCall: (Int) -> String
    ): CharSequenceContains.Checker = throwUnsupportedOperationException()

    override fun newAtMostChecker(
        times: Int,
        nameContainsNotFun: String,
        atMostCall: (Int) -> String
    ): CharSequenceContains.Checker = throwUnsupportedOperationException()

    override fun newExactlyChecker(
        times: Int,
        nameContainsNotFun: String,
        exactlyCall: (Int) -> String
    ): CharSequenceContains.Checker = throwUnsupportedOperationException()

    override fun newNotChecker(): CharSequenceContains.Checker
        = throwUnsupportedOperationException()
}
