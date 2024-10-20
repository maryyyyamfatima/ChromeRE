package org.chromium.chrome.browser.infobar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC3307Zl2;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;
import org.chromium.components.signin.base.AccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SavePasswordInfoBar extends ConfirmInfoBar {
    public final String s;
    public final AccountInfo t;

    public static InfoBar show(int i, String str, String str2, String str3, String str4, AccountInfo accountInfo) {
        return new SavePasswordInfoBar(i, str, str2, str3, str4, accountInfo);
    }

    public SavePasswordInfoBar(int i, String str, String str2, String str3, String str4, AccountInfo accountInfo) {
        super(i, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, str, null, str3, str4);
        this.s = str2;
        this.t = accountInfo;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        Bitmap bitmap;
        super.m(viewOnClickListenerC1876Ol1);
        String str = this.s;
        if (!TextUtils.isEmpty(str)) {
            viewOnClickListenerC1876Ol1.a().a(0, str);
        }
        AccountInfo accountInfo = this.t;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.getEmail()) || (bitmap = accountInfo.f) == null) {
            return;
        }
        viewOnClickListenerC1876Ol1.p = AbstractC3307Zl2.a(viewOnClickListenerC1876Ol1.getContext(), bitmap, accountInfo.getEmail());
    }
}
