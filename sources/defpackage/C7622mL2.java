package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7622mL2 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final HandlerC8653pL2 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ ServiceConnectionC10024tL2 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public C7622mL2(ServiceConnectionC10024tL2 serviceConnectionC10024tL2, Messenger messenger) {
        this.i = serviceConnectionC10024tL2;
        this.a = messenger;
        HandlerC8653pL2 handlerC8653pL2 = new HandlerC8653pL2(this);
        this.b = handlerC8653pL2;
        this.c = new Messenger(handlerC8653pL2);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.o.post(new RunnableC7278lL2(this));
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundle);
    }

    public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }
}
