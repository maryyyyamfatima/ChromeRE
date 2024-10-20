package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bu4 */
/* loaded from: classes.dex */
public final class HandlerC4039bu4 extends Handler {
    public final /* synthetic */ C9529rt4 a;

    public HandlerC4039bu4(C9529rt4 c9529rt4) {
        this.a = c9529rt4;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        int i = message.what;
        if (i == 3) {
            this.a.e((Is4) message.obj);
            return;
        }
        if (i == 4) {
            synchronized (this.a.e) {
                try {
                    C9529rt4 c9529rt4 = this.a;
                    if (c9529rt4.k) {
                        if ((c9529rt4.d != null) && c9529rt4.e.contains(message.obj)) {
                            ((Kw4) message.obj).a();
                        }
                    }
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            if (!(this.a.d != null)) {
                return;
            }
        }
        if (i == 2 || i == 1) {
            C4725du4 c4725du4 = (C4725du4) message.obj;
            synchronized (c4725du4) {
                obj = c4725du4.a;
            }
            IBinder iBinder = c4725du4.c;
            if (obj != null) {
                Is4 is4 = c4725du4.b;
                int ordinal = is4.ordinal();
                C9529rt4 c9529rt42 = c4725du4.d;
                if (ordinal == 0) {
                    try {
                        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                        c9529rt42.getClass();
                        if ("com.google.android.youtube.player.internal.IYouTubeService".equals(interfaceDescriptor)) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
                            Iw4 iw4 = queryLocalInterface instanceof Iw4 ? (Iw4) queryLocalInterface : new Iw4(iBinder);
                            c9529rt42.d = iw4;
                            if (iw4 != null) {
                                c9529rt42.h();
                                return;
                            }
                        }
                    } catch (RemoteException unused) {
                    }
                    c9529rt42.f();
                    is4 = Is4.INTERNAL_ERROR;
                }
                c9529rt42.e(is4);
            }
        }
    }
}
