package org.chromium.chrome.browser.firstrun;

import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.HD3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabbedModeFirstRunActivity extends FirstRunActivity {
    @Override // org.chromium.chrome.browser.firstrun.FirstRunActivity, defpackage.InterfaceC8328oP0
    public final boolean h() {
        return false;
    }

    @Override // org.chromium.chrome.browser.firstrun.FirstRunActivity
    public final View W0() {
        View W0 = super.W0();
        HD3 hd3 = new HD3(this);
        hd3.addView(W0);
        hd3.setBackgroundResource(R.drawable.0_resource_name_obfuscated_res_0x7f0900af);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(hd3, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setBackgroundResource(R.color.0_resource_name_obfuscated_res_0x7f070796);
        return frameLayout;
    }
}
