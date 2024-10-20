package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentTree;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: am3 */
/* loaded from: classes.dex */
public final class C3646am3 extends DK2 {
    public final InterfaceC5480g61 a;
    public G13 g;
    public AbstractC12077zK2 h;
    public C11703yE1 i;
    public int j = -1;

    public C3646am3(InterfaceC5480g61 interfaceC5480g61) {
        this.a = interfaceC5480g61;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int g = ((KJ2) this.a).g();
        if (g == -1) {
            return;
        }
        int i3 = g;
        while (true) {
            if (i3 < 0) {
                i3 = -1;
                break;
            } else if (((KJ2) this.a).X(i3)) {
                break;
            } else {
                i3--;
            }
        }
        ComponentTree P = ((KJ2) this.a).P(g);
        C11703yE1 c11703yE1 = this.i;
        if (c11703yE1 != null && P != null && c11703yE1 != P.getLithoView()) {
            this.i.setTranslationY(0.0f);
            this.i = null;
        }
        if (i3 == -1 || P == null) {
            C11703yE1 c11703yE12 = this.g.O;
            c11703yE12.K();
            c11703yE12.setVisibility(8);
            this.j = -1;
            return;
        }
        int i4 = 0;
        if (g != i3) {
            if ((this.g.O.getVisibility() == 8) || i3 != this.j) {
                ComponentTree P2 = ((KJ2) this.a).P(i3);
                C11703yE1 lithoView = P2.getLithoView();
                if (lithoView != null) {
                    if (lithoView.getWindowToken() != null) {
                        lithoView.onStartTemporaryDetach();
                    }
                }
                G13 g13 = this.g;
                g13.getClass();
                if (P2.getLithoView() != null) {
                    C11703yE1 lithoView2 = P2.getLithoView();
                    lithoView2.Q = lithoView2.D;
                }
                g13.O.H(P2);
                g13.t(g13.getWidth());
                C11703yE1 c11703yE13 = this.g.O;
                c11703yE13.setVisibility(0);
                c11703yE13.x();
            }
            int s = ((KJ2) this.a).s();
            while (true) {
                if (g > s) {
                    break;
                }
                if (((KJ2) this.a).X(g)) {
                    i4 = Math.min(this.g.getPaddingTop() + (this.h.r(g).getTop() - this.g.O.getBottom()), 0);
                    break;
                }
                g++;
            }
            this.g.O.setTranslationY(i4);
            this.j = i3;
            return;
        }
        C11703yE1 lithoView3 = P.getLithoView();
        if (lithoView3 == null) {
            boolean Q = this.g.P.Q();
            String i5 = P.i();
            boolean z2 = P.f11494J;
            synchronized (P) {
                z = P.b;
            }
            E10.a(2, "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull", "First visible sticky header item is null, RV.hasPendingAdapterUpdates: " + Q + ", first visible component: " + i5 + ", hasMounted: " + z2 + ", isReleased: " + z);
        } else {
            int i6 = i3 + 1;
            KJ2 kj2 = (KJ2) this.a;
            if (i6 < 0) {
                kj2.getClass();
            } else if (i6 < kj2.a.size()) {
                i4 = 1;
            }
            if (i4 == 0 || !((KJ2) this.a).X(i6)) {
                lithoView3.setTranslationY(-lithoView3.getTop());
            }
        }
        this.i = lithoView3;
        C11703yE1 c11703yE14 = this.g.O;
        c11703yE14.K();
        c11703yE14.setVisibility(8);
        this.j = -1;
    }
}
