package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ah0 */
/* loaded from: classes.dex */
public final class C3613ah0 {
    public final Context a;
    public final C12090zN0 b;
    public final C11854yh0 c;
    public final C5226fN2 d;
    public FrameLayout e;

    public C3613ah0(Context context, C0351Cs0 c0351Cs0, C2332Ry2 c2332Ry2, OfflineContentAggregatorBridge offlineContentAggregatorBridge, C8491os0 c8491os0, C7526m33 c7526m33, C8834ps0 c8834ps0, C9177qs0 c9177qs0, ZX1 zx1, C4168cI0 c4168cI0, C1241Jo0 c1241Jo0) {
        this.a = context;
        PC1 pc1 = new PC1();
        C3160Yi0 c3160Yi0 = new C3160Yi0(pc1);
        C1336Kh0 c1336Kh0 = new C1336Kh0(context, c0351Cs0, c3160Yi0, c9177qs0);
        this.d = new C5226fN2(context, zx1);
        final C11854yh0 c11854yh0 = new C11854yh0(offlineContentAggregatorBridge, c4168cI0, new C3020Xg0(this), c8491os0, new C3020Xg0(this), c7526m33, c0351Cs0, c9177qs0, pc1, c1241Jo0);
        this.c = c11854yh0;
        C6877kA0 c6877kA0 = new C6877kA0(context, c11854yh0.n);
        C6134i03 c6134i03 = c11854yh0.o;
        C7082km3 c7082km3 = new C7082km3(context, c6134i03);
        C12090zN0 c12090zN0 = new C12090zN0(context, c6134i03, c2332Ry2);
        this.b = c12090zN0;
        InterfaceC11747yN0 interfaceC11747yN0 = new InterfaceC11747yN0() { // from class: Yg0
            @Override // defpackage.InterfaceC11747yN0
            public final void a(int i) {
                C11854yh0 c11854yh02 = C11854yh0.this;
                C7237lD1 c7237lD1 = c11854yh02.i;
                InterfaceC12197zh0 interfaceC12197zh0 = c7237lD1.e;
                if (interfaceC12197zh0 != null) {
                    interfaceC12197zh0.reset();
                }
                InterfaceC12197zh0 interfaceC12197zh02 = c7237lD1.h;
                if (interfaceC12197zh02 != null) {
                    interfaceC12197zh02.reset();
                }
                c7237lD1.j.a.clear();
                int i2 = c7237lD1.k;
                boolean z = i2 == i || !(i2 == 7 || i == 7);
                if (i2 == -1 || !z) {
                    c7237lD1.k = i;
                    c7237lD1.a();
                }
                C10482uh0 c10482uh0 = new C10482uh0(c11854yh02);
                try {
                    C8037nZ3 c8037nZ3 = c11854yh02.n;
                    c8037nZ3.i = i;
                    c8037nZ3.k();
                    c10482uh0.close();
                } catch (Throwable th) {
                    try {
                        c10482uh0.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
        C12157za2 c12157za2 = c12090zN0.a;
        c12157za2.a(interfaceC11747yN0);
        c12157za2.a(c8834ps0);
        c12157za2.a(c6877kA0);
        c12157za2.a(new C9004qN0());
        NC1 nc1 = new NC1(9223372036854775806L, c7082km3.b);
        ArrayList arrayList = c3160Yi0.h;
        int size = arrayList.size();
        arrayList.add(nc1);
        c3160Yi0.q(size, 1);
        NC1 nc12 = new NC1(9223372036854775805L, c12090zN0.c.a);
        int size2 = arrayList.size();
        arrayList.add(nc12);
        c3160Yi0.q(size2, 1);
        this.e = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.e.addView(c6877kA0.h.a, layoutParams);
        this.e.addView(c1336Kh0.i, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(String str) {
        C11854yh0 c11854yh0 = this.c;
        c11854yh0.getClass();
        C10482uh0 c10482uh0 = new C10482uh0(c11854yh0);
        try {
            C6134i03 c6134i03 = c11854yh0.o;
            c6134i03.getClass();
            if (str == null) {
                str = "";
            }
            String lowerCase = str.toLowerCase(Locale.getDefault());
            if (!TextUtils.equals(c6134i03.i, lowerCase)) {
                c6134i03.i = lowerCase;
                c6134i03.k();
            }
            c10482uh0.close();
        } catch (Throwable th) {
            try {
                c10482uh0.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
