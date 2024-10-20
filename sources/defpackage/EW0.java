package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EW0 {
    public int a;
    public MW0 b;
    public boolean c;

    public EW0(Context context, JW0 jw0) {
        Context applicationContext = context.getApplicationContext();
        V60.c(applicationContext, new DW0(), new IntentFilter("com.google.android.apps.now.account_update_broadcast"), "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
        MW0 mw0 = new MW0(applicationContext, new CW0(this), jw0);
        this.b = mw0;
        mw0.a();
        BW0 bw0 = new BW0(this, jw0);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(bw0, intentFilter);
    }
}
