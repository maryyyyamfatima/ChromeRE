package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LT1 extends Fl4 {
    public GURL g;
    public final /* synthetic */ OT1 h;

    @Override // defpackage.Fl4
    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        final GURL gurl;
        Drawable e;
        final OT1 ot1 = this.h;
        ot1.c.getClass();
        FI2.a("MerchantTrust.BottomSheet.NavigateLink");
        if (navigationHandle.c || (gurl = navigationHandle.e) == null || gurl.equals(this.g)) {
            return;
        }
        this.g = gurl;
        Profile profile = (Profile) ((C8385oa2) ot1.g).g;
        boolean z = true;
        if ((N.MnXKAgH9(gurl.i(), true) || N.Mn0fHwI$(gurl.i())) || profile == null) {
            PropertyModel propertyModel = ot1.h;
            PD2 pd2 = AbstractC5512gC.j;
            if (!N.MnXKAgH9(gurl.i(), true) && !N.Mn0fHwI$(gurl.i())) {
                z = false;
            }
            Context context = ot1.a;
            if (z) {
                e = AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f09024f);
            } else {
                e = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090212, R.color.0_resource_name_obfuscated_res_0x7f07012b, context);
            }
            propertyModel.o(pd2, e);
            return;
        }
        FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: KT1
            @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
            public final void onFaviconAvailable(Bitmap bitmap, GURL gurl2) {
                Object e2;
                OT1 ot12 = OT1.this;
                if (bitmap != null) {
                    e2 = AbstractC4855eI0.b(ot12.a.getResources(), bitmap);
                } else {
                    ot12.getClass();
                    GURL gurl3 = gurl;
                    boolean z2 = true;
                    if (!N.MnXKAgH9(gurl3.i(), true) && !N.Mn0fHwI$(gurl3.i())) {
                        z2 = false;
                    }
                    Context context2 = ot12.a;
                    if (z2) {
                        e2 = AbstractC2884Wf.a(context2, R.drawable.0_resource_name_obfuscated_res_0x7f09024f);
                    } else {
                        e2 = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090212, R.color.0_resource_name_obfuscated_res_0x7f07012b, context2);
                    }
                }
                ot12.h.o(AbstractC5512gC.j, e2);
            }
        };
        WH0 wh0 = ot1.e;
        wh0.getClass();
        wh0.a(profile, gurl.i(), ot1.f, faviconHelper$FaviconImageCallback);
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationNoop(NavigationHandle navigationHandle) {
        this.h.c.getClass();
        FI2.a("MerchantTrust.BottomSheet.NavigateLink");
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.Fl4
    public final void loadProgressChanged(float f) {
        PropertyModel propertyModel = this.h.h;
        if (propertyModel != null) {
            propertyModel.l(AbstractC5512gC.c, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LT1(OT1 ot1, WebContents webContents) {
        super(webContents);
        this.h = ot1;
    }

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        boolean z = true;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            z = N.M6bsIDpc("CommerceMerchantViewer", "trust_signals_sheet_use_page_title", true);
        }
        if (z) {
            this.h.h.o(AbstractC5512gC.b, str);
        }
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.a && navigationHandle.g) {
            this.h.h.o(AbstractC5512gC.a, ((WebContents) this.a.get()).u());
        }
    }
}
