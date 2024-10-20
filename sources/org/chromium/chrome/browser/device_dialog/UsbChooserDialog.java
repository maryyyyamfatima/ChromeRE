package org.chromium.chrome.browser.device_dialog;

import J.N;
import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractC11140wc2;
import defpackage.AbstractC3899bX;
import defpackage.AbstractC9108qg3;
import defpackage.C11055wM;
import defpackage.C11578xs1;
import defpackage.C11997z52;
import defpackage.C12264zs1;
import defpackage.C1745Nl0;
import defpackage.C1875Ol0;
import defpackage.C8765pg3;
import defpackage.InterfaceC11921ys1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.device_dialog.UsbChooserDialog;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UsbChooserDialog implements InterfaceC11921ys1 {
    public C12264zs1 a;
    public long b;

    public UsbChooserDialog(Profile profile, long j) {
        this.b = j;
    }

    @Override // defpackage.InterfaceC11921ys1
    public final void a(String str) {
        if (this.b != 0) {
            if (!str.isEmpty()) {
                N.M8m3iwzV(this.b, str);
            } else {
                N.MyQOumx4(this.b);
            }
        }
    }

    public static UsbChooserDialog create(WindowAndroid windowAndroid, String str, int i, Profile profile, long j) {
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            return null;
        }
        UsbChooserDialog usbChooserDialog = new UsbChooserDialog(profile, j);
        SpannableString spannableString = new SpannableString(str);
        boolean z = !AbstractC3899bX.e(activity);
        C11055wM c11055wM = new C11055wM(profile);
        AbstractC11140wc2.a(spannableString, activity, c11055wM, i, false, z, true);
        c11055wM.a();
        SpannableString spannableString2 = new SpannableString(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b89, str));
        TextUtils.copySpansFrom(spannableString, 0, spannableString.length(), Object.class, spannableString2, spannableString2.toString().indexOf(str));
        String string = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b88);
        SpannableString a = AbstractC9108qg3.a(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b87), new C8765pg3(new C11997z52(activity, new Callback() { // from class: x44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                View view = (View) obj;
                long j2 = UsbChooserDialog.this.b;
                if (j2 == 0) {
                    return;
                }
                N.M0RyTBvz(j2);
                view.invalidate();
            }
        }), "<link>", "</link>"));
        usbChooserDialog.a = new C12264zs1(activity, activity.getWindow(), usbChooserDialog, new C11578xs1(spannableString2, "", string, a, a, a, activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b86)));
        return usbChooserDialog;
    }

    public final void setIdleState() {
        C12264zs1 c12264zs1 = this.a;
        c12264zs1.f.setVisibility(8);
        c12264zs1.b(3);
    }

    public void addDevice(String str, String str2) {
        C12264zs1 c12264zs1 = this.a;
        c12264zs1.f.setVisibility(8);
        c12264zs1.k.a(null, str, str2, null);
        c12264zs1.b(2);
    }

    public final void removeDevice(String str) {
        C12264zs1 c12264zs1 = this.a;
        C1745Nl0 c1745Nl0 = c12264zs1.k;
        C1875Ol0 c1875Ol0 = (C1875Ol0) c1745Nl0.l.remove(str);
        if (c1875Ol0 != null) {
            int position = c1745Nl0.getPosition(c1875Ol0);
            int i = c1745Nl0.j;
            if (position == i) {
                c1745Nl0.d(-1);
            } else if (position < i) {
                c1745Nl0.j = i - 1;
            }
            c1745Nl0.c(c1875Ol0.b);
            c1745Nl0.remove(c1875Ol0);
        }
        c12264zs1.b(3);
    }

    public final void closeDialog() {
        this.b = 0L;
        this.a.c.dismiss();
    }
}
