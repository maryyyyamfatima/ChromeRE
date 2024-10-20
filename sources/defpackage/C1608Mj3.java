package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.toolbar.top.a;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mj3 */
/* loaded from: classes2.dex */
public final class C1608Mj3 {
    public final PropertyModel a;
    public final Callback b;
    public final boolean c;
    public final boolean d;
    public final InterfaceC0079Ap3 e;
    public final boolean f;
    public final InterfaceC7913nB g;
    public final LS1 h;
    public final C1349Kj3 i;
    public final C1479Lj3 j;
    public final InterfaceC7697ma2 k;
    public final Callback l;
    public InterfaceC10590uz3 m;
    public C10226tv3 n;
    public float r;
    public C12066zI1 s;
    public LogoView t;
    public C4496dF q = new C4496dF();
    public int o = 0;
    public boolean p = true;

    public final void a(C8610pD c8610pD) {
        boolean z = c8610pD.a && !((AbstractC11276wz3) this.m).o();
        LD2 ld2 = AbstractC1738Nj3.g;
        PropertyModel propertyModel = this.a;
        if (z) {
            C8267oD c8267oD = c8610pD.c;
            propertyModel.o(AbstractC1738Nj3.d, c8267oD.b);
            propertyModel.o(AbstractC1738Nj3.e, c8267oD.a.getConstantState().newDrawable());
            propertyModel.m(AbstractC1738Nj3.f, c8267oD.d);
            propertyModel.k(ld2, true);
            this.b.onResult(c8267oD.f);
            return;
        }
        propertyModel.k(ld2, false);
    }

    public C1608Mj3(PropertyModel propertyModel, a aVar, boolean z, LS1 ls1, C8385oa2 c8385oa2, GP3 gp3, boolean z2, boolean z3, JP3 jp3, InterfaceC7697ma2 interfaceC7697ma2, C3809bF c3809bF) {
        this.a = propertyModel;
        this.b = aVar;
        this.c = z;
        this.h = ls1;
        this.e = gp3;
        this.f = z3;
        this.g = jp3;
        this.k = interfaceC7697ma2;
        this.l = c3809bF;
        c8385oa2.m(new Callback() { // from class: Jj3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1608Mj3 c1608Mj3 = C1608Mj3.this;
                c1608Mj3.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    if (!c1608Mj3.a.j(AbstractC1738Nj3.g)) {
                        return;
                    }
                }
                c1608Mj3.a((C8610pD) c1608Mj3.e.get());
            }
        });
        this.d = z2;
        this.i = new C1349Kj3(this);
        this.j = new C1479Lj3(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:            if (((r0 == null || ((defpackage.AbstractC11276wz3) r0).j(true).getCount() == 0) ? false : true) != false) goto L81;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            int r0 = r5.o
            r1 = 2
            LD2 r2 = defpackage.AbstractC1738Nj3.v
            org.chromium.ui.modelutil.PropertyModel r3 = r5.a
            r4 = 0
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r3.k(r2, r4)
            r5.d()
            return
        L14:
            boolean r0 = r5.c
            r1 = 1
            if (r0 == 0) goto L2f
            uz3 r0 = r5.m
            if (r0 != 0) goto L1e
            goto L2c
        L1e:
            wz3 r0 = (defpackage.AbstractC11276wz3) r0
            org.chromium.chrome.browser.tabmodel.TabModel r0 = r0.j(r1)
            int r0 = r0.getCount()
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2d
        L2c:
            r0 = r4
        L2d:
            if (r0 == 0) goto L30
        L2f:
            r4 = r1
        L30:
            r3.k(r2, r4)
            r5.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1608Mj3.b():void");
    }

    public final void c() {
        C11037wI1 c11037wI1;
        final C12066zI1 c12066zI1 = this.s;
        boolean z = false;
        if (c12066zI1 != null) {
            int i = this.o;
            if (i == 1) {
                InterfaceC7697ma2 interfaceC7697ma2 = c12066zI1.a;
                C8385oa2 c8385oa2 = (C8385oa2) interfaceC7697ma2;
                c8385oa2.getClass();
                if (AbstractC12248zp3.a(c8385oa2)) {
                    c12066zI1.a(false);
                } else {
                    new C11832yd2(interfaceC7697ma2, c12066zI1.d.b(new Callback() { // from class: xI1
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C12066zI1.this.a(false);
                        }
                    }));
                }
            } else if ((i == 0 || i == 2 || i == 3) && (c11037wI1 = c12066zI1.e) != null) {
                c12066zI1.f = false;
                c11037wI1.a();
                c12066zI1.e = null;
            }
        }
        if (this.o == 1 && this.p) {
            z = true;
        }
        this.a.k(AbstractC1738Nj3.i, z);
    }

    public final void e() {
        int i = this.o;
        boolean z = false;
        boolean z2 = i == 2 || i == 4;
        LD2 ld2 = AbstractC1738Nj3.m;
        if (z2 || (C10021tL.f().c() && !this.f)) {
            z = true;
        }
        this.a.k(ld2, z);
        d();
    }

    public final void d() {
        LD2 ld2 = AbstractC1738Nj3.n;
        LD2 ld22 = AbstractC1738Nj3.m;
        PropertyModel propertyModel = this.a;
        propertyModel.k(ld2, propertyModel.j(ld22) && !propertyModel.j(AbstractC1738Nj3.v));
    }
}
