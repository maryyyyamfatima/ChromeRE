package defpackage;

import android.os.Bundle;
import android.os.Process;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CW0 implements Callback {
    public final /* synthetic */ EW0 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public CW0(EW0 ew0) {
        this.a = ew0;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        MW0 mw0;
        boolean z = ((Bundle) obj).getBoolean("ssb_service:ssb_broadcasts_account_change_to_chrome");
        EW0 ew0 = this.a;
        if (z) {
            if ((AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS") == 0) && (mw0 = ew0.b) != null) {
                if (mw0.g != null) {
                    mw0.e.unbindService(mw0.c);
                    mw0.g = null;
                    mw0.b.removeCallbacksAndMessages(null);
                }
                ew0.b = null;
            }
        }
        if (ew0.c) {
            return;
        }
        EI2.b("Search.GsaBroadcastsAccountChanges", z);
        ew0.c = true;
    }
}
