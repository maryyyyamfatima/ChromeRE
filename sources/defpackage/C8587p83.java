package defpackage;

import android.app.Activity;
import java.util.WeakHashMap;
import org.chromium.content.browser.ScreenOrientationProviderImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p83 */
/* loaded from: classes.dex */
public final class C8587p83 implements InterfaceC6044hl1 {
    public final C9766sc0 a;
    public final HX3 g;
    public final C0281Ce0 h;
    public final C3595ae0 i;
    public final InterfaceC3241Yy1 j;
    public final C3135Yd0 k;
    public final C5626gY3 l;
    public boolean m = true;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    public C8587p83(C9766sc0 c9766sc0, B84 b84, C2090Qc0 c2090Qc0, PC pc, C0281Ce0 c0281Ce0, C3595ae0 c3595ae0, I5 i5, HX3 hx3, InterfaceC3241Yy1 interfaceC3241Yy1, C3135Yd0 c3135Yd0) {
        this.a = c9766sc0;
        this.g = hx3;
        this.h = c0281Ce0;
        this.i = c3595ae0;
        this.j = interfaceC3241Yy1;
        InterfaceC5970hY3 B = pc.B();
        this.l = B instanceof C5626gY3 ? (C5626gY3) B : null;
        this.k = c3135Yd0;
        c2090Qc0.j.a = new C7900n83(b84);
        c9766sc0.j.a(new Runnable() { // from class: o83
            @Override // java.lang.Runnable
            public final void run() {
                C8587p83 c8587p83 = C8587p83.this;
                C9423rc0 c9423rc0 = c8587p83.a.i;
                boolean z = c9423rc0 == null || c9423rc0.b != 2;
                if (c8587p83.m == z) {
                    return;
                }
                c8587p83.m = z;
                c8587p83.b(z);
            }
        });
        i5.b(this);
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
        if (this.a.i == null) {
            b(true);
        }
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void i() {
        if (this.a.i == null) {
            a(true);
        }
    }

    public final void b(boolean z) {
        int i;
        Activity activity;
        a(z);
        HX3 hx3 = this.g;
        if (hx3.e != z) {
            hx3.e = z;
            hx3.b();
            hx3.c();
            boolean z2 = hx3.e;
            GX3 gx3 = hx3.i;
            C2468Sz3 c2468Sz3 = hx3.a;
            if (z2) {
                c2468Sz3.d(gx3);
            } else {
                c2468Sz3.j(gx3);
            }
        }
        C0281Ce0 c0281Ce0 = this.h;
        if (c0281Ce0.g != z) {
            c0281Ce0.g = z;
            c0281Ce0.b();
        }
        C3595ae0 c3595ae0 = this.i;
        if (c3595ae0.c != z) {
            c3595ae0.c = z;
            c3595ae0.b.j();
        }
        C3135Yd0 c3135Yd0 = this.k;
        if (z) {
            i = c3135Yd0.b;
        } else {
            c3135Yd0.getClass();
            i = 0;
        }
        ScreenOrientationProviderImpl screenOrientationProviderImpl = ScreenOrientationProviderImpl.getInstance();
        byte b = (byte) i;
        screenOrientationProviderImpl.getClass();
        C10285u6 c10285u6 = c3135Yd0.a;
        if (c10285u6 != null && (activity = (Activity) c10285u6.k().get()) != null) {
            WeakHashMap weakHashMap = screenOrientationProviderImpl.g;
            if (b != 0) {
                weakHashMap.put(activity, Byte.valueOf(b));
            } else {
                weakHashMap.remove(activity);
            }
        }
        ScreenOrientationProviderImpl.getInstance().e(c10285u6);
    }

    public final void a(boolean z) {
        C5626gY3 c5626gY3 = this.l;
        if (c5626gY3 == null) {
            return;
        }
        InterfaceC3241Yy1 interfaceC3241Yy1 = this.j;
        if (z) {
            ((C10832vi1) interfaceC3241Yy1.get()).a(c5626gY3.b, c5626gY3.a);
            return;
        }
        C10832vi1 c10832vi1 = (C10832vi1) interfaceC3241Yy1.get();
        if (c10832vi1.j) {
            c10832vi1.j = false;
            c10832vi1.h.removeCallbacks(c10832vi1.i);
            c10832vi1.d();
            c10832vi1.g.p(0);
        }
    }
}
