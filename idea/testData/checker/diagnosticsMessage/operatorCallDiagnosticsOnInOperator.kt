fun call() {
    val list : String? = "sdfknsdkfm"
    "x" <error descr="[UNSAFE_OPERATOR_CALL] Operator call corresponds to a dot-qualified call 'list.contains(\"x\")' which is not allowed on a nullable receiver 'list'. ">in</error> list

    "x" <error descr="[UNSAFE_OPERATOR_CALL] Operator call corresponds to a dot-qualified call 'list.contains(\"x\")' which is not allowed on a nullable receiver 'list'. ">!in</error> list
}

<error descr="[INAPPLICABLE_OPERATOR_MODIFIER] 'operator' modifier is inapplicable on this function: must have a single value parameter">operator</error> fun CharSequence.contains(<warning descr="[UNUSED_PARAMETER] Parameter 'other' is never used">other</warning>: CharSequence, <warning descr="[UNUSED_PARAMETER] Parameter 'ignoreCase' is never used">ignoreCase</warning>: Boolean = false): Boolean = true