package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LB implements GC, InterfaceC11596xv1, InterfaceC1292Jy1 {
    public final PropertyModel a;
    public final ZU0 g;
    public final FC h;
    public final C4496dF i;
    public final int j;
    public final WindowAndroid k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public InterfaceC1422Ky1 p;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    public LB(WindowAndroid windowAndroid, PropertyModel propertyModel, FC fc, ZU0 zu0, int i, C8385oa2 c8385oa2) {
        this.a = propertyModel;
        this.g = zu0;
        this.h = fc;
        ((CC) fc).d(this);
        this.j = i;
        C4496dF c4496dF = new C4496dF();
        this.i = c4496dF;
        c8385oa2.m(c4496dF.b(new Callback() { // from class: KB
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                LB lb = LB.this;
                lb.getClass();
                lb.m = ((Boolean) obj).booleanValue();
                lb.j();
            }
        }));
        this.k = windowAndroid;
        windowAndroid.r().a(this);
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        this.a.m(MB.b, i3);
        j();
    }

    @Override // defpackage.InterfaceC11596xv1
    public final void g(boolean z) {
        this.o = z;
        l();
        j();
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        this.n = i == 4;
        j();
    }

    public final void l() {
        boolean h = h();
        this.a.k(MB.d, h);
        int i = h ? this.j : 0;
        FC fc = this.h;
        ((CC) fc).k(i, ((CC) fc).p);
    }

    public final boolean h() {
        if (!this.l || this.o) {
            return false;
        }
        ZU0 zu0 = this.g;
        return !(zu0 != null && ((XU0) zu0).g());
    }

    public final void j() {
        this.a.k(MB.c, h() && !this.m && !this.n && ((CC) this.h).e() == 0);
    }
}
