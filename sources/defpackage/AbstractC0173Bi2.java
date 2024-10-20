package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173Bi2 {
    public abstract int a();

    public abstract void b(InterfaceC0334Co3[] interfaceC0334Co3Arr);

    public final boolean c(InterfaceC0334Co3[] interfaceC0334Co3Arr) {
        int a = a();
        if (interfaceC0334Co3Arr.length == a) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AbstractC0800Ge.a("parallelism = ", a, ", subscribers = ", interfaceC0334Co3Arr.length));
        for (InterfaceC0334Co3 interfaceC0334Co3 : interfaceC0334Co3Arr) {
            interfaceC0334Co3.c(EnumC10996wA0.a);
            interfaceC0334Co3.onError(illegalArgumentException);
        }
        return false;
    }
}
