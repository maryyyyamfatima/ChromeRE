package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3390a13 extends C7849n00 {
    public A13 q;
    public WeakReference r;
    public final C7128ku1 s;

    @Override // defpackage.C7849n00
    public final void o(C6383ik3 c6383ik3, String str) {
        Y03 y03 = (Y03) this.r.get();
        A13 a13 = this.q;
        if (a13 == null || y03 == null) {
            return;
        }
        boolean z = D13.a;
        a13.o(y03.o, c6383ik3, str);
    }

    @Override // defpackage.C7849n00
    public final void n(C6383ik3 c6383ik3) {
        A13 a13 = this.q;
        String str = ((Y03) this.r.get()).o;
        synchronized (a13) {
            a13.a(str, c6383ik3, true);
        }
    }

    @Override // defpackage.C7849n00
    public final void m(C6383ik3 c6383ik3, String str) {
        Y03 y03 = (Y03) this.r.get();
        A13 a13 = this.q;
        if (a13 == null || y03 == null) {
            return;
        }
        boolean z = D13.a;
        a13.p(y03.o, c6383ik3, str);
    }

    @Override // defpackage.C7849n00
    public final C6206iD0 j(int i, Object[] objArr) {
        Y03 y03 = (Y03) this.r.get();
        if (y03 == null) {
            throw new IllegalStateException("Called newEventHandler on a released Section");
        }
        return new C6206iD0(y03, i, objArr);
    }

    @Override // defpackage.C7849n00
    public final String c() {
        Y03 y03 = (Y03) this.r.get();
        if (y03 == null) {
            throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
        }
        return y03.o;
    }

    public final Y03 q() {
        return (Y03) this.r.get();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3390a13(defpackage.C7849n00 r5) {
        /*
            r4 = this;
            android.content.Context r0 = r5.a
            java.lang.String r1 = r5.d()
            gE1 r2 = r5.e()
            fX3 r5 = r5.h()
            r3 = 0
            r4.<init>(r0, r1, r2, r3)
            r4.k = r5
            ku1 r5 = new ku1
            r5.<init>()
            r4.s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390a13.<init>(n00):void");
    }

    @Override // defpackage.C7849n00
    public final void l(C5277fX3 c5277fX3) {
        this.k = c5277fX3;
    }

    @Override // defpackage.C7849n00
    public final C5277fX3 g() {
        return this.k;
    }
}
