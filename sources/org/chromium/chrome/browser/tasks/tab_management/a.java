package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AA0;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1392Ks1;
import defpackage.AbstractC1558Lz3;
import defpackage.AbstractC1683My3;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractC7158kz3;
import defpackage.AbstractC9204qw3;
import defpackage.AbstractC9627sA3;
import defpackage.C1024Hw3;
import defpackage.C1813Ny3;
import defpackage.C2188Qv3;
import defpackage.C4273cc3;
import defpackage.C7272lK1;
import defpackage.C9214qy3;
import defpackage.FI2;
import defpackage.ID2;
import defpackage.InterfaceC0904Gy3;
import defpackage.InterfaceC10590uz3;
import defpackage.JM1;
import defpackage.ND2;
import defpackage.WU1;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a extends AbstractC1392Ks1 {
    public final C1813Ny3 e;
    public final InterfaceC10590uz3 f;
    public final InterfaceC0904Gy3 g;
    public final String h;
    public final C2188Qv3 i;
    public final int j;
    public float k;
    public float l;
    public float m;
    public final boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public RecyclerView u;
    public Profile v;
    public final Context w;

    public a(Context context, C1813Ny3 c1813Ny3, InterfaceC10590uz3 interfaceC10590uz3, C9214qy3 c9214qy3, C2188Qv3 c2188Qv3, String str, boolean z, int i) {
        super(0);
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = 0;
        this.e = c1813Ny3;
        this.f = interfaceC10590uz3;
        this.g = c9214qy3;
        this.h = str;
        this.n = z;
        this.i = c2188Qv3;
        this.w = context;
        this.j = i;
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void j(androidx.recyclerview.widget.d dVar) {
        C4273cc3 c4273cc3 = (C4273cc3) dVar;
        PropertyModel propertyModel = c4273cc3.B;
        ID2 id2 = AbstractC1683My3.a;
        if (propertyModel.h(id2) == 0) {
            this.g.a(c4273cc3.B.h(AbstractC9627sA3.a));
            FI2.a("MobileStackViewSwipeCloseTab." + this.h);
            return;
        }
        if (c4273cc3.B.h(id2) == 1) {
            dVar.a.findViewById(R.id.close_button).performClick();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC1002Hs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.recyclerview.widget.d r10, int r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.tasks.tab_management.a.i(androidx.recyclerview.widget.d, int):void");
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void b(RecyclerView recyclerView, androidx.recyclerview.widget.d dVar) {
        super.b(recyclerView, dVar);
        int i = this.t;
        this.t = 0;
        if (i == 2 && recyclerView.r.q() == 0 && recyclerView.getChildCount() != 0) {
            recyclerView.s.o0(dVar.a);
        }
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void g(Canvas canvas, RecyclerView recyclerView, androidx.recyclerview.widget.d dVar, float f, float f2, int i, boolean z) {
        C2188Qv3 c2188Qv3;
        int J2;
        super.g(canvas, recyclerView, dVar, f, f2, i, z);
        ID2 id2 = AbstractC1683My3.a;
        C1813Ny3 c1813Ny3 = this.e;
        int i2 = 0;
        View view = dVar.a;
        if (i == 1) {
            float max = Math.max(0.2f, 1.0f - ((Math.abs(f) * 0.8f) / this.k));
            C4273cc3 c4273cc3 = (C4273cc3) dVar;
            if (c4273cc3.B.h(id2) == 0) {
                J2 = c1813Ny3.G(c4273cc3.B.h(AbstractC9627sA3.a));
            } else {
                J2 = c4273cc3.B.h(id2) == 1 ? c1813Ny3.J(c4273cc3.B.h(WU1.a)) : -1;
            }
            if (J2 == -1) {
                return;
            }
            ((C7272lK1) c1813Ny3.get(J2)).b.l(AbstractC1683My3.b, max);
            boolean z2 = Math.abs(f) >= this.k;
            if (z2 && !this.o) {
                view.performHapticFeedback(0);
            }
            this.o = z2;
            return;
        }
        this.t = i;
        if (i != 2 || !this.n) {
            if (i != 2 || (c2188Qv3 = this.i) == null) {
                return;
            }
            boolean z3 = ((float) view.getBottom()) + f2 > ((float) recyclerView.getBottom()) - this.m;
            if (this.q == -1) {
                return;
            }
            this.s = z3 ? dVar.g() : -1;
            if (z3) {
                i2 = 2;
            } else if (this.q == -1) {
                i2 = 1;
            }
            c2188Qv3.a.g.m(AbstractC9204qw3.k, i2);
            return;
        }
        if (AbstractC5177fD3.e(this.w)) {
            int i3 = this.r;
            float f3 = this.l;
            int i4 = TabListRecyclerView.b1;
            int i5 = 0;
            while (true) {
                if (i5 >= recyclerView.r.q()) {
                    i5 = -1;
                    break;
                }
                androidx.recyclerview.widget.d G = recyclerView.G(i5);
                if (G != null) {
                    View view2 = G.a;
                    if (view2.getLeft() != view.getLeft() || view2.getTop() != view.getTop()) {
                        if (Math.abs(((float) view2.getLeft()) - (((float) view.getLeft()) + f)) < f3 && Math.abs(((float) view2.getTop()) - (((float) view.getTop()) + f2)) < f3) {
                            break;
                        }
                    }
                }
                i5++;
            }
            this.r = i5;
            androidx.recyclerview.widget.d G2 = this.u.G(i5);
            boolean z4 = G2 instanceof C4273cc3;
            if (z4) {
                if (!(z4 && ((C4273cc3) G2).B.h(id2) == 0)) {
                    this.r = -1;
                    return;
                }
            }
            c1813Ny3.K(this.r, true);
            if (i3 != this.r) {
                c1813Ny3.K(i3, false);
            }
        }
    }

    @Override // defpackage.AbstractC1002Hs1
    public final float d() {
        return this.k / this.u.getWidth();
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean h(RecyclerView recyclerView, androidx.recyclerview.widget.d dVar, androidx.recyclerview.widget.d dVar2) {
        int s;
        int i;
        int i2;
        this.q = dVar2.g();
        int i3 = this.r;
        C1813Ny3 c1813Ny3 = this.e;
        int i4 = 0;
        if (i3 != -1) {
            c1813Ny3.K(i3, false);
            this.r = -1;
        }
        PropertyModel propertyModel = ((C4273cc3) dVar).B;
        ND2 nd2 = AbstractC9627sA3.a;
        int h = propertyModel.h(nd2);
        int h2 = ((C4273cc3) dVar2).B.h(nd2);
        int g = dVar2.g() - dVar.g();
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.f;
        AbstractC7158kz3 d = abstractC11276wz3.c.d();
        TabModel g2 = abstractC11276wz3.g();
        if (d instanceof AA0) {
            int G = c1813Ny3.G(h);
            if (g > 0) {
                g++;
            }
            g2.t(h, c1813Ny3.E(G + g));
        } else if (!this.n) {
            int s2 = g2.s(abstractC11276wz3.m(h2));
            if (g > 0) {
                s2++;
            }
            g2.t(h, s2);
        } else {
            List G2 = abstractC11276wz3.c.d().G(h2);
            if (g < 0) {
                s = g2.s((Tab) G2.get(0));
            } else {
                s = g2.s((Tab) G2.get(G2.size() - 1)) + 1;
            }
            C1024Hw3 c1024Hw3 = (C1024Hw3) d;
            List<Tab> G3 = c1024Hw3.G(h);
            TabModel tabModel = c1024Hw3.a;
            int c = JM1.c(s, 0, tabModel.getCount());
            int d2 = AbstractC1558Lz3.d(tabModel, ((Tab) G3.get(0)).getId());
            if (d2 != -1 && d2 != c) {
                for (Tab tab : G3) {
                    if (tabModel.s(tab) != -1) {
                        int id = tab.getId();
                        if (c >= d2) {
                            i = i4;
                            i2 = c;
                        } else {
                            i = i4 + 1;
                            i2 = i4 + c;
                        }
                        tabModel.t(id, i2);
                        i4 = i;
                    }
                }
            }
        }
        FI2.a("TabGrid.Drag.Reordered." + this.h);
        return true;
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean a(androidx.recyclerview.widget.d dVar, androidx.recyclerview.widget.d dVar2) {
        int i = dVar2.k;
        return (i == 3 || i == 6) ? false : true;
    }

    @Override // defpackage.AbstractC1392Ks1, defpackage.AbstractC1002Hs1
    public final int c(RecyclerView recyclerView, androidx.recyclerview.widget.d dVar) {
        int i = dVar.k;
        int i2 = (i == 3 || i == 6) ? 0 : this.p;
        this.u = recyclerView;
        return ((48 | i2) << 0) | 12288 | (i2 << 16);
    }
}
