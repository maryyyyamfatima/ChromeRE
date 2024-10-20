package defpackage;

import android.view.View;
import com.android.chrome.R;
import java.util.List;
import org.chromium.components.page_info.PageInfoAdPersonalizationPreference;
import org.chromium.components.page_info.PageInfoRowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11164wg2 extends AbstractC11513xh2 {
    public static final int m = View.generateViewId();
    public final InterfaceC10141th2 h;
    public final PageInfoRowView i;
    public PageInfoAdPersonalizationPreference j;
    public boolean k;
    public List l;

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
    }

    public C11164wg2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, WO wo) {
        super(wo);
        this.h = interfaceC10141th2;
        this.i = pageInfoRowView;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.i.getContext().getResources().getString(R.string.f79370_resource_name_obfuscated_res_0x7f140747);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        PageInfoAdPersonalizationPreference pageInfoAdPersonalizationPreference = new PageInfoAdPersonalizationPreference();
        this.j = pageInfoAdPersonalizationPreference;
        C11507xg2 c11507xg2 = new C11507xg2();
        c11507xg2.a = this.k;
        c11507xg2.b = this.l;
        c11507xg2.c = new RunnableC10478ug2(this);
        pageInfoAdPersonalizationPreference.k0 = c11507xg2;
        pageInfoAdPersonalizationPreference.R0();
        return c(this.j);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
        e();
        this.j = null;
    }
}
