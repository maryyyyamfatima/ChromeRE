package defpackage;

import android.text.SpannableString;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.infobars.ConfirmInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SX0 extends ConfirmInfoBar {
    public final int s;
    public final int t;
    public final String u;

    public SX0(int i, String str, String str2, int i2, int i3, String str3) {
        super(i, R.color.f22500_resource_name_obfuscated_res_0x7f0705af, null, str, null, str3, null);
        this.u = str2;
        this.s = i2;
        this.t = i3;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        SpannableString spannableString = new SpannableString(this.u);
        spannableString.setSpan(new C11997z52(viewOnClickListenerC1876Ol1.getContext(), new Callback() { // from class: RX0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SX0.this.e();
            }
        }), this.s, this.t, 18);
        a.a(0, spannableString);
    }
}
