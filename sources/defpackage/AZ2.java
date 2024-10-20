package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AZ2 implements InterfaceC0186Bl0, V02, InterfaceC2519Tk {
    public final Context a;
    public final PropertyModel g;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public I5 j;
    public C2649Uk k;

    public AZ2(Context context, PropertyModel propertyModel, ViewGroup viewGroup) {
        this.a = context;
        this.g = propertyModel;
        UD2.a(propertyModel, viewGroup, new CZ2());
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C2649Uk c2649Uk = this.k;
        if (c2649Uk != null) {
            c2649Uk.i.h(c2649Uk);
            c2649Uk.l.d(c2649Uk);
            c2649Uk.m.j(c2649Uk);
            this.k = null;
        }
        I5 i5 = this.j;
        if (i5 != null) {
            i5.c(this);
            this.j = null;
        }
    }

    @Override // defpackage.V02
    public final void U() {
        Context context = this.a;
        C4502dG0 c4502dG0 = C4502dG0.b;
        TemplateUrlService a = IG3.a();
        NW0 c = NW0.c(this.a);
        Q83 q83 = O83.a;
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d = Profile.d();
        a2.getClass();
        this.k = new C2649Uk(context, c4502dG0, a, c, this, q83, C1202Jg1.b(d), AccountManagerFacadeProvider.getInstance());
        b();
    }

    @Override // defpackage.InterfaceC2519Tk
    public final void b() {
        C2649Uk c2649Uk = this.k;
        if (c2649Uk == null) {
            return;
        }
        Drawable a = AbstractC2884Wf.a(c2649Uk.g, c2649Uk.q ? R.drawable.f47220_resource_name_obfuscated_res_0x7f0901de : R.drawable.f45080_resource_name_obfuscated_res_0x7f0900cb);
        PD2 pd2 = BZ2.e;
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, a);
        propertyModel.o(BZ2.f, this.k.q ? null : Y50.b(this.a, AbstractC3494aK3.d(3)));
    }
}
