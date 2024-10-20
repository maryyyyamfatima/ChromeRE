package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jv */
/* loaded from: classes.dex */
public final class ServiceConnectionC6788jv implements ServiceConnection {
    public final int a;
    public final /* synthetic */ BaseGmsClient g;

    public ServiceConnectionC6788jv(BaseGmsClient baseGmsClient, int i) {
        this.g = baseGmsClient;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC7364lc1 c6676jc1;
        boolean z;
        int i;
        if (iBinder == null) {
            BaseGmsClient baseGmsClient = this.g;
            synchronized (baseGmsClient.l) {
                z = baseGmsClient.s == 3;
            }
            if (z) {
                baseGmsClient.z = true;
                i = 5;
            } else {
                i = 4;
            }
            HandlerC5758gv handlerC5758gv = baseGmsClient.k;
            handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(i, baseGmsClient.B.get(), 16));
            return;
        }
        synchronized (this.g.m) {
            BaseGmsClient baseGmsClient2 = this.g;
            int i2 = AbstractBinderC7020kc1.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC7364lc1)) {
                c6676jc1 = (InterfaceC7364lc1) queryLocalInterface;
            } else {
                c6676jc1 = new C6676jc1(iBinder);
            }
            baseGmsClient2.n = c6676jc1;
        }
        BaseGmsClient baseGmsClient3 = this.g;
        int i3 = this.a;
        baseGmsClient3.getClass();
        C7820mv c7820mv = new C7820mv(baseGmsClient3, 0);
        HandlerC5758gv handlerC5758gv2 = baseGmsClient3.k;
        handlerC5758gv2.sendMessage(handlerC5758gv2.obtainMessage(7, i3, -1, c7820mv));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient;
        synchronized (this.g.m) {
            baseGmsClient = this.g;
            baseGmsClient.n = null;
        }
        HandlerC5758gv handlerC5758gv = baseGmsClient.k;
        handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(6, this.a, 1));
    }
}
