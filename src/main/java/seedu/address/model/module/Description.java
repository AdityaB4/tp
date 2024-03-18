package seedu.address.model.module;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Module's description in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDescription(String)}
 */
public class Description {
    private final String value;
    public static final String MESSAGE_CONSTRAINTS = "";

    public Description(String value) {
        requireNonNull(value);
        checkArgument(isValidDescription(value), MESSAGE_CONSTRAINTS);
        this.value = value;
    }

    //    TODO(yadunut): Add validation for description
    public static boolean isValidDescription(String test) {
        return true;
    }

    public String getValue() {
        return value;
    }
}
