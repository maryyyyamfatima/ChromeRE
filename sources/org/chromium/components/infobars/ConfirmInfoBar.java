package org.chromium.components.infobars;

import android.graphics.Bitmap;
import defpackage.ViewOnClickListenerC1876Ol1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ConfirmInfoBar extends InfoBar {
    public final String p;
    public final String q;
    public final String r;

    public ConfirmInfoBar(int i, int i2, Bitmap bitmap, String str, String str2, String str3, String str4) {
        super(i, i2, str, bitmap);
        this.p = str3;
        this.q = str4;
        this.r = str2;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        u(viewOnClickListenerC1876Ol1, this.p, this.q);
        String str = this.r;
        if (str == null || str.isEmpty()) {
            return;
        }
        viewOnClickListenerC1876Ol1.u = str;
        viewOnClickListenerC1876Ol1.q.setText(viewOnClickListenerC1876Ol1.g());
    }

    public void u(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1, String str, String str2) {
        viewOnClickListenerC1876Ol1.i(str, str2);
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public void d(boolean z) {
        r(z ? 1 : 2);
    }

    public static ConfirmInfoBar create(int i, Bitmap bitmap, String str, String str2, String str3, String str4) {
        return new ConfirmInfoBar(i, 0, bitmap, str, str2, str3, str4);
    }
}
