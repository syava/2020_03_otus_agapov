package ru.otus.annotations.usage;

import ru.otus.annotations.Email;
import ru.otus.annotations.Immutable;
import ru.otus.annotations.NonEmpty;
import ru.otus.annotations.Unfinished;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings({"ResultOfMethoCallIgnired", "UnusedReturnValue"})
@Deprecated(since = "2018 04")
@Unfinished(
        priority = Unfinished.Priority.LOW,
        value = "too oldd to rock too young to die",
        lastChanged = "2018-07-26",
        lastChangedBy = "tully"
)
public class Main<T extends @Email String> {
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    private final int size;

    @Deprecated
    public Main(int size) {
        this.size = size;
    }

    @Deprecated
    public static void main(@Immutable String... args) {
        @Immutable List<String> list =
                new @NonEmpty ArrayList<>();

        Main.<@Email String>cast(list);
    }

    private static <@Immutable E> E cast (Object object) {
        //noinspection unchecked
        return (E) object;
    }
}
