package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7693mZ3 {
    public static void a(AV0 av0) {
        int i;
        if (av0 != null) {
            if (av0 instanceof LV0) {
                i = ((LV0) av0).a();
            } else if (av0 instanceof InterfaceC6982kV0) {
                i = 0;
            } else {
                i = av0 instanceof InterfaceC7670mV0 ? 1 : 2;
            }
            if (i == 2) {
                return;
            }
            ClassCastException classCastException = new ClassCastException(av0.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
            AbstractC0087Ar1.f(AbstractC7693mZ3.class.getName(), classCastException);
            throw classCastException;
        }
    }
}
