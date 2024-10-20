package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NI2 implements C50 {
    public final String a;
    public final InterfaceC10445ub b;
    public final InterfaceC10445ub c;
    public final C5638gb d;
    public final boolean e;

    public NI2(String str, InterfaceC10445ub interfaceC10445ub, C7356lb c7356lb, C5638gb c5638gb, boolean z) {
        this.a = str;
        this.b = interfaceC10445ub;
        this.c = c7356lb;
        this.d = c5638gb;
        this.e = z;
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        return new MI2(jj1, abstractC11937yv, this);
    }

    public final String toString() {
        return KR0.a("RectangleShape{position=", String.valueOf(this.b), ", size=", String.valueOf(this.c), "}");
    }
}
