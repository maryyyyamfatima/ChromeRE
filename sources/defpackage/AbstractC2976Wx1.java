package defpackage;

import J.N;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.AbstractList;
import java.util.Iterator;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2976Wx1 {
    public Context j;
    public InterfaceC10590uz3 l;
    public TabContentManager m;
    public final InterfaceC2201Qy1 n;
    public final InterfaceC0512Dy1 o;
    public C1551Ly1[] p;
    public boolean q;
    public boolean r;
    public final float t;
    public final float u;
    public int s = -1;
    public float a = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public int k = 0;

    public void A() {
    }

    public void B(long j) {
    }

    public void C() {
    }

    public void D(boolean z) {
    }

    public boolean E() {
        return true;
    }

    public void K() {
    }

    public void M() {
    }

    public void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public boolean b() {
        return true;
    }

    public void d() {
    }

    public void e() {
    }

    public void h() {
    }

    public boolean i() {
        return false;
    }

    public abstract AbstractC5518gD0 k();

    public abstract int m();

    public abstract SceneLayer n();

    public int p() {
        return 1;
    }

    public boolean q() {
        return this instanceof C1587Mf2;
    }

    public void s() {
    }

    public boolean t() {
        return false;
    }

    public void u() {
    }

    public void v(int i) {
    }

    public void w(int i) {
    }

    public void x() {
    }

    public void y(int i, int i2, boolean z, boolean z2, float f, float f2) {
    }

    public void z(int i) {
    }

    public AbstractC2976Wx1(Context context, InterfaceC2201Qy1 interfaceC2201Qy1, CompositorViewHolder compositorViewHolder) {
        this.j = context;
        this.n = interfaceC2201Qy1;
        this.o = compositorViewHolder;
        float f = context.getResources().getDisplayMetrics().density;
        this.t = f;
        this.u = 1.0f / f;
    }

    public final V10 j() {
        return ((C9897sy1) this.n).H;
    }

    public final C1551Ly1 c(int i, boolean z) {
        InterfaceC2201Qy1 interfaceC2201Qy1 = this.n;
        C9897sy1 c9897sy1 = (C9897sy1) interfaceC2201Qy1;
        SparseArray sparseArray = c9897sy1.v;
        C1551Ly1 c1551Ly1 = (C1551Ly1) sparseArray.get(i);
        InterfaceC7839my1 interfaceC7839my1 = c9897sy1.g;
        if (c1551Ly1 == null) {
            c1551Ly1 = new C1551Ly1(i, interfaceC7839my1.getWidth(), interfaceC7839my1.getHeight(), z);
            sparseArray.put(i, c1551Ly1);
        } else {
            c1551Ly1.t(interfaceC7839my1.getWidth(), interfaceC7839my1.getHeight());
        }
        if (!c1551Ly1.j(C1551Ly1.L)) {
            interfaceC2201Qy1.a(c1551Ly1.p());
        }
        return c1551Ly1;
    }

    public final boolean P(PropertyModel propertyModel) {
        float f = (((float) 16) * 1.0f) / 1000.0f;
        MD2 md2 = C1551Ly1.j;
        float g = propertyModel.g(md2);
        MD2 md22 = C1551Ly1.k;
        float g2 = propertyModel.g(md22);
        float O = O(f, g, propertyModel.g(C1551Ly1.h));
        float O2 = O(f, g2, propertyModel.g(C1551Ly1.i));
        boolean z = (O == g && O2 == g2) ? false : true;
        propertyModel.l(md2, O);
        propertyModel.l(md22, O2);
        return z;
    }

    public final float O(float f, float f2, float f3) {
        float abs = Math.abs(f2 - f3);
        float f4 = this.u;
        if (abs > f4) {
            return f3;
        }
        float round = Math.round(this.t * f3) * f4;
        if (round < f3) {
            return Math.max(round, f2 - f);
        }
        return Math.min(round, f2 + f);
    }

    public final void F() {
        ((C9897sy1) this.n).N(null);
    }

    public void H(InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager) {
        this.l = interfaceC10590uz3;
        G(tabContentManager);
    }

    public void G(TabContentManager tabContentManager) {
        if (tabContentManager == null) {
            return;
        }
        this.m = tabContentManager;
    }

    public final void L(AbstractList abstractList) {
        TabContentManager tabContentManager = this.m;
        if (tabContentManager != null) {
            tabContentManager.i(-1, abstractList);
        }
    }

    public void J(int i, boolean z) {
        ((C9897sy1) this.n).X(i, z);
        this.q = true;
        this.s = i;
    }

    public void g() {
        if (!this.r) {
            return;
        }
        this.r = false;
        C9897sy1 c9897sy1 = (C9897sy1) this.n;
        Iterator it = c9897sy1.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1292Jy1) c11814ya2.next()).f(c9897sy1.r.m());
            }
        }
    }

    public void f() {
        ResourceManager resourceManager;
        if (this.q) {
            this.q = false;
            int i = this.s;
            if (i != -1) {
                TabModel k = ((AbstractC11276wz3) this.l).k(i);
                if (k != null) {
                    k.q(AbstractC1558Lz3.d(k, this.s), 3, false);
                }
                this.s = -1;
            }
            this.n.b();
            InterfaceC0512Dy1 interfaceC0512Dy1 = this.o;
            if (interfaceC0512Dy1 != null && (resourceManager = ((CompositorViewHolder) interfaceC0512Dy1).l.n) != null) {
                long j = resourceManager.d;
                if (j != 0) {
                    N.MnAVuP1v(j, resourceManager);
                }
            }
            if (n() != null) {
                SceneLayer n = n();
                long j2 = n.a;
                if (j2 == 0) {
                    return;
                }
                N.MJ5Z0mi3(j2, n);
            }
        }
    }

    public void I(long j, boolean z) {
        this.q = false;
        this.r = true;
        this.s = -1;
    }

    public C1551Ly1 l(int i) {
        if (this.p == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            C1551Ly1[] c1551Ly1Arr = this.p;
            if (i2 >= c1551Ly1Arr.length) {
                return null;
            }
            if (c1551Ly1Arr[i2].p() == i) {
                return this.p[i2];
            }
            i2++;
        }
    }

    public boolean r() {
        C1551Ly1[] c1551Ly1Arr = this.p;
        if (c1551Ly1Arr == null) {
            return false;
        }
        int length = c1551Ly1Arr.length;
        return false;
    }
}
