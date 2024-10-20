package org.chromium.chrome.browser.infobar;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import defpackage.C11997z52;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.SafetyTipInfoBar;
import org.chromium.components.infobars.ConfirmInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafetyTipInfoBar extends ConfirmInfoBar {
    public final String s;
    public final String t;

    public static ConfirmInfoBar create(int i, Bitmap bitmap, String str, String str2, String str3, String str4, String str5) {
        return new SafetyTipInfoBar(i, bitmap, str, str2, str3, str4, str5);
    }

    public SafetyTipInfoBar(int i, Bitmap bitmap, String str, String str2, String str3, String str4, String str5) {
        super(i, 0, bitmap, str, null, str3, str4);
        this.s = str5;
        this.t = str2;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        String str = this.t;
        if (str != null && !str.isEmpty()) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new C11997z52(viewOnClickListenerC1876Ol1.getContext(), new Callback() { // from class: QU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SafetyTipInfoBar.this.e();
                }
            }), 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableString);
        }
        viewOnClickListenerC1876Ol1.n.a(0, spannableStringBuilder);
    }
}
