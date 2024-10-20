package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.StrictMode;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class L53 {
    public static void a(AbstractC0123Ay2 abstractC0123Ay2, int i) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            abstractC0123Ay2.L0(i);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static Drawable c(Context context, int i) {
        return b(i, R.color.f17870_resource_name_obfuscated_res_0x7f07012b, context);
    }

    public static Drawable b(int i, int i2, Context context) {
        Drawable a = AbstractC2884Wf.a(context, i);
        a.setColorFilter(Y50.b(context, i2).getDefaultColor(), PorterDuff.Mode.SRC_IN);
        return a;
    }
}
