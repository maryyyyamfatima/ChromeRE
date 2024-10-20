package j$.util;

import defpackage.A;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public final class Optional<T> {
    private static final Optional EMPTY = new Optional();
    private final Object value;

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    private Optional() {
        this.value = null;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public static <T> Optional<T> empty() {
        return EMPTY;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    private Optional(Object obj) {
        this.value = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T value) {
        return new Optional<>(value);
    }

    public static <T> Optional<T> ofNullable(T value) {
        return value == null ? empty() : of(value);
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public T get() {
        T t = (T) this.value;
        if (t == null) {
            throw new NoSuchElementException("No value present");
        }
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public boolean isPresent() {
        return this.value != null;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    /* JADX WARN: Generic types in debug info not equals: j$.util.function.Consumer != java.util.function.Consumer<? super T> */
    public void ifPresent(Consumer<? super T> consumer) {
        A a = (Object) this.value;
        if (a != null) {
            consumer.accept(a);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    /* JADX WARN: Generic types in debug info not equals: j$.util.function.Predicate != java.util.function.Predicate<? super T> */
    public Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        if (isPresent()) {
            return predicate.test((Object) this.value) ? this : empty();
        }
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    /* JADX WARN: Generic types in debug info not equals: j$.util.function.Function != java.util.function.Function<? super T, java.util.Optional<U>> */
    public <U> Optional<U> flatMap(Function<? super T, Optional<U>> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (Optional) Objects.requireNonNull(function.apply((Object) this.value));
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public T orElse(T t) {
        T t2 = (T) this.value;
        return t2 != null ? t2 : t;
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<?> */
    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.value, ((Optional) obj).value);
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    /* JADX WARN: Generic types in debug info not equals: j$.util.Optional != java.util.Optional<T> */
    public String toString() {
        Object obj = this.value;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
