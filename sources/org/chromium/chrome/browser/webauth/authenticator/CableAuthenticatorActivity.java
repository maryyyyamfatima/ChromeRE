package org.chromium.chrome.browser.webauth.authenticator;

import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.C10547us;
import defpackage.C7629mN;
import defpackage.LM;
import org.chromium.chrome.browser.webauthn.CableAuthenticatorModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CableAuthenticatorActivity extends LM {
    public static final /* synthetic */ int B = 0;

    @Override // defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTitle(getResources().getString(R.string.f69810_resource_name_obfuscated_res_0x7f1402dd));
        C7629mN.a().d(false);
        super.onCreate(bundle);
        onNewIntent(getIntent());
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bundle bundleExtra;
        super.onNewIntent(intent);
        if (intent.getAction() != null && intent.getAction().equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
            UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            bundleExtra = new Bundle();
            bundleExtra.putParcelable("accessory", usbAccessory);
        } else if (intent.getAction() != null && intent.getAction().equals("android.intent.action.VIEW") && intent.getData() != null) {
            bundleExtra = new Bundle();
            bundleExtra.putParcelable("org.chromium.chrome.browser.webauth.authenticator.QR", intent.getData());
        } else if (intent.hasExtra("org.chromium.chrome.browser.webauth.authenticator.ServerLink")) {
            String stringExtra = intent.getStringExtra("org.chromium.chrome.browser.webauth.authenticator.ServerLink");
            bundleExtra = new Bundle();
            try {
                bundleExtra.putByteArray("org.chromium.chrome.browser.webauth.authenticator.ServerLink", Base64.decode(stringExtra, 0));
            } catch (IllegalArgumentException unused) {
                AbstractC4851eH1.d("CableAuthenticatorActivity", "Invalid base64 in ServerLink argument", new Object[0]);
                return;
            }
        } else {
            bundleExtra = intent.getBundleExtra("show_fragment_args");
        }
        CableAuthenticatorModuleProvider cableAuthenticatorModuleProvider = new CableAuthenticatorModuleProvider();
        cableAuthenticatorModuleProvider.E0(bundleExtra);
        h h0 = h0();
        h0.getClass();
        C10547us c10547us = new C10547us(h0);
        c10547us.j(android.R.id.content, cableAuthenticatorModuleProvider, null);
        c10547us.e(false);
    }
}
