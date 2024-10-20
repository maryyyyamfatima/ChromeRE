package org.chromium.components.browser_ui.sms;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.android.chrome.R;
import defpackage.C11939yv1;
import defpackage.EI2;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebOTPServiceInfoBar extends ConfirmInfoBar {
    public final String s;
    public final WindowAndroid t;
    public Long u;

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC2006Pl1
    public final int a() {
        return 1;
    }

    public static WebOTPServiceInfoBar create(WindowAndroid windowAndroid, int i, String str, String str2, String str3) {
        return new WebOTPServiceInfoBar(windowAndroid, i, str, str2, str3);
    }

    public WebOTPServiceInfoBar(WindowAndroid windowAndroid, int i, String str, String str2, String str3) {
        super(i, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, str, null, str3, null);
        this.s = str2;
        this.t = windowAndroid;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        EI2.h(0, 2, "Blink.Sms.Receive.Infobar");
        Activity activity = (Activity) this.t.k().get();
        if (activity != null) {
            View currentFocus = activity.getCurrentFocus();
            C11939yv1 c11939yv1 = C11939yv1.g;
            if (currentFocus != null && c11939yv1.f(activity, currentFocus)) {
                c11939yv1.d(currentFocus);
                EI2.h(1, 2, "Blink.Sms.Receive.Infobar");
                this.u = Long.valueOf(SystemClock.uptimeMillis());
            }
        }
        viewOnClickListenerC1876Ol1.getContext();
        viewOnClickListenerC1876Ol1.a().a(0, this.s);
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void i() {
        super.i();
        if (this.u != null) {
            EI2.k(SystemClock.uptimeMillis() - this.u.longValue(), "Blink.Sms.Receive.TimeCancelOnKeyboardDismissal");
        }
    }
}
