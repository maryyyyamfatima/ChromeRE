package org.chromium.chrome.browser.share.qrcode;

import J.N;
import android.graphics.Bitmap;
import com.android.chrome.R;
import defpackage.AbstractC5879hG2;
import defpackage.C3817bG2;
import defpackage.C4504dG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class QRCodeGenerationRequest {
    public long a;
    public C3817bG2 b;

    public QRCodeGenerationRequest(String str, C3817bG2 c3817bG2) {
        this.b = c3817bG2;
        this.a = N.Ms6T0$zG(this, str);
    }

    public final void onQRCodeAvailable(Bitmap bitmap) {
        C3817bG2 c3817bG2 = this.b;
        if (c3817bG2 != null) {
            C4504dG2 c4504dG2 = c3817bG2.b;
            if (bitmap != null) {
                c4504dG2.b.o(AbstractC5879hG2.a, bitmap);
            } else {
                String str = c3817bG2.a;
                c4504dG2.b.o(AbstractC5879hG2.b, (str == null || str.length() <= 122) ? c4504dG2.a.getResources().getString(R.string.f83880_resource_name_obfuscated_res_0x7f140915) : c4504dG2.a.getResources().getString(R.string.f83870_resource_name_obfuscated_res_0x7f140914, 122));
            }
            this.b = null;
        }
        long j = this.a;
        if (j != 0) {
            N.MQBcgs6S(j);
            this.a = 0L;
        }
    }
}
