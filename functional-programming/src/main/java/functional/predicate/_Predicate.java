package functional.predicate;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    protected static final Predicate<String> isValidPhoneNumberStartAndLen =
            phoneNumber -> phoneNumber.startsWith("070") && phoneNumber.length() == 10;
    protected static final Predicate<String> isValidPhoneNumberContains =
            phoneNumber -> phoneNumber.contains("831");
    protected static final Predicate<Customer> customerPredicate =
            customer -> customer.getCustomerName().equalsIgnoreCase("TALIB")
                    && customer.getCustomerPhoneNumber().equals(166);
    protected static final BiPredicate<Customer, Integer> customerBiPredicate =
            (biCustomerPredicate, checking) ->
                    biCustomerPredicate.getCustomerName().equalsIgnoreCase("TALIB")
                            && biCustomerPredicate.getCustomerPhoneNumber().equals(checking);
}
