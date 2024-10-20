package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9334rK3 {
    public static final C2823Vs3 a = new C2823Vs3("NO_THREAD_ELEMENTS");

    public static final Object b(E90 e90, Object obj) {
        if (obj == null) {
            obj = e90.j(0, C8306oK3.g);
            AbstractC0087Ar1.b(obj);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return e90.j(new EK3(e90, ((Number) obj).intValue()), C8992qK3.g);
        }
        X5.a(obj);
        throw null;
    }

    public static final void a(E90 e90, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof EK3) {
            InterfaceC7962nK3[] interfaceC7962nK3Arr = ((EK3) obj).b;
            int length = interfaceC7962nK3Arr.length - 1;
            if (length < 0) {
                return;
            }
            InterfaceC7962nK3 interfaceC7962nK3 = interfaceC7962nK3Arr[length];
            AbstractC0087Ar1.b(null);
            throw null;
        }
        Object j = e90.j(null, C8649pK3.g);
        if (j == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        X5.a(j);
        throw null;
    }
}
