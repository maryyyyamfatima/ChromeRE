package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3093Xu3 implements J44 {
    public final TabImpl a;
    public final C2833Vu3 g = new Callback() { // from class: Vu3
        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }

        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            C3093Xu3.this.e();
        }
    };
    public long h;
    public IC i;

    public static C3093Xu3 a(Tab tab) {
        return (C3093Xu3) tab.F().b(C3093Xu3.class);
    }

    public static void c(int i, Tab tab, boolean z) {
        if (tab == null || a(tab) == null) {
            return;
        }
        a(tab).d(i, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Vu3] */
    public C3093Xu3(TabImpl tabImpl) {
        this.a = tabImpl;
        tabImpl.v(new C2963Wu3(this));
        if (!tabImpl.isInitialized() || TabImpl.T(tabImpl)) {
            return;
        }
        f();
    }

    @Override // defpackage.J44
    public final void destroy() {
        long j = this.h;
        if (j != 0) {
            N.M3JHMcaQ(j, this);
        }
    }

    public final void f() {
        IC ic = this.i;
        C2833Vu3 c2833Vu3 = this.g;
        if (ic != null) {
            ic.n(c2833Vu3);
        }
        TabImpl tabImpl = this.a;
        IC c = tabImpl.C.c(tabImpl);
        this.i = c;
        if (c != null) {
            c.m(c2833Vu3);
        }
    }

    public final void e() {
        if (this.a.l()) {
            return;
        }
        d(3, b() != 2);
    }

    public final void d(int i, boolean z) {
        int b = b();
        if (b == 2 && i == 1) {
            return;
        }
        if (b == 1 && i == 2) {
            return;
        }
        if (this.h == 0) {
            this.h = N.MnC9A38r(this);
        }
        N.MQyQC7UK(this.h, this, this.a.l, b, i, z);
    }

    public final int b() {
        IC ic = this.i;
        if (ic == null) {
            return 3;
        }
        return ((Integer) ic.g).intValue();
    }
}
