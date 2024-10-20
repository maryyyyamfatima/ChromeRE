package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4022bs {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;

    public C4022bs(C0327Cn1 c0327Cn1, C0286Cf0 c0286Cf0, C0286Cf0 c0286Cf02) {
        a(1, c0327Cn1);
        this.a = c0327Cn1;
        a(2, c0286Cf0);
        this.b = c0286Cf0;
        a(3, c0286Cf02);
        this.c = c0286Cf02;
    }

    public static void a(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(AbstractC9076qb1.a("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
        }
    }
}
