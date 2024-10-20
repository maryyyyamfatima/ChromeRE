package org.chromium.chrome.browser.password_manager;

import J.N;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C0715Fn;
import defpackage.C4115c8;
import defpackage.C5490g8;
import defpackage.DialogC5834h8;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutoSigninFirstRunDialog implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    public long a;
    public DialogC5834h8 g;

    public AutoSigninFirstRunDialog(Activity activity, long j, String str, String str2, int i, int i2, String str3, String str4) {
        this.a = j;
    }

    public static AutoSigninFirstRunDialog createAndShowDialog(WindowAndroid windowAndroid, long j, String str, String str2, int i, int i2, String str3, String str4) {
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            return null;
        }
        AutoSigninFirstRunDialog autoSigninFirstRunDialog = new AutoSigninFirstRunDialog(activity, j, str, str2, i, i2, str3, str4);
        C5490g8 c5490g8 = new C5490g8(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.d = str;
        c5490g8.g(str3, autoSigninFirstRunDialog);
        c4115c8.i = str4;
        c4115c8.j = autoSigninFirstRunDialog;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f55860_resource_name_obfuscated_res_0x7f0e0048, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.summary);
        if (i != i2 && i2 != 0) {
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new C0715Fn(autoSigninFirstRunDialog), i, i2, 18);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView.setText(str2);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        c4115c8.q = inflate;
        DialogC5834h8 a = c5490g8.a();
        autoSigninFirstRunDialog.g = a;
        a.setCanceledOnTouchOutside(false);
        autoSigninFirstRunDialog.g.setOnDismissListener(autoSigninFirstRunDialog);
        autoSigninFirstRunDialog.g.show();
        return autoSigninFirstRunDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            N.MNvg9$ZU(this.a, this);
        } else if (i == -1) {
            N.MV90asHX(this.a, this);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        N.MTjiTA74(this.a, this);
        this.a = 0L;
        this.g = null;
    }

    public final void dismissDialog() {
        this.g.dismiss();
    }
}
