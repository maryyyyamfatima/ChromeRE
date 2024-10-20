package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X62 {
    public static final X62 a;
    public static final /* synthetic */ X62[] g;

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static X62[] values() {
        return (X62[]) g.clone();
    }

    static {
        X62 x62 = new X62();
        a = x62;
        g = new X62[]{x62};
    }

    public static boolean a(InterfaceC11128wa2 interfaceC11128wa2, Object obj) {
        if (obj == a) {
            interfaceC11128wa2.b();
            return true;
        }
        if (obj instanceof W62) {
            interfaceC11128wa2.onError(((W62) obj).a);
            return true;
        }
        interfaceC11128wa2.d(obj);
        return false;
    }
}
