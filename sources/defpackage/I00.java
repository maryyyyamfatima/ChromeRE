package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I00 {
    public final C7849n00 b;
    public final WZ c;
    public final int d;
    public final int e;
    public final boolean f;
    public final C5277fX3 g;
    public final boolean j;
    public volatile boolean k;
    public final int l;
    public final String m;
    public final /* synthetic */ ComponentTree o;
    public final AtomicInteger a = new AtomicInteger(-1);
    public final AtomicInteger i = new AtomicInteger(0);
    public volatile boolean n = false;
    public final FutureTask h = new FutureTask(new H00(this));

    public I00(ComponentTree componentTree, C7849n00 c7849n00, WZ wz, int i, int i2, int i3, boolean z, C5277fX3 c5277fX3, int i4, String str) {
        this.o = componentTree;
        this.b = c7849n00;
        this.c = wz;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = c5277fX3;
        this.j = ComponentTree.l(i4);
        this.l = i4;
        this.m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C0772Fy1 a(defpackage.I00 r16) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I00.a(I00):Fy1");
    }

    public final C0772Fy1 b(C0772Fy1 c0772Fy1) {
        InterfaceC9173qr2 interfaceC9173qr2;
        if (this.n) {
            return null;
        }
        int i = this.l;
        C7849n00 c7849n00 = c0772Fy1.c;
        if (c0772Fy1.T) {
            C1032Hy1 c1032Hy1 = new C1032Hy1(c0772Fy1, null, null);
            c7849n00.o = c1032Hy1;
            WZ wz = c0772Fy1.d;
            int i2 = c0772Fy1.e;
            int i3 = c0772Fy1.f;
            C5524gE1 e = c7849n00.e();
            if (e != null) {
                try {
                    interfaceC9173qr2 = VH1.a(c7849n00, e, e.b(c7849n00, 19));
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                interfaceC9173qr2 = null;
            }
            if (interfaceC9173qr2 != null) {
                interfaceC9173qr2.g("component", wz.c0());
                interfaceC9173qr2.g("calculate_layout_state_source", C0772Fy1.o(i));
            }
            InterfaceC3331Zq1 interfaceC3331Zq1 = c0772Fy1.r;
            C11523xj0 c11523xj0 = c0772Fy1.u;
            if (interfaceC3331Zq1 != C7849n00.p) {
                AbstractC3106Xx1.g(interfaceC3331Zq1);
                if (interfaceC9173qr2 != null) {
                    interfaceC9173qr2.e("start_measure");
                }
                AbstractC3106Xx1.f(c7849n00, interfaceC3331Zq1, i2, i3, c11523xj0);
                if (interfaceC9173qr2 != null) {
                    interfaceC9173qr2.e("end_measure");
                }
            } else {
                boolean z = AbstractC3106Xx1.a;
            }
            C0772Fy1.p(c7849n00, c0772Fy1);
            c1032Hy1.a = null;
            c1032Hy1.c = null;
            c1032Hy1.b = null;
            if (interfaceC9173qr2 != null) {
                e.getClass();
                C5524gE1.a(interfaceC9173qr2);
            }
            synchronized (this) {
                if (this.n) {
                    c0772Fy1 = null;
                }
            }
            return c0772Fy1;
        }
        throw new IllegalStateException("Can not resume a finished LayoutState calculation");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I00.class != obj.getClass()) {
            return false;
        }
        I00 i00 = (I00) obj;
        return this.d == i00.d && this.e == i00.e && this.b.equals(i00.b) && this.c.l == i00.c.l;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.l) * 31) + this.d) * 31) + this.e;
    }
}
