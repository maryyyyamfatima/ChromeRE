package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lU1 */
/* loaded from: classes.dex */
public final class C7322lU1 implements C50 {
    public final int a;
    public final boolean b;

    public C7322lU1(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final String toString() {
        return AbstractC4199cO1.a("MergePaths{mode=", AbstractC6978kU1.a(this.a), "}");
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        if (!jj1.p) {
            AbstractC5888hI1.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C7666mU1(this);
    }
}
