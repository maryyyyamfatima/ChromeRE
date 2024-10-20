package defpackage;

import android.os.Handler;
import com.android.chrome.R;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NT1 extends WebContentsDelegateAndroid {
    public final /* synthetic */ OT1 a;

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        return this.a.d;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void loadingStateChanged(boolean z) {
        OT1 ot1 = this.a;
        WebContents webContents = ot1.i;
        if (webContents != null && webContents.e()) {
            PropertyModel propertyModel = ot1.h;
            if (propertyModel == null) {
                return;
            }
            propertyModel.l(AbstractC5512gC.c, 0.0f);
            ot1.h.k(AbstractC5512gC.d, true);
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: MT1
            @Override // java.lang.Runnable
            public final void run() {
                PropertyModel propertyModel2 = NT1.this.a.h;
                if (propertyModel2 != null) {
                    propertyModel2.k(AbstractC5512gC.d, false);
                }
            }
        }, 50L);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void openNewTab(GURL gurl, String str, ResourceRequestBody resourceRequestBody, int i, boolean z) {
        this.a.a(gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        this.a.a(gurl);
        return false;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void visibleSSLStateChanged() {
        int i;
        OT1 ot1 = this.a;
        if (ot1.h == null) {
            return;
        }
        int a = AbstractC6832k23.a(ot1.i);
        PropertyModel propertyModel = ot1.h;
        ND2 nd2 = AbstractC5512gC.e;
        if (a != 0) {
            if (a == 3 || a == 4) {
                i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f0;
            } else if (a == 5) {
                i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f3;
            } else if (a != 6) {
                i = 0;
            }
            propertyModel.m(nd2, i);
            ot1.h.o(AbstractC5512gC.a, ot1.i.u());
        }
        i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f2;
        propertyModel.m(nd2, i);
        ot1.h.o(AbstractC5512gC.a, ot1.i.u());
    }

    public NT1(OT1 ot1) {
        this.a = ot1;
    }
}
