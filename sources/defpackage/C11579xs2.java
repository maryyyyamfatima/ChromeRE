package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xs2 */
/* loaded from: classes.dex */
public final class C11579xs2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;

    public C11579xs2(InterfaceC9989tE2 interfaceC9989tE2, C0026Af0 c0026Af0, InterfaceC9989tE2 interfaceC9989tE22) {
        a(1, interfaceC9989tE2);
        this.a = interfaceC9989tE2;
        a(2, c0026Af0);
        this.b = c0026Af0;
        a(3, interfaceC9989tE22);
        this.c = interfaceC9989tE22;
    }

    public static void a(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(AbstractC9076qb1.a("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
        }
    }
}
