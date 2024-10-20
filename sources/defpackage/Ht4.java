package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ht4 implements ServiceConnection {
    public final /* synthetic */ Jt4 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Jt4 jt4 = this.a;
        jt4.b.b(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        jt4.b(new Dt4(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Jt4 jt4 = this.a;
        jt4.b.b(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        jt4.b(new Ft4(this));
    }
}
