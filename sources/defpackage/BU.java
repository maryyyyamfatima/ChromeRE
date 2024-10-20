package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BU implements ServiceConnection {
    public final Context a;
    public final Intent g;
    public boolean h;
    public boolean i;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public BU(Context context, Intent intent) {
        this.a = context;
        this.g = intent;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z = this.i;
        if (z) {
            this.h = true;
            if (z) {
                this.a.unbindService(this);
                this.i = false;
            }
        }
    }
}
