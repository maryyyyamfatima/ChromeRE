package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ji0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6711ji0 {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(InterfaceC8927q80 interfaceC8927q80) {
        Object a;
        if (interfaceC8927q80 instanceof C0726Fp0) {
            return interfaceC8927q80.toString();
        }
        try {
            a = interfaceC8927q80 + '@' + a(interfaceC8927q80);
        } catch (Throwable th) {
            a = SP2.a(th);
        }
        if (PP2.a(a) != null) {
            a = ((Object) interfaceC8927q80.getClass().getName()) + '@' + a(interfaceC8927q80);
        }
        return (String) a;
    }
}
