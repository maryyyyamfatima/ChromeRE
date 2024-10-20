package org.chromium.chrome.browser.download;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC6091ht0;
import defpackage.BD2;
import defpackage.C1326Kf0;
import defpackage.EI2;
import defpackage.GP2;
import defpackage.InterfaceC3562aY1;
import defpackage.PD2;
import defpackage.ZX1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DangerousDownloadDialogBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DangerousDownloadDialogBridge {
    public long a;

    public DangerousDownloadDialogBridge(long j) {
        this.a = j;
    }

    public static DangerousDownloadDialogBridge create(long j) {
        return new DangerousDownloadDialogBridge(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Lf0] */
    public void showDialog(WindowAndroid windowAndroid, final String str, String str2, long j, int i) {
        String string;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity != 0) {
            ZX1 N = ((InterfaceC3562aY1) activity).N();
            ?? r1 = new Callback() { // from class: Lf0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    DangerousDownloadDialogBridge dangerousDownloadDialogBridge = DangerousDownloadDialogBridge.this;
                    dangerousDownloadDialogBridge.getClass();
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    String str3 = str;
                    if (booleanValue) {
                        N.MlxOExzQ(dangerousDownloadDialogBridge.a, str3);
                    } else {
                        N.MQlyjW3H(dangerousDownloadDialogBridge.a, str3);
                    }
                }
            };
            if (j > 0) {
                string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403e0, str2);
            } else {
                string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403e1, str2, AbstractC6091ht0.b(j, activity));
            }
            BD2 bd2 = new BD2(AbstractC4249cY1.B);
            bd2.e(AbstractC4249cY1.a, new C1326Kf0(r1, N));
            bd2.e(AbstractC4249cY1.c, activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403e2));
            bd2.e(AbstractC4249cY1.f, string);
            bd2.e(AbstractC4249cY1.j, activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403df));
            bd2.e(AbstractC4249cY1.n, activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4));
            PD2 pd2 = AbstractC4249cY1.e;
            Resources resources = activity.getResources();
            Resources.Theme theme = activity.getTheme();
            ThreadLocal threadLocal = GP2.a;
            bd2.e(pd2, resources.getDrawable(i, theme));
            bd2.c(AbstractC4249cY1.v, 0);
            N.l(bd2.a(), 0, false);
            EI2.h(0, 4, "Download.DangerousDialog.Events");
            return;
        }
        N.MQlyjW3H(this.a, str);
    }

    public final void destroy() {
        this.a = 0L;
    }
}
