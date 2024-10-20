package org.chromium.chrome.browser.infobar;

import android.graphics.Bitmap;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.components.infobars.ConfirmInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class KnownInterceptionDisclosureInfoBar extends ConfirmInfoBar {
    public final String s;

    public static ConfirmInfoBar create(int i, Bitmap bitmap, String str, String str2, String str3, String str4) {
        return new KnownInterceptionDisclosureInfoBar(i, bitmap, str, str2, str3, str4);
    }

    public KnownInterceptionDisclosureInfoBar(int i, Bitmap bitmap, String str, String str2, String str3, String str4) {
        super(i, 0, bitmap, str, str2, str3, "");
        this.s = str4;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        viewOnClickListenerC1876Ol1.n.a(0, this.s);
    }
}
