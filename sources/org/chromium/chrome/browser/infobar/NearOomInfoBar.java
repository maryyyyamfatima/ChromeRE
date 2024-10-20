package org.chromium.chrome.browser.infobar;

import com.android.chrome.R;
import defpackage.C7074kl1;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.NearOomInfoBar;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NearOomInfoBar extends InfoBar {
    public NearOomInfoBar() {
        super(R.drawable.f50860_resource_name_obfuscated_res_0x7f09035a, R.color.f22500_resource_name_obfuscated_res_0x7f0705af, null, null);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        C7074kl1 c7074kl1 = new C7074kl1(viewOnClickListenerC7418ll1);
        c7074kl1.b = viewOnClickListenerC7418ll1.getResources().getString(R.string.f78100_resource_name_obfuscated_res_0x7f1406bf);
        c7074kl1.b(viewOnClickListenerC7418ll1.getResources().getString(R.string.f78090_resource_name_obfuscated_res_0x7f1406be), new Callback() { // from class: k22
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                NearOomInfoBar.this.e();
            }
        });
        c7074kl1.a();
    }

    public static NearOomInfoBar create() {
        return new NearOomInfoBar();
    }
}
