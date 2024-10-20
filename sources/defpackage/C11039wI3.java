package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11039wI3 implements InterfaceC3484aI3 {
    public final InterfaceC7559m90 a;
    public final DV1 b;
    public final long c;

    @Override // defpackage.InterfaceC9648sF
    public final void a(Object obj, Object obj2, Object obj3) {
        C10353uI3 c10353uI3 = new C10353uI3(0);
        c10353uI3.b = (String) obj;
        c10353uI3.c = ((Integer) obj2).intValue();
        c10353uI3.d = ((Integer) obj3).intValue();
        this.b.A(c10353uI3.c(this.a, new C5953hV1(1, 2, this.c)));
    }

    public C11039wI3(InterfaceC7559m90 interfaceC7559m90, DV1 dv1, long j) {
        this.a = interfaceC7559m90;
        this.b = dv1;
        this.c = j;
    }
}
