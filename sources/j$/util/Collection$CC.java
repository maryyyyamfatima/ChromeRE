package j$.util;

import j$.util.function.Predicate;
import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j$.util.Collection$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class Collection$CC {
    /* JADX WARN: Generic types in debug info not equals: j$.util.function.Predicate != java.util.function.Predicate<? super E> */
    public static boolean $default$removeIf(Collection _this, Predicate predicate) {
        if (DesugarCollections.SYNCHRONIZED_COLLECTION.isInstance(_this)) {
            return DesugarCollections.removeIf(_this, predicate);
        }
        Objects.requireNonNull(predicate);
        boolean removed = false;
        java.util.Iterator it = _this.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                removed = true;
            }
        }
        return removed;
    }
}
