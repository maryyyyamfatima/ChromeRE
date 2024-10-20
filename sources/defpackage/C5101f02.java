package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f02 */
/* loaded from: classes.dex */
public final class C5101f02 implements InterfaceC0259Bz3 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ C6475j02 g;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C5101f02(C6475j02 c6475j02, Context context) {
        this.g = c6475j02;
        this.a = context;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        boolean isIncognito = tabModel.isIncognito();
        C6475j02 c6475j02 = this.g;
        Paint paint = c6475j02.f;
        Context context = this.a;
        paint.setColor(AbstractC5521gD3.b(context, isIncognito, false));
        c6475j02.i.setColor(AbstractC5521gD3.f(context, isIncognito, false));
        c6475j02.g.setColor(isIncognito ? context.getColor(R.color.0_resource_name_obfuscated_res_0x7f07089e) : AbstractC10957w33.f(context));
        c6475j02.j.setColor(context.getColor(isIncognito ? R.color.0_resource_name_obfuscated_res_0x7f070196 : R.color.0_resource_name_obfuscated_res_0x7f070195));
        c6475j02.k.setColor(AbstractC5521gD3.b(context, isIncognito, true));
        c6475j02.l.setColor(AbstractC5521gD3.f(context, isIncognito, true));
    }
}
