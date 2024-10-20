package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4891eP1 extends AbstractC4896eQ1 {
    public final String a;
    public final C4548dP1 b;

    public C4891eP1(String str, C4548dP1 c4548dP1) {
        this.a = str;
        this.b = c4548dP1;
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void f(int i) {
        C4548dP1 c4548dP1;
        MediaRouter2.RoutingController routingController;
        boolean isReleased;
        Messenger messenger;
        String str = this.a;
        if (str == null || (c4548dP1 = this.b) == null || (routingController = c4548dP1.g) == null) {
            return;
        }
        isReleased = routingController.isReleased();
        if (isReleased || (messenger = c4548dP1.h) == null) {
            return;
        }
        int andIncrement = c4548dP1.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = c4548dP1.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void i(int i) {
        C4548dP1 c4548dP1;
        MediaRouter2.RoutingController routingController;
        boolean isReleased;
        Messenger messenger;
        String str = this.a;
        if (str == null || (c4548dP1 = this.b) == null || (routingController = c4548dP1.g) == null) {
            return;
        }
        isReleased = routingController.isReleased();
        if (isReleased || (messenger = c4548dP1.h) == null) {
            return;
        }
        int andIncrement = c4548dP1.l.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = c4548dP1.i;
        try {
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
