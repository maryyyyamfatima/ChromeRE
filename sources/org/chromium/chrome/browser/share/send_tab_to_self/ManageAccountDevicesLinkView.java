package org.chromium.chrome.browser.share.send_tab_to_self;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C1202Jg1;
import defpackage.C8765pg3;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.share.send_tab_to_self.ManageAccountDevicesLinkView;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManageAccountDevicesLinkView extends FrameLayout {
    public static final /* synthetic */ int a = 0;

    public ManageAccountDevicesLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        a();
    }

    public final void a() {
        if (getVisibility() == 0 && getChildCount() <= 0) {
            LayoutInflater.from(getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e026b, this);
            C1202Jg1 a2 = C1202Jg1.a();
            Profile d = Profile.d();
            a2.getClass();
            IdentityManager b = C1202Jg1.b(d);
            AccountInfo accountInfo = (AccountInfo) N.MAwvRw4K(b.a, b.b(0).getEmail());
            if (accountInfo.f != null) {
                RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) findViewById(R.id.account_avatar);
                int round = Math.round(getResources().getDisplayMetrics().density * 24.0f);
                roundedCornerImageView.setImageBitmap(Bitmap.createScaledBitmap(accountInfo.f, round, round, false));
                int i = round / 2;
                roundedCornerImageView.c(i, i, i, i);
            }
            SpannableString a3 = AbstractC9108qg3.a(getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1409f3, accountInfo.getEmail()), new C8765pg3(new C11997z52(getContext(), new Callback() { // from class: HK1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i2 = ManageAccountDevicesLinkView.a;
                    ManageAccountDevicesLinkView manageAccountDevicesLinkView = ManageAccountDevicesLinkView.this;
                    manageAccountDevicesLinkView.getClass();
                    Intent putExtra = new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse("https://myaccount.google.com/device-activity?utm_source=chrome")).setClass(manageAccountDevicesLinkView.getContext(), ChromeLauncherActivity.class).addFlags(268435456).putExtra("com.android.browser.application_id", manageAccountDevicesLinkView.getContext().getPackageName()).putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
                    AbstractC2281Ro1.a(putExtra);
                    manageAccountDevicesLinkView.getContext().startActivity(putExtra);
                }
            }), "<link>", "</link>"));
            TextView textView = (TextView) findViewById(R.id.manage_devices_link);
            textView.setText(a3);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
