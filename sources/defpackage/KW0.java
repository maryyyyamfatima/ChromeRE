package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KW0 implements ServiceConnection {
    public final /* synthetic */ MW0 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MW0 mw0 = this.a;
        Context context = mw0.e;
        Context context2 = mw0.e;
        if (context == null) {
            return;
        }
        mw0.g = new Messenger(iBinder);
        try {
            Message obtain = Message.obtain((Handler) null, 2);
            obtain.replyTo = mw0.a;
            Bundle a = mw0.d.a(context2);
            if (a == null) {
                a = new Bundle();
            }
            a.putString("ssb_service:ssb_package_name", context2.getPackageName());
            a.putBoolean("ssb_service:chrome_holds_account_update_permission", AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS") == 0);
            obtain.setData(a);
            mw0.g.send(obtain);
        } catch (RemoteException e) {
            Log.w("GSAServiceConnection", "GSAServiceConnection - remote call failed", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.g = null;
    }

    public KW0(MW0 mw0) {
        this.a = mw0;
    }
}
