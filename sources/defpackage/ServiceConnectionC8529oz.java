package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC8529oz implements ServiceConnection {
    public boolean a = false;
    public final LinkedBlockingQueue g = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.g.add(iBinder);
    }

    public final IBinder a() {
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        return (IBinder) this.g.take();
    }
}
