package j$.util.concurrent;

import j$.util.Objects;
import j$.util.function.Function;
import java.util.concurrent.ConcurrentMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j$.util.concurrent.ConcurrentMap$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ConcurrentMap$CC {
    /* JADX WARN: Generic types in debug info not equals: j$.util.function.Function != java.util.function.Function<? super K, ? extends V> */
    public static Object $default$computeIfAbsent(ConcurrentMap _this, Object obj, Function function) {
        Object apply;
        Objects.requireNonNull(function);
        Object obj2 = _this.get(obj);
        Object obj3 = obj2;
        if (obj2 == null && (apply = function.apply(obj)) != null) {
            Object putIfAbsent = _this.putIfAbsent(obj, apply);
            obj3 = putIfAbsent;
            if (putIfAbsent == null) {
                return apply;
            }
        }
        return obj3;
    }
}
