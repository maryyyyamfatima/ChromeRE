package org.chromium.components.browser_ui.client_certificate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.security.KeyChain;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.C5490g8;
import defpackage.C7662mT2;
import defpackage.V60;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SSLClientCertificateRequest {
    public static boolean selectClientCertificate(long j, WindowAndroid windowAndroid, String[] strArr, byte[][] bArr, String str, int i) {
        X500Principal[] x500PrincipalArr;
        Object obj = ThreadUtils.a;
        Context context = (Context) windowAndroid.j.get();
        Activity a = V60.a(context);
        if (a == null) {
            AbstractC4851eH1.f("SSLClientCertRequest", "Certificate request on GC'd activity.", new Object[0]);
            return false;
        }
        if (bArr.length > 0) {
            x500PrincipalArr = new X500Principal[bArr.length];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                try {
                    x500PrincipalArr[i2] = new X500Principal(bArr[i2]);
                } catch (Exception e) {
                    AbstractC4851eH1.f("SSLClientCertRequest", "Exception while decoding issuers list: " + e, new Object[0]);
                    return false;
                }
            }
        } else {
            x500PrincipalArr = null;
        }
        C7662mT2 c7662mT2 = new C7662mT2(a.getApplicationContext(), j);
        try {
            KeyChain.choosePrivateKeyAlias(a, c7662mT2, strArr, x500PrincipalArr, str, i, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            c7662mT2.alias(null);
            C5490g8 c5490g8 = new C5490g8(context, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
            c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f14035f);
            c5490g8.b(R.string.0_resource_name_obfuscated_res_0x7f14035e);
            c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140362, new DialogInterface.OnClickListener() { // from class: jT2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                }
            });
            c5490g8.k();
            return true;
        }
    }
}
