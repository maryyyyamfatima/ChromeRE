package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3138Yd3 implements InterfaceC1838Od3 {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;
    public final InterfaceC5467g40 b;
    public final InterfaceC5444g01 c;
    public volatile boolean d;
    public volatile boolean e;
    public final C2488Td3 f = new C2488Td3(this);

    public C3138Yd3(Context context, C5100f01 c5100f01, C1708Nd3 c1708Nd3) {
        this.a = context.getApplicationContext();
        this.c = c5100f01;
        this.b = c1708Nd3;
    }

    @Override // defpackage.InterfaceC1838Od3
    public final boolean a() {
        g.execute(new RunnableC2618Ud3(this));
        return true;
    }

    @Override // defpackage.InterfaceC1838Od3
    public final void b() {
        g.execute(new RunnableC2748Vd3(this));
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
