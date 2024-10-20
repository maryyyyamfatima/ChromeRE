package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jR3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6621jR3 implements InterfaceC4216cR3 {
    public final InterfaceC0079Ap3 a;
    public final InterfaceC0079Ap3 g;
    public final InterfaceC0079Ap3 h;
    public final InterfaceC7697ma2 i;
    public final InterfaceC0079Ap3 j;
    public final Runnable k;
    public final InterfaceC7697ma2 l;
    public final C8385oa2 m = new C8385oa2();
    public final C4560dR3 n;
    public final C4903eR3 o;
    public C6279iR3 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dR3, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eR3, org.chromium.base.Callback] */
    public C6621jR3(C11760yP3 c11760yP3, C12103zP3 c12103zP3, AP3 ap3, C8385oa2 c8385oa2, BP3 bp3, CP3 cp3, InterfaceC7697ma2 interfaceC7697ma2) {
        this.a = c11760yP3;
        this.g = c12103zP3;
        this.h = ap3;
        this.i = c8385oa2;
        this.j = bp3;
        this.k = cp3;
        this.l = interfaceC7697ma2;
        b();
        ?? r2 = new Callback() { // from class: dR3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C6621jR3 c6621jR3 = C6621jR3.this;
                c6621jR3.b();
                C6279iR3 c6279iR3 = new C6279iR3(c6621jR3, new C5591gR3(c6621jR3));
                c6621jR3.p = c6279iR3;
                ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).c.b(c6279iR3);
                ((C8385oa2) c6621jR3.l).n(c6621jR3.n);
            }
        };
        this.n = r2;
        ?? r3 = new Callback() { // from class: eR3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C6621jR3 c6621jR3 = C6621jR3.this;
                c6621jR3.b();
                ((C8385oa2) ((JB) obj).r()).m(new Callback() { // from class: fR3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        C6621jR3.this.b();
                    }
                });
            }
        };
        this.o = r3;
        if (C9861ss.b()) {
            ((C8385oa2) interfaceC7697ma2).m(r2);
            c8385oa2.m(r3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            ma2 r0 = r4.i
            oa2 r0 = (defpackage.C8385oa2) r0
            java.lang.Object r0 = r0.g
            JB r0 = (defpackage.JB) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L31
            Lw3 r0 = r0.g
            if (r0 == 0) goto L2d
            Ow3 r0 = (defpackage.C1933Ow3) r0
            dx3 r0 = r0.B
            Fv3 r0 = r0.n
            if (r0 == 0) goto L28
            boolean r3 = r0.c()
            if (r3 != 0) goto L20
            r0 = r1
            goto L24
        L20:
            r0.h()
            r0 = r2
        L24:
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L31
            return r2
        L31:
            Ap3 r0 = r4.a
            java.lang.Object r0 = r0.get()
            org.chromium.chrome.browser.tab.Tab r0 = (org.chromium.chrome.browser.tab.Tab) r0
            if (r0 == 0) goto L53
            boolean r3 = r0.h()
            if (r3 == 0) goto L53
            g12 r1 = r0.x()
            if (r1 == 0) goto L4a
            r1.s()
        L4a:
            r0.f()
            java.lang.Runnable r0 = r4.k
            r0.run()
            return r2
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6621jR3.a():boolean");
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        a();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.m;
    }

    public final void b() {
        InterfaceC7697ma2 interfaceC7697ma2 = this.i;
        Object obj = ((C8385oa2) interfaceC7697ma2).g;
        C8385oa2 c8385oa2 = this.m;
        if (obj != null) {
            JB jb = (JB) ((C8385oa2) interfaceC7697ma2).g;
            Boolean bool = Boolean.TRUE;
            if (bool.equals(((C8385oa2) jb.r()).g)) {
                c8385oa2.p(bool);
                return;
            }
        }
        Tab tab = (Tab) this.a.get();
        if (tab != null && tab.h()) {
            c8385oa2.p(Boolean.TRUE);
        } else {
            c8385oa2.p(Boolean.FALSE);
        }
    }
}
