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
/* loaded from: classes.dex */
public final class C63 implements InterfaceC9295rD, T20 {
    public final C7212l83 a;
    public final InterfaceC7697ma2 g;
    public final InterfaceC0079Ap3 h;
    public I5 i;
    public final C6166i6 j;
    public final C8610pD k;
    public final C12157za2 l = new C12157za2();
    public ZX1 m;
    public B63 n;
    public int o;

    public C63(a aVar, Drawable drawable, C6166i6 c6166i6, InterfaceC7697ma2 interfaceC7697ma2, LQ2 lq2, C7212l83 c7212l83, I5 i5, ZX1 zx1, final MQ2 mq2) {
        this.i = i5;
        i5.b(this);
        this.j = c6166i6;
        this.a = c7212l83;
        this.g = interfaceC7697ma2;
        this.h = lq2;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: A63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Tab tab;
                C63 c63 = C63.this;
                J63 j63 = (J63) ((C8385oa2) c63.g).g;
                if (j63 == null || (tab = (Tab) c63.j.g) == null) {
                    return;
                }
                Runnable runnable = mq2;
                if (runnable != null) {
                    runnable.run();
                }
                FI2.a("MobileTopToolbarShareButton");
                if (tab.b() != null) {
                    N.M$ejnyHh(tab.b(), "TopToolbar.Share", "HasOccurred");
                }
                j63.b(1, tab, false);
                InterfaceC0079Ap3 interfaceC0079Ap3 = c63.h;
                if (interfaceC0079Ap3.i()) {
                    ((KU3) interfaceC0079Ap3.get()).notifyEvent("adaptive_toolbar_customization_share_opened");
                }
            }
        };
        B63 b63 = new B63(this);
        this.n = b63;
        this.m = zx1;
        zx1.a(b63);
        this.k = new C8610pD(false, drawable, onClickListener, R.string.0_resource_name_obfuscated_res_0x7f140a19, true, null, 3);
        this.o = aVar.getResources().getConfiguration().screenWidthDp;
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.o;
        int i2 = configuration.screenWidthDp;
        if (i == i2) {
            return;
        }
        this.o = i2;
        b((Tab) this.j.g);
        a(this.k.a);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        ZX1 zx1;
        I5 i5 = this.i;
        if (i5 != null) {
            i5.c(this);
            this.i = null;
        }
        B63 b63 = this.n;
        if (b63 == null || (zx1 = this.m) == null) {
            return;
        }
        zx1.h(b63);
        this.n = null;
        this.m = null;
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.l.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.l.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        b(tab);
        C8610pD c8610pD = this.k;
        if (c8610pD.c.f == null && tab != null && AbstractC8293oI0.a() && M6.b()) {
            Yc4 yc4 = new Yc4(1);
            yc4.b = true;
            C12180ze1 c12180ze1 = new C12180ze1(tab.getContext().getResources(), "IPH_AdaptiveButtonInTopToolbarCustomization_Share", R.string.0_resource_name_obfuscated_res_0x7f1401bf, R.string.0_resource_name_obfuscated_res_0x7f1401bf);
            c12180ze1.o = yc4;
            c8610pD.b(c12180ze1);
        }
        return c8610pD;
    }

    public final void b(Tab tab) {
        C6166i6 c6166i6;
        C8610pD c8610pD = this.k;
        if (tab == null || tab.b() == null || (c6166i6 = this.j) == null || c6166i6.g == null) {
            c8610pD.a = false;
            return;
        }
        int i = this.o;
        C7928nE c7928nE = UN.a;
        boolean z = i >= N.M37SqSAy("AdaptiveButtonInTopToolbarCustomizationV2", "minimum_width_dp", 360);
        if (((C8385oa2) this.g).g == null || !z) {
            c8610pD.a = false;
        } else {
            this.a.getClass();
            c8610pD.a = C7212l83.a(tab);
        }
    }

    public final void a(boolean z) {
        Iterator it = this.l.iterator();
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
