package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ae2 */
/* loaded from: classes2.dex */
public final class C0023Ae2 implements InterfaceC9295rD, T20 {
    public final Context a;
    public final C12181ze2 g;
    public final I5 h;
    public final C8610pD i;
    public final C12157za2 j = new C12157za2();
    public final InterfaceC0079Ap3 k;
    public boolean l;
    public int m;

    public C0023Ae2(a aVar, Drawable drawable, I5 i5, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC7697ma2 interfaceC7697ma2, LQ2 lq2) {
        this.a = aVar;
        this.h = i5;
        i5.b(this);
        this.g = new C12181ze2(interfaceC0079Ap3, interfaceC7697ma2);
        this.k = lq2;
        this.i = new C8610pD(false, drawable, new View.OnClickListener() { // from class: ye2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC10912vv3 interfaceC10912vv3;
                C0023Ae2 c0023Ae2 = C0023Ae2.this;
                C12181ze2 c12181ze2 = c0023Ae2.g;
                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) c12181ze2.b.get();
                if (interfaceC10590uz3 == null || (interfaceC10912vv3 = (InterfaceC10912vv3) c12181ze2.a.get()) == null) {
                    return;
                }
                boolean o = ((AbstractC11276wz3) interfaceC10590uz3).o();
                FI2.a("MobileTopToolbarOptionalButtonNewTab");
                interfaceC10912vv3.b(o).e();
                InterfaceC0079Ap3 interfaceC0079Ap32 = c0023Ae2.k;
                if (interfaceC0079Ap32.i()) {
                    ((KU3) interfaceC0079Ap32.get()).notifyEvent("adaptive_toolbar_customization_new_tab_opened");
                }
            }
        }, R.string.0_resource_name_obfuscated_res_0x7f1402c9, true, null, 2);
        this.l = DeviceFormFactor.a(aVar);
        this.m = aVar.getResources().getConfiguration().screenWidthDp;
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        this.h.c(this);
        this.j.clear();
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        boolean a = DeviceFormFactor.a(this.a);
        int i = this.m;
        int i2 = configuration.screenWidthDp;
        if (i == i2 && this.l == a) {
            return;
        }
        this.m = i2;
        this.l = a;
        InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) this.g.b.get();
        a(interfaceC10590uz3 == null ? null : ((AbstractC11276wz3) interfaceC10590uz3).h());
        boolean z = this.i.a;
        Iterator it = this.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8953qD) c11814ya2.next()).b(z);
            }
        }
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.j.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.j.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        a(tab);
        C8610pD c8610pD = this.i;
        if (c8610pD.c.f == null && tab != null && AbstractC8293oI0.a() && M6.b()) {
            Yc4 yc4 = new Yc4(1);
            yc4.b = true;
            C12180ze1 c12180ze1 = new C12180ze1(tab.getContext().getResources(), "IPH_AdaptiveButtonInTopToolbarCustomization_NewTab", R.string.0_resource_name_obfuscated_res_0x7f1401b8, R.string.0_resource_name_obfuscated_res_0x7f1401b8);
            c12180ze1.o = yc4;
            c8610pD.b(c12180ze1);
        }
        return c8610pD;
    }

    public final void a(Tab tab) {
        boolean z;
        if (tab != null && tab.b() != null) {
            int i = this.m;
            C7928nE c7928nE = UN.a;
            if (i >= N.M37SqSAy("AdaptiveButtonInTopToolbarCustomizationV2", "minimum_width_dp", 360) && !this.l && !T34.k(tab.getUrl())) {
                z = true;
                this.i.a = z;
            }
        }
        z = false;
        this.i.a = z;
    }
}
