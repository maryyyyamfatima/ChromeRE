package org.chromium.chrome.browser.safe_browsing;

import J.N;
import android.R;
import android.app.Activity;
import android.content.Context;
import defpackage.C5019em2;
import defpackage.C5707gm2;
import defpackage.DC;
import defpackage.ViewOnLayoutChangeListenerC6737jm2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.safe_browsing.SafeBrowsingPasswordReuseDialogBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafeBrowsingPasswordReuseDialogBridge {
    public long a;
    public final C5707gm2 b;
    public final WindowAndroid c;

    public SafeBrowsingPasswordReuseDialogBridge(long j, WindowAndroid windowAndroid) {
        this.a = j;
        this.c = windowAndroid;
        this.b = new C5707gm2(windowAndroid.s(), ((Activity) windowAndroid.k().get()).findViewById(R.id.content), DC.u(windowAndroid));
    }

    public static SafeBrowsingPasswordReuseDialogBridge create(WindowAndroid windowAndroid, long j) {
        return new SafeBrowsingPasswordReuseDialogBridge(j, windowAndroid);
    }

    public void showDialog(String str, String str2, String str3, String str4) {
        Callback callback;
        WindowAndroid windowAndroid = this.c;
        if (windowAndroid.k().get() == null) {
            return;
        }
        if (str4 != null) {
            callback = new Callback() { // from class: xT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int intValue = ((Integer) obj).intValue();
                    SafeBrowsingPasswordReuseDialogBridge safeBrowsingPasswordReuseDialogBridge = SafeBrowsingPasswordReuseDialogBridge.this;
                    long j = safeBrowsingPasswordReuseDialogBridge.a;
                    if (j == 0) {
                        return;
                    }
                    if (intValue == 1) {
                        N.MgVzN6AS(j, safeBrowsingPasswordReuseDialogBridge);
                    } else if (intValue == 2) {
                        N.MWlqcC9l(j, safeBrowsingPasswordReuseDialogBridge);
                    } else {
                        N.M_X8ygDO(j, safeBrowsingPasswordReuseDialogBridge);
                    }
                }
            };
        } else {
            callback = new Callback() { // from class: yT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ((Integer) obj).intValue();
                    SafeBrowsingPasswordReuseDialogBridge safeBrowsingPasswordReuseDialogBridge = SafeBrowsingPasswordReuseDialogBridge.this;
                    long j = safeBrowsingPasswordReuseDialogBridge.a;
                    if (j == 0) {
                        return;
                    }
                    N.M_X8ygDO(j, safeBrowsingPasswordReuseDialogBridge);
                }
            };
        }
        C5019em2 c5019em2 = new C5019em2(str, str2, com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0903fe, str3, 0, str4, callback);
        c5019em2.h = str4 != null;
        Context context = (Context) windowAndroid.k().get();
        C5707gm2 c5707gm2 = this.b;
        c5707gm2.a(context, c5019em2);
        c5707gm2.b();
    }

    public final void destroy() {
        this.a = 0L;
        ViewOnLayoutChangeListenerC6737jm2 viewOnLayoutChangeListenerC6737jm2 = this.b.a;
        viewOnLayoutChangeListenerC6737jm2.a.c(4, viewOnLayoutChangeListenerC6737jm2.j);
        viewOnLayoutChangeListenerC6737jm2.g.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC6737jm2);
    }
}
