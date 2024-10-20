package org.chromium.chrome.browser.infobar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.android.chrome.R;
import defpackage.AbstractC3307Zl2;
import defpackage.C1097Il1;
import defpackage.C1227Jl1;
import defpackage.C1357Kl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;
import org.chromium.components.signin.base.AccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UpdatePasswordInfoBar extends ConfirmInfoBar {
    public final String[] s;
    public final int t;
    public final String u;
    public final AccountInfo v;
    public Spinner w;

    public static InfoBar show(int i, String[] strArr, int i2, String str, String str2, String str3, AccountInfo accountInfo) {
        return new UpdatePasswordInfoBar(i, strArr, i2, str, str2, str3, accountInfo);
    }

    public UpdatePasswordInfoBar(int i, String[] strArr, int i2, String str, String str2, String str3, AccountInfo accountInfo) {
        super(i, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, str, null, str3, null);
        this.u = str2;
        this.s = strArr;
        this.t = i2;
        this.v = accountInfo;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        Bitmap bitmap;
        super.m(viewOnClickListenerC1876Ol1);
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        String[] strArr = this.s;
        if (strArr.length > 1) {
            C1227Jl1 c1227Jl1 = new C1227Jl1(this.l, strArr);
            Spinner spinner = (Spinner) C1357Kl1.d(R.layout.0_resource_name_obfuscated_res_0x7f0e0138, a.getContext(), a);
            spinner.setAdapter((SpinnerAdapter) c1227Jl1);
            a.addView(spinner, new C1097Il1());
            spinner.setId(R.id.password_infobar_accounts_spinner);
            this.w = spinner;
            spinner.setSelection(this.t);
        } else {
            a.a(0, strArr[0]);
        }
        String str = this.u;
        if (!TextUtils.isEmpty(str)) {
            viewOnClickListenerC1876Ol1.a().a(0, str);
        }
        AccountInfo accountInfo = this.v;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.getEmail()) || (bitmap = accountInfo.f) == null) {
            return;
        }
        viewOnClickListenerC1876Ol1.p = AbstractC3307Zl2.a(viewOnClickListenerC1876Ol1.getContext(), bitmap, accountInfo.getEmail());
    }

    public final int getSelectedUsername() {
        if (this.s.length == 1) {
            return 0;
        }
        return this.w.getSelectedItemPosition();
    }
}
