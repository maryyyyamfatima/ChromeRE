package defpackage;

import J.N;
import android.os.Bundle;
import android.text.TextUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappGeolocationBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10862vn1 extends IX3 {
    public final /* synthetic */ InstalledWebappGeolocationBridge a;

    public C10862vn1(InstalledWebappGeolocationBridge installedWebappGeolocationBridge) {
        this.a = installedWebappGeolocationBridge;
    }

    @Override // defpackage.IX3
    public final void a(final String str, final Bundle bundle) {
        PostTask.c(AbstractC5103f04.c, new Runnable() { // from class: un1
            @Override // java.lang.Runnable
            public final void run() {
                C10862vn1 c10862vn1 = C10862vn1.this;
                c10862vn1.getClass();
                String str2 = str;
                boolean equals = TextUtils.equals(str2, "onNewLocationAvailable");
                Bundle bundle2 = bundle;
                InstalledWebappGeolocationBridge installedWebappGeolocationBridge = c10862vn1.a;
                if (equals) {
                    if (bundle2 == null) {
                        installedWebappGeolocationBridge.getClass();
                        return;
                    } else {
                        if (installedWebappGeolocationBridge.a == 0) {
                            return;
                        }
                        N.M5uE1cdn(installedWebappGeolocationBridge.a, bundle2.getDouble("latitude"), bundle2.getDouble("longitude"), bundle2.getLong("timeStamp") / 1000.0d, bundle2.containsKey("altitude"), bundle2.getDouble("altitude"), bundle2.containsKey("accuracy"), bundle2.getDouble("accuracy"), bundle2.containsKey("bearing"), bundle2.getDouble("bearing"), bundle2.containsKey("speed"), bundle2.getDouble("speed"));
                        return;
                    }
                }
                if (TextUtils.equals(str2, "onNewLocationError")) {
                    String string = bundle2 != null ? bundle2.getString("message", "") : "";
                    long j = installedWebappGeolocationBridge.a;
                    if (j == 0) {
                        return;
                    }
                    N.M243l30e(j, string);
                }
            }
        });
    }
}
