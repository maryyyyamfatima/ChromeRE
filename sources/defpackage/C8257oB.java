package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8257oB {
    public final C8600pB a = new C8600pB();
    public C10730vP2 b;

    public C8257oB(C7849n00 c7849n00) {
        this.b = c7849n00.h;
    }

    public final void b(int i, float f) {
        a();
        int a = this.b.a(f);
        a();
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Given invalid corner: ", i));
        }
        this.a.a[i] = a;
    }

    public final void a() {
        if (this.b == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }
}
