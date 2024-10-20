package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gx3 */
/* loaded from: classes.dex */
public final class C0899Gx3 extends AbstractC8991qK2 {
    public final /* synthetic */ C1289Jx3 a;

    @Override // defpackage.AbstractC8991qK2
    public final void a() {
        C1289Jx3 c1289Jx3 = this.a;
        AbstractC8305oK2 abstractC8305oK2 = c1289Jx3.d;
        if (abstractC8305oK2 == null) {
            return;
        }
        c1289Jx3.a(Math.max(abstractC8305oK2.q(), c1289Jx3.a.l()));
    }

    @Override // defpackage.AbstractC8991qK2
    public final void d(int i, int i2) {
        this.a.b(i, i2, true, false);
    }

    @Override // defpackage.AbstractC8991qK2
    public final void e(int i, int i2) {
        C1289Jx3 c1289Jx3 = this.a;
        c1289Jx3.b(i, 1, false, true);
        c1289Jx3.b(i2, 1, true, false);
    }

    @Override // defpackage.AbstractC8991qK2
    public final void f(int i, int i2) {
        this.a.b(i, i2, false, true);
    }

    @Override // defpackage.AbstractC8991qK2
    public final void b(int i, int i2) {
        this.a.b(i, i2, true, true);
    }

    @Override // defpackage.AbstractC8991qK2
    public final void c(Object obj, int i, int i2) {
        this.a.b(i, i2, true, true);
    }

    public C0899Gx3(C1289Jx3 c1289Jx3) {
        this.a = c1289Jx3;
    }
}
