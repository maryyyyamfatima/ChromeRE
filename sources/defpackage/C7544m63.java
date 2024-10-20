package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m63 */
/* loaded from: classes.dex */
public final class C7544m63 implements C50 {
    public final String a;
    public final int b;
    public final C8044nb c;
    public final boolean d;

    public C7544m63(String str, int i, C8044nb c8044nb, boolean z) {
        this.a = str;
        this.b = i;
        this.c = c8044nb;
        this.d = z;
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        return new V53(jj1, abstractC11937yv, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + "}";
    }
}
