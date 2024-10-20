package defpackage;

import J.N;
import android.content.Context;
import android.text.SpannableString;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hL1 */
/* loaded from: classes.dex */
public final class C5903hL1 {
    public final C7857n12 a;
    public final PropertyModel b;

    public C5903hL1(C7857n12 c7857n12, Profile profile) {
        this.a = c7857n12;
        HashMap e = PropertyModel.e(AbstractC6589jL1.d);
        LD2 ld2 = AbstractC6589jL1.b;
        boolean MmSLoR8I = N.MmSLoR8I(profile);
        AD2 ad2 = new AD2();
        ad2.a = MmSLoR8I;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC6589jL1.a;
        String MHqe3vV3 = profile != null ? N.MHqe3vV3(profile) : "";
        GD2 gd2 = new GD2();
        gd2.a = MHqe3vV3;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC6589jL1.c;
        Context a = c7857n12.a();
        SpannableString a2 = AbstractC9108qg3.a(a.getString(R.string.0_resource_name_obfuscated_res_0x7f1405f9), new C8765pg3(new C11997z52(a, new Callback() { // from class: gL1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C5903hL1 c5903hL1 = C5903hL1.this;
                c5903hL1.getClass();
                c5903hL1.a.b(new LoadUrlParams("https://support.google.com/chrome/?p=is_chrome_managed", 0), false);
            }
        }), "<LINK>", "</LINK>"));
        GD2 gd22 = new GD2();
        gd22.a = a2;
        this.b = AbstractC5266fV2.a(e, pd22, gd22, e);
    }
}
