package functional.supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    protected static final Supplier<String> getMessage =
            () -> "Afrikada veziyyet zordu";
    protected static final Supplier<List<String>> getAllName =
            () -> List.of(
                    "Talib",
                    "Rasul",
                    "Hasan"
            );
    protected static final Supplier<List<Gender>> getGender =
            () -> List.of(
                    Gender.FEMALE,
                    Gender.MALE,
                    Gender.UNKNOWN
            );
}
