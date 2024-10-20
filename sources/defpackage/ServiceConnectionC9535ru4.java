package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ru4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC9535ru4 implements ServiceConnection {
    public final /* synthetic */ C9529rt4 a;

    public ServiceConnectionC9535ru4(C9529rt4 c9529rt4) {
        this.a = c9529rt4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Gw4 gw4;
        C9529rt4 c9529rt4 = this.a;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
                gw4 = !(queryLocalInterface instanceof Gw4) ? new Gw4(iBinder) : (Gw4) queryLocalInterface;
            } catch (RemoteException unused) {
                Log.w("YouTubeClient", "service died");
                return;
            }
        } else {
            gw4 = null;
        }
        BinderC8850pu4 binderC8850pu4 = new BinderC8850pu4(c9529rt4);
        c9529rt4.getClass();
        Parcel a = gw4.a();
        int i = AbstractC5419fv4.a;
        a.writeStrongBinder(binderC8850pu4.asBinder());
        a.writeInt(11101);
        a.writeString(c9529rt4.m);
        a.writeString(c9529rt4.n);
        a.writeString(c9529rt4.l);
        a.writeInt(0);
        gw4.h(1, a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c();
    }
}
