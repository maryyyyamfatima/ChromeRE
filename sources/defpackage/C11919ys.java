package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11919ys implements InterfaceC6999kY2 {
    public final InterfaceC4173cJ0 a;
    public final InterfaceC11576xs g;
    public int h;

    @Override // defpackage.InterfaceC6999kY2
    public final void b(int i) {
    }

    public C11919ys(C12075zK0 c12075zK0, C12075zK0 c12075zK02) {
        this.a = c12075zK0;
        this.g = c12075zK02;
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void a(int i) {
        d();
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void c(int i) {
        d();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [uK0] */
    public final void d() {
        C12075zK0 c12075zK0;
        C11233ws c11233ws;
        C12075zK0 c12075zK02 = (C12075zK0) this.a;
        if (c12075zK02.v.j(AbstractC4077c13.a)) {
            C11233ws c11233ws2 = c12075zK02.L;
            boolean z = c11233ws2 != null && c11233ws2.b.c();
            InterfaceC11576xs interfaceC11576xs = this.g;
            if (z) {
                if (((LinearLayoutManager) c12075zK02.A.s).R0() >= c12075zK02.q || (c11233ws = (c12075zK0 = (C12075zK0) interfaceC11576xs).L) == null) {
                    return;
                }
                c11233ws.b.b();
                c12075zK0.L = null;
                return;
            }
            if (this.h <= 0) {
                int T0 = ((LinearLayoutManager) c12075zK02.A.s).T0();
                int i = (c12075zK02.q + 30) - 1;
                RecyclerView recyclerView = c12075zK02.A;
                if (T0 >= i || ((LinearLayoutManager) recyclerView.s).T0() == ((LinearLayoutManager) recyclerView.s).C() - 1) {
                    this.h = ((LinearLayoutManager) recyclerView.s).T0();
                    return;
                }
                return;
            }
            if (((LinearLayoutManager) c12075zK02.A.s).T0() > (this.h - 1) + 1) {
                return;
            }
            this.h = 0;
            final C12075zK0 c12075zK03 = (C12075zK0) interfaceC11576xs;
            if (c12075zK03.L != null) {
                return;
            }
            C11046wK0 c11046wK0 = c12075zK03.o;
            C11233ws c11233ws3 = new C11233ws(c12075zK03.a, c11046wK0.getContext(), c11046wK0, new Runnable() { // from class: uK0
                @Override // java.lang.Runnable
                public final void run() {
                    C12075zK0 c12075zK04 = C12075zK0.this;
                    c12075zK04.L.b.b();
                    c12075zK04.L = null;
                    c12075zK04.A.u0(0);
                }
            });
            c12075zK03.L = c11233ws3;
            T8 t8 = c11233ws3.b;
            if (t8.c()) {
                return;
            }
            t8.e();
        }
    }
}
