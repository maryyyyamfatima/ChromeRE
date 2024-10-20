package j$.util;

import j$.util.function.Consumer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface Iterator<E> {
    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: j$.util.Iterator$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<E> {
        /* JADX WARN: Generic types in debug info not equals: j$.util.function.Consumer != java.util.function.Consumer<? super E> */
        public static void $default$forEachRemaining(java.util.Iterator _this, Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (_this.hasNext()) {
                consumer.accept(_this.next());
            }
        }
    }
}
