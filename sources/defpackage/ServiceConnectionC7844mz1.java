package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC7844mz1 implements ServiceConnection {
    public final /* synthetic */ AbstractRunnableC9679sL0 a;
    public final /* synthetic */ C8188nz1 g;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public ServiceConnectionC7844mz1(C8188nz1 c8188nz1, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        this.g = c8188nz1;
        this.a = abstractRunnableC9679sL0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            Parcel obtain = Parcel.obtain();
            FX2 fx2 = this.a.l;
            Bitmap b = fx2 == null ? null : fx2.b();
            if (b != null) {
                b.writeToParcel(obtain, 0);
            }
            iBinder.transact(1, obtain, null, 0);
        } catch (RemoteException e) {
            AbstractC4851eH1.a("cr.feedback", "Failed to send feedback: " + e.getMessage(), new Object[0]);
        }
        this.g.a.unbindService(this);
    }
}
