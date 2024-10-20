package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.util.Log;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MW0 {
    public final Messenger a;
    public final LW0 b;
    public final KW0 c;
    public final JW0 d;
    public final Context e;
    public final Callback f;
    public Messenger g;

    public MW0(Context context, CW0 cw0, JW0 jw0) {
        this.e = context.getApplicationContext();
        this.f = cw0;
        LW0 lw0 = new LW0(this);
        this.b = lw0;
        this.a = new Messenger(lw0);
        this.c = new KW0(this);
        this.d = jw0;
    }

    public final void a() {
        if (this.g != null) {
            Log.e("GSAServiceClient", "Already connected.");
        }
        this.e.bindService(new Intent("com.google.android.ssb.action.SSB_SERVICE").setPackage("com.google.android.googlequicksearchbox"), this.c, 5);
    }
}
