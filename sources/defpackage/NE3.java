package defpackage;

import android.content.Context;
import com.android.chrome.R;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NE3 extends AbstractC12286zw {
    public final boolean f;
    public C6520j8 g;

    @Override // defpackage.InterfaceC7471lu0
    public final int f() {
        return 4;
    }

    public NE3(Context context, C1245Jp c1245Jp) {
        super(context, c1245Jp, null);
        this.f = DeviceFormFactor.a(context);
    }

    @Override // defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        return this.f && autocompleteMatch.a == 10;
    }

    @Override // defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(PE3.d);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        super.b(i, autocompleteMatch, propertyModel);
        propertyModel.o(PE3.c, this.g);
        propertyModel.o(PE3.b, autocompleteMatch.i);
        C7788mp3 c7788mp3 = new C7788mp3(autocompleteMatch.d);
        AbstractC12286zw.i(c7788mp3, autocompleteMatch.e);
        propertyModel.o(PE3.a, c7788mp3);
        C5382fp3 c = C5382fp3.c(this.a, R.drawable.0_resource_name_obfuscated_res_0x7f090325);
        c.b = true;
        AbstractC12286zw.k(propertyModel, c.a());
        l(i, autocompleteMatch, propertyModel);
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7471lu0
    public final void e() {
        this.g = new C6520j8();
    }
}
