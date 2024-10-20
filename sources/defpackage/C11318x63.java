package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x63 */
/* loaded from: classes.dex */
public final class C11318x63 implements C50 {
    public final int a;
    public final C5638gb b;
    public final C5638gb c;
    public final C5638gb d;
    public final boolean e;

    public C11318x63(String str, int i, C5638gb c5638gb, C5638gb c5638gb2, C5638gb c5638gb3, boolean z) {
        this.a = i;
        this.b = c5638gb;
        this.c = c5638gb2;
        this.d = c5638gb3;
        this.e = z;
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        return new C6651jX3(abstractC11937yv, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return Y5.a(AbstractC10975w63.a("Trim Path: {start: ", valueOf, ", end: ", valueOf2, ", offset: "), String.valueOf(this.d), "}");
    }
}
