package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6644jW1 {
    public final Messenger a;
    public final CloudMessagingMessengerCompat b;

    public C6644jW1(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new CloudMessagingMessengerCompat(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: " + interfaceDescriptor);
            throw new RemoteException();
        }
    }
}
