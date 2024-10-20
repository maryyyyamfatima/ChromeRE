package defpackage;

import J.N;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Zf4 implements InterfaceC9295rD, T20 {
    public final InterfaceC0079Ap3 a;
    public final InterfaceC0079Ap3 g;
    public final I5 h;
    public final ZX1 i;
    public final Yf4 j;
    public final ZQ2 k;
    public final C8610pD l;
    public final C12157za2 m = new C12157za2();
    public int n;

    public Zf4(a aVar, Drawable drawable, C6166i6 c6166i6, LQ2 lq2, I5 i5, ZX1 zx1, ZQ2 zq2) {
        this.a = c6166i6;
        this.g = lq2;
        this.h = i5;
        i5.b(this);
        Yf4 yf4 = new Yf4(this);
        this.j = yf4;
        this.i = zx1;
        zx1.a(yf4);
        this.k = zq2;
        this.l = new C8610pD(false, drawable, new View.OnClickListener() { // from class: Xf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Zf4 zf4 = Zf4.this;
                zf4.getClass();
                FI2.a("MobileTopToolbarVoiceButton");
                Vf4 b = zf4.k.a.x.D.b();
                if (b != null) {
                    b.h(4);
                }
                InterfaceC0079Ap3 interfaceC0079Ap3 = zf4.g;
                if (interfaceC0079Ap3.i()) {
                    ((KU3) interfaceC0079Ap3.get()).notifyEvent("adaptive_toolbar_customization_voice_search_opened");
                }
            }
        }, R.string.0_resource_name_obfuscated_res_0x7f140190, true, null, 4);
        this.n = aVar.getResources().getConfiguration().screenWidthDp;
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.n;
        int i2 = configuration.screenWidthDp;
        if (i == i2) {
            return;
        }
        this.n = i2;
        boolean b = b((Tab) this.a.get());
        this.l.a = b;
        a(b);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        this.h.c(this);
        this.i.h(this.j);
        this.m.clear();
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.m.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.m.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        boolean b = b(tab);
        C8610pD c8610pD = this.l;
        c8610pD.a = b;
        if (c8610pD.c.f == null && tab != null && AbstractC8293oI0.a() && M6.b()) {
            Yc4 yc4 = new Yc4(1);
            yc4.b = true;
            C12180ze1 c12180ze1 = new C12180ze1(tab.getContext().getResources(), "IPH_AdaptiveButtonInTopToolbarCustomization_VoiceSearch", R.string.0_resource_name_obfuscated_res_0x7f1401c1, R.string.0_resource_name_obfuscated_res_0x7f1401c1);
            c12180ze1.o = yc4;
            c8610pD.b(c12180ze1);
        }
        return c8610pD;
    }

    public final boolean b(Tab tab) {
        if (tab != null && !tab.isIncognito()) {
            Vf4 b = this.k.a.x.D.b();
            if (b == null ? false : b.b()) {
                int i = this.n;
                C7928nE c7928nE = UN.a;
                if (i >= N.M37SqSAy("AdaptiveButtonInTopToolbarCustomizationV2", "minimum_width_dp", 360)) {
                    return T34.h(tab.getUrl());
                }
                return false;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        Iterator it = this.m.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8953qD) c11814ya2.next()).b(z);
            }
        }
    }
}
