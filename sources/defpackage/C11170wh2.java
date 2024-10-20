package defpackage;

import J.N;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.c;
import com.android.chrome.R;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.page_info.PageInfoRowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11170wh2 extends AbstractC11513xh2 implements InterfaceC1189Jd3 {
    public final InterfaceC10141th2 h;
    public final PageInfoRowView i;
    public final String j;
    public final String k;
    public boolean l;
    public boolean m;
    public final int n;
    public final int o;
    public final C8083nh2 p;

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    public C11170wh2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, WO wo, int i) {
        super(wo);
        this.p = new C8083nh2();
        this.h = interfaceC10141th2;
        this.i = pageInfoRowView;
        this.k = ((PageInfoController) interfaceC10141th2).n.i();
        this.n = i;
        Resources resources = pageInfoRowView.getContext().getResources();
        this.o = R.color.f22530_resource_name_obfuscated_res_0x7f0705b2;
        this.j = resources.getString(R.string.f79730_resource_name_obfuscated_res_0x7f14076f);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        if (!(!this.a.a().J())) {
            return null;
        }
        Bundle R0 = SingleWebsiteSettings.R0(this.k);
        R0.putBoolean("org.chromium.chrome.preferences.show_sound", this.l);
        SingleWebsiteSettings singleWebsiteSettings = (SingleWebsiteSettings) c.V(this.i.getContext(), SingleWebsiteSettings.class.getName(), R0);
        singleWebsiteSettings.k0 = true;
        singleWebsiteSettings.n0 = this;
        int i = this.n;
        if (i != -1) {
            singleWebsiteSettings.l0 = i;
            singleWebsiteSettings.m0 = this.o;
        }
        return c(singleWebsiteSettings);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.j;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
        e();
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
        if (this.m) {
            PageInfoController pageInfoController = (PageInfoController) this.h;
            pageInfoController.r.a.clear();
            long j = pageInfoController.j;
            if (j != 0) {
                N.MDd48bYq(j, pageInfoController);
            }
        }
        this.m = false;
    }
}
