package defpackage;

import android.graphics.PointF;
import org.chromium.chrome.browser.image_editor.OverlayFragment;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kf2 */
/* loaded from: classes5.dex */
public final class C7039kf2 extends SR2 {
    public final /* synthetic */ OverlayFragment a;

    @Override // defpackage.SR2
    public final void g(OS2 os2) {
        C8066ne3 c8066ne3;
        OverlayFragment overlayFragment = this.a;
        if (overlayFragment.h0) {
            int i = os2.j;
            if (!((i & 8) != 0)) {
                if ((i & 16) != 0) {
                    if (os2.l == null) {
                        PS2 ps2 = PS2.l;
                        return;
                    }
                    return;
                } else {
                    if ((i & 32) != 0) {
                        overlayFragment.M0();
                        return;
                    }
                    return;
                }
            }
            LS2 ls2 = os2.k;
            if (ls2 == null) {
                ls2 = LS2.o;
            }
            String str = ls2.k;
            if (overlayFragment.e0.b.m || overlayFragment.i0) {
                overlayFragment.b0.t();
                return;
            }
            overlayFragment.b0.l(false);
            overlayFragment.g0 = ls2;
            C3443aA2 c3443aA2 = ls2.n;
            if (c3443aA2 == null) {
                c3443aA2 = C3443aA2.o;
            }
            C7269lJ3 c7269lJ3 = ls2.m;
            C7269lJ3 c7269lJ32 = c7269lJ3 == null ? C7269lJ3.q : c7269lJ3;
            float f = c7269lJ32.m * c3443aA2.l;
            float f2 = -c3443aA2.n;
            LH3 lh3 = overlayFragment.d0;
            if (c7269lJ3 == null) {
                c7269lJ3 = C7269lJ3.q;
            }
            QH3 qh3 = lh3.a;
            qh3.getClass();
            ND2 nd2 = RH3.c;
            int rotateRight = Integer.rotateRight(c7269lJ3.n, 8);
            PropertyModel propertyModel = qh3.g;
            propertyModel.m(nd2, rotateRight);
            String str2 = c7269lJ3.k;
            qh3.j = str2;
            propertyModel.o(RH3.b, str2);
            overlayFragment.d0.getClass();
            BK3 bk3 = (BK3) overlayFragment.f0.a;
            synchronized (bk3.g) {
                c8066ne3 = bk3.f;
            }
            C2987Wz2 c2987Wz2 = c3443aA2.k;
            float f3 = (c2987Wz2 == null ? C2987Wz2.m : c2987Wz2).k;
            float f4 = c8066ne3.b;
            if (c2987Wz2 == null) {
                c2987Wz2 = C2987Wz2.m;
            }
            PointF pointF = new PointF(f3, f4 - c2987Wz2.l);
            C11653y51 c11653y51 = overlayFragment.e0;
            MD2 md2 = B51.i;
            c11653y51.a.a.l(md2, f);
            C11996z51 c11996z51 = overlayFragment.e0.a;
            c11996z51.getClass();
            c11996z51.i(Integer.rotateRight(c7269lJ32.n, 8), (int) c3443aA2.l, c7269lJ32.k);
            float degrees = ((float) Math.toDegrees(f2)) % 360.0f;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            c11996z51.a.l(B51.e, degrees);
            PropertyModel propertyModel2 = c11996z51.a;
            propertyModel2.l(md2, f);
            propertyModel2.o(B51.c, pointF);
            if (str.isEmpty()) {
                return;
            }
            BK3 bk32 = overlayFragment.b0;
            bk32.getClass();
            C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
            C3833bJ3 c3833bJ3 = (C3833bJ3) C4176cJ3.l.j();
            if (c3833bJ3.h) {
                c3833bJ3.l();
                c3833bJ3.h = false;
            }
            C4176cJ3 c4176cJ3 = (C4176cJ3) c3833bJ3.g;
            c4176cJ3.getClass();
            c4176cJ3.j = 1 | c4176cJ3.j;
            c4176cJ3.k = str;
            if (c6969kS2.h) {
                c6969kS2.l();
                c6969kS2.h = false;
            }
            C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
            C4176cJ3 c4176cJ32 = (C4176cJ3) c3833bJ3.j();
            c7313lS2.getClass();
            c4176cJ32.getClass();
            c7313lS2.k = c4176cJ32;
            c7313lS2.j = 35;
            bk32.o((C7313lS2) c6969kS2.j());
        }
    }

    public C7039kf2(OverlayFragment overlayFragment) {
        this.a = overlayFragment;
    }
}
