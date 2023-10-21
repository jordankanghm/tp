package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SKILL_FRIEND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.EventStorage;
import seedu.address.model.event.Event;
import seedu.address.model.volunteer.Volunteer;

/**
 * A utility class containing a list of {@code Event} objects to be used in tests.
 */
public class TypicalEvents {
    public static final Event FIRST = new EventBuilder().withEventName("Clean 1")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event SECOND = new EventBuilder().withEventName("Clean 2")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event THIRD = new EventBuilder().withEventName("Clean 3")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event FOURTH = new EventBuilder().withEventName("Clean 4")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event FIFTH = new EventBuilder().withEventName("Clean 5")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event SIXTH = new EventBuilder().withEventName("Clean 6")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    public static final Event SEVENTH = new EventBuilder().withEventName("Clean 7")
            .withRoles("cleaner")
            .withDateAndTime("23/10/2023 1800")
            .withLocation("Sembawang")
            .withDescription("Clean up la")
            .withMaterials("trash bag", "gloves")
            .withBudget("50.00").build();

    // Manually added - Event's details found in {@code CommandTestUtil}
    public static final Event CLEANUP = new EventBuilder().withEventName("Clean up")
            .withRoles("cleaner")
            .withDateAndTime("23/9/2023 1800")
            .withLocation("serangoon")
            .withDescription("clean it up")
            .withMaterials("trash bag")
            .withBudget("80.00").build();
    public static final Event HELPOUT = new EventBuilder().withEventName("Help out")
            .withRoles("brain")
            .withDateAndTime("25/10/2023 2000")
            .withLocation("admiralty")
            .withDescription("help out la")
            .withMaterials("hands")
            .withBudget("100.00").build();
    public static final Volunteer AMY = new VolunteerBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withSkills(VALID_SKILL_FRIEND).build();

    private TypicalEvents() {} // prevents instantiation

    /**
     * Returns an {@code EventStorage} with all the typical volunteers.
     */
    public static EventStorage getTypicalEventStorage() {
        EventStorage ab = new EventStorage();
        for (Event event : getTypicalEvents()) {
            ab.addEvent(event);
        }
        return ab;
    }

    public static List<Event> getTypicalEvents() {

        return new ArrayList<>(Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH));
    }
}
