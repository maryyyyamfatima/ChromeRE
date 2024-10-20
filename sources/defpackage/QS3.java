package defpackage;

import J.N;
import android.content.Context;
import androidx.appcompat.app.a;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QS3 extends RJ3 {
    public final C10452uc0 k;
    public final InterfaceC0079Ap3 l;
    public final boolean m;
    public final Context n;
    public final boolean o;
    public final boolean p;
    public boolean q;

    public static int f(Tab tab) {
        if (tab.isNativePage()) {
            return tab.x().t();
        }
        WebContents b = tab.b();
        RenderWidgetHostViewImpl W0 = b == null ? null : b.W0();
        int MRWsmoin = W0 != null ? N.MRWsmoin(W0.a, W0) : 0;
        return MRWsmoin != 0 ? MRWsmoin : AbstractC11746yN.b(tab.getContext(), false);
    }

    public QS3(a aVar, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z, boolean z2, boolean z3) {
        super(aVar);
        this.n = aVar;
        this.k = new C10452uc0(interfaceC7697ma2, new PS3(this), new Callback() { // from class: OS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                QS3 qs3 = QS3.this;
                qs3.getClass();
                if (tab != null) {
                    qs3.k(tab.k(), tab, false);
                }
            }
        });
        this.l = interfaceC0079Ap3;
        this.m = z;
        this.o = z2;
        this.p = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i, Tab tab, boolean z) {
        int g;
        a(d(i, tab), z);
        this.q = j(i, tab);
        boolean isIncognito = tab.isIncognito();
        boolean z2 = this.q;
        if (isIncognito) {
            g = 2;
        } else {
            g = z2 ? 3 : AbstractC3899bX.g(this.a);
        }
        c(g, AbstractC3494aK3.c(this.n, g));
    }

    public final void e() {
        this.i.clear();
        this.j.clear();
        this.k.a();
    }

    public final int d(int i, Tab tab) {
        int intValue;
        if (!(i(tab) && i != 0 && (this.p || !AbstractC3899bX.f(i)))) {
            i = AbstractC11746yN.a(this.n, tab.isIncognito());
            if (i(tab) && (intValue = ((Integer) this.l.get()).intValue()) != 0) {
                i = intValue;
            }
        }
        return i | (-16777216);
    }

    public final boolean j(int i, Tab tab) {
        return !(i(tab) && i != 0 && (this.p || !AbstractC3899bX.f(i))) && (!i(tab) || ((Integer) this.l.get()).intValue() == 0);
    }

    public final boolean i(Tab tab) {
        return (!tab.H() || this.m || (!this.o && AbstractC3899bX.e(tab.getContext())) || tab.isNativePage() || tab.isIncognito()) ? false : true;
    }

    public final int g(Tab tab) {
        InterfaceC5451g12 x = tab.x();
        int d = d(tab.k(), tab);
        return x != null ? x.m(d) : d;
    }

    public final float h(Tab tab) {
        float f = AbstractC3899bX.h(d(tab.k(), tab)) ? 1.0f : 0.2f;
        InterfaceC5451g12 x = tab.x();
        return x != null ? x.o(f) : f;
    }
}
