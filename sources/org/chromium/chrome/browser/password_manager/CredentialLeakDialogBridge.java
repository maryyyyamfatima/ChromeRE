package org.chromium.chrome.browser.password_manager;

import J.N;
import android.R;
import android.app.Activity;
import defpackage.AbstractC0193Bm2;
import defpackage.C5019em2;
import defpackage.C5707gm2;
import defpackage.DC;
import defpackage.ViewOnLayoutChangeListenerC6737jm2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_manager.CredentialLeakDialogBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialLeakDialogBridge {
    public long a;
    public final C5707gm2 b;
    public final WindowAndroid c;

    public CredentialLeakDialogBridge(long j, WindowAndroid windowAndroid) {
        this.a = j;
        this.c = windowAndroid;
        this.b = new C5707gm2(windowAndroid.s(), ((Activity) windowAndroid.k().get()).findViewById(R.id.content), DC.u(windowAndroid));
    }

    public static CredentialLeakDialogBridge create(WindowAndroid windowAndroid, long j) {
        return new CredentialLeakDialogBridge(j, windowAndroid);
    }

    public void showDialog(String str, String str2, boolean z, String str3, String str4) {
        int i;
        Activity activity = (Activity) this.c.k().get();
        if (activity == null) {
            return;
        }
        if (z) {
            i = com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0903fd;
        } else {
            i = AbstractC0193Bm2.l() ? com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0903fa : com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0903fe;
        }
        C5019em2 c5019em2 = new C5019em2(str, str2, i, str3, z ? com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0901c6 : 0, str4, new Callback() { // from class: nb0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                CredentialLeakDialogBridge credentialLeakDialogBridge = CredentialLeakDialogBridge.this;
                long j = credentialLeakDialogBridge.a;
                if (j == 0) {
                    return;
                }
                if (intValue == 1) {
                    N.Mmumo5h_(j, credentialLeakDialogBridge);
                } else if (intValue == 2) {
                    N.M2h75In5(j, credentialLeakDialogBridge);
                } else {
                    N.MEu0f3Ks(j, credentialLeakDialogBridge);
                }
            }
        });
        c5019em2.h = str4 != null;
        c5019em2.i = new Runnable() { // from class: mb0
            @Override // java.lang.Runnable
            public final void run() {
                Tab v;
                WindowAndroid windowAndroid = CredentialLeakDialogBridge.this.c;
                Activity activity2 = (Activity) windowAndroid.k().get();
                if (activity2 == null || (v = C0649Ez3.v(windowAndroid)) == null) {
                    return;
                }
                C12008z71.a().d(activity2, activity2.getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f1404ed), null, Profile.b(v.b()));
            }
        };
        C5707gm2 c5707gm2 = this.b;
        c5707gm2.a(activity, c5019em2);
        c5707gm2.b();
    }

    public final void destroy() {
        this.a = 0L;
        ViewOnLayoutChangeListenerC6737jm2 viewOnLayoutChangeListenerC6737jm2 = this.b.a;
        viewOnLayoutChangeListenerC6737jm2.a.c(4, viewOnLayoutChangeListenerC6737jm2.j);
        viewOnLayoutChangeListenerC6737jm2.g.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC6737jm2);
    }
}
