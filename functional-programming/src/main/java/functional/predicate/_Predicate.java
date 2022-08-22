package functional.predicate;


import java.util.function.Predicate;

public class _Predicate {
    protected static final Predicate<String> isValidPhoneNumberStartAndLen =
            phoneNumber -> phoneNumber.startsWith("070") && phoneNumber.length() == 8;
    protected static final Predicate<String> isValidPhoneNumberContains =
            phoneNumber -> phoneNumber.contains("831");
}
