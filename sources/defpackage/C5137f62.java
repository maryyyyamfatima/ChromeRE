package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f62, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5137f62 {
    public static final C5137f62 b = new C5137f62(null);
    public final Object a;

    public C5137f62(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5137f62)) {
            return false;
        }
        Object obj2 = ((C5137f62) obj).a;
        Object obj3 = this.a;
        return obj3 == obj2 || (obj3 != null && obj3.equals(obj2));
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof W62) {
            return AbstractC4199cO1.a("OnErrorNotification[", String.valueOf(((W62) obj).a), "]");
        }
        return AbstractC4199cO1.a("OnNextNotification[", String.valueOf(obj), "]");
    }
}
