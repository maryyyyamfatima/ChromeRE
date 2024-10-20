package defpackage;

import android.os.Handler;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HO implements InterfaceC10272u34 {
    public InterfaceC3497aL1 a;
    public C4234cV1 g;
    public CC h;
    public int i = -1;
    public final GO j;
    public InterfaceC1422Ky1 k;
    public C6166i6 l;
    public ZX1 m;
    public I5 n;
    public final C4496dF o;
    public int p;
    public Handler q;
    public final DO r;
    public final EO s;
    public final FO t;

    @Override // defpackage.InterfaceC10272u34
    public final /* synthetic */ void L(boolean z) {
    }

    public HO(CC cc, C4234cV1 c4234cV1, C6166i6 c6166i6, InterfaceC0408Dd2 interfaceC0408Dd2, InterfaceC7697ma2 interfaceC7697ma2, I5 i5, C5265fV1 c5265fV1) {
        C4496dF c4496dF = new C4496dF();
        this.o = c4496dF;
        this.p = -1;
        this.r = new DO(this);
        this.s = new EO(this);
        FO fo = new FO(this);
        this.t = fo;
        this.h = cc;
        this.g = c4234cV1;
        this.a = c5265fV1;
        this.l = c6166i6;
        GO go = new GO(this);
        this.j = go;
        cc.d(go);
        interfaceC0408Dd2.j(c4496dF.b(new Callback() { // from class: AO
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                HO.this.a((InterfaceC1422Ky1) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }));
        ((C8385oa2) interfaceC7697ma2).m(new Callback() { // from class: BO
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ZX1 zx1 = (ZX1) obj;
                HO ho = HO.this;
                ZX1 zx12 = ho.m;
                EO eo = ho.s;
                if (zx12 != null) {
                    zx12.h(eo);
                }
                ho.m = zx1;
                if (zx1 == null) {
                    return;
                }
                zx1.a(eo);
            }
        });
        this.n = i5;
        i5.b(fo);
        this.q = new Handler();
    }

    public final int b() {
        return ((C5265fV1) this.a).a.a.a();
    }

    public final void a(InterfaceC1422Ky1 interfaceC1422Ky1) {
        InterfaceC1422Ky1 interfaceC1422Ky12 = this.k;
        DO r1 = this.r;
        if (interfaceC1422Ky12 != null) {
            ((C9897sy1) interfaceC1422Ky12).L(r1);
        }
        this.k = interfaceC1422Ky1;
        if (interfaceC1422Ky1 == null) {
            return;
        }
        if (this.a == null) {
            throw new IllegalStateException("setLayoutStateProvider() is called after destroy()");
        }
        ((C9897sy1) interfaceC1422Ky1).e(r1);
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        if (z) {
            if (this.p == -1) {
                this.p = b();
            }
            this.q.removeCallbacksAndMessages(null);
            return;
        }
        this.q.postDelayed(new Runnable() { // from class: CO
            @Override // java.lang.Runnable
            public final void run() {
                HO ho = HO.this;
                ((C5265fV1) ho.a).a.a.c(ho.p);
                ho.p = -1;
            }
        }, 1000L);
    }
}
