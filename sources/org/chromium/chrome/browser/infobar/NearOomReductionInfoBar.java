package org.chromium.chrome.browser.infobar;

import com.android.chrome.R;
import defpackage.C7074kl1;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.NearOomReductionInfoBar;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NearOomReductionInfoBar extends InfoBar {
    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return true;
    }

    public NearOomReductionInfoBar() {
        super(R.drawable.f50860_resource_name_obfuscated_res_0x7f09035a, R.color.f22500_resource_name_obfuscated_res_0x7f0705af, null, null);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        C7074kl1 c7074kl1 = new C7074kl1(viewOnClickListenerC7418ll1);
        c7074kl1.b = viewOnClickListenerC7418ll1.getResources().getString(R.string.f78120_resource_name_obfuscated_res_0x7f1406c1);
        c7074kl1.b(viewOnClickListenerC7418ll1.getResources().getString(R.string.f78110_resource_name_obfuscated_res_0x7f1406c0), new Callback() { // from class: l22
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                NearOomReductionInfoBar.this.e();
            }
        });
        c7074kl1.a();
    }

    public static NearOomReductionInfoBar create() {
        return new NearOomReductionInfoBar();
    }
}
