package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6302iW1 {
    public final Messenger a;
    public final MessengerCompat b;

    public C6302iW1(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new MessengerCompat(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: " + interfaceDescriptor);
            throw new RemoteException();
        }
    }
}
