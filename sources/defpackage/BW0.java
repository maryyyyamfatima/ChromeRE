package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BW0 extends BroadcastReceiver {
    public final /* synthetic */ JW0 a;
    public final /* synthetic */ EW0 b;

    public BW0(EW0 ew0, JW0 jw0) {
        this.b = ew0;
        this.a = jw0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data != null && "com.google.android.googlequicksearchbox".equals(data.getEncodedSchemeSpecificPart())) {
            Context applicationContext = context.getApplicationContext();
            NW0.c(applicationContext).f(null);
            EW0 ew0 = this.b;
            ew0.b = null;
            MW0 mw0 = new MW0(applicationContext, new CW0(ew0), this.a);
            ew0.b = mw0;
            mw0.a();
        }
    }
}
