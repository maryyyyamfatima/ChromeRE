package defpackage;

import J.N;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kz2 */
/* loaded from: classes.dex */
public final class C1428Kz2 implements InterfaceC9295rD {
    public final InterfaceC0079Ap3 a;
    public final C12157za2 g = new C12157za2();
    public final C8610pD h;

    public C1428Kz2(a aVar, final C6166i6 c6166i6, InterfaceC7697ma2 interfaceC7697ma2) {
        this.a = interfaceC7697ma2;
        this.h = new C8610pD(true, AbstractC2884Wf.a(aVar, R.drawable.0_resource_name_obfuscated_res_0x7f090411), new View.OnClickListener() { // from class: Jz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1428Kz2 c1428Kz2 = C1428Kz2.this;
                c1428Kz2.getClass();
                ((C2703Uu3) c1428Kz2.a.get()).b((Tab) ((C8385oa2) c6166i6).g);
            }
        }, R.string.0_resource_name_obfuscated_res_0x7f14046e, true, null, 6);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        C8610pD c8610pD = this.h;
        if (c8610pD.c.f == null && tab != null && AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            if (!N.M6bsIDpc("ContextualPageActionPriceTracking", "action_chip", false)) {
                c8610pD.b(new C12180ze1(tab.getContext().getResources(), "IPH_ContextualPageActions_PriceTracking", R.string.0_resource_name_obfuscated_res_0x7f140562, R.string.0_resource_name_obfuscated_res_0x7f140562));
            }
        }
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE2 = UN.a;
            if (N.M6bsIDpc("ContextualPageActionPriceTracking", "action_chip", false)) {
                c8610pD.a(R.string.0_resource_name_obfuscated_res_0x7f14046e);
                return c8610pD;
            }
        }
        c8610pD.a(0);
        return c8610pD;
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.g.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.g.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        this.g.clear();
    }
}
