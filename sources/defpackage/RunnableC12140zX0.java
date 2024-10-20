package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12140zX0 implements Runnable {
    public final String a;
    public final Bundle g;
    public final InterfaceC5314fe1 h;
    public final Messenger i;
    public final /* synthetic */ AX0 j;

    public RunnableC12140zX0(AX0 ax0, String str, IBinder iBinder, Bundle bundle, long j, ArrayList arrayList) {
        InterfaceC5314fe1 c4627de1;
        this.j = ax0;
        this.a = str;
        int i = AbstractBinderC4970ee1.a;
        if (iBinder == null) {
            c4627de1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            if (queryLocalInterface instanceof InterfaceC5314fe1) {
                c4627de1 = (InterfaceC5314fe1) queryLocalInterface;
            } else {
                c4627de1 = new C4627de1(iBinder);
            }
        }
        this.h = c4627de1;
        this.g = bundle;
        this.i = null;
    }

    public RunnableC12140zX0(AX0 ax0, String str, Messenger messenger, Bundle bundle, long j, ArrayList arrayList) {
        this.j = ax0;
        this.a = str;
        this.i = messenger;
        this.g = bundle;
        this.h = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AX0 ax0 = this.j;
        StringBuilder sb = new StringBuilder("nts:client:onRunTask:");
        String str = this.a;
        sb.append(str);
        String sb2 = sb.toString();
        if (sb2.length() > 127) {
            sb2 = sb2.substring(0, 127);
        }
        Trace.beginSection(sb2);
        try {
            LF3 lf3 = new LF3(str, this.g);
            ax0.l.getClass();
            b(ax0.c(lf3));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void b(int i) {
        AX0 ax0;
        AX0 ax02;
        synchronized (this.j.a) {
            boolean z = true;
            try {
                try {
                    ax02 = this.j;
                } catch (RemoteException unused) {
                    Log.e("GcmTaskService", "Error reporting result of operation to scheduler for " + this.a);
                    AX0 ax03 = this.j;
                    ax03.k.e(this.a, ax03.j.getClassName());
                    if (this.i == null) {
                        z = false;
                    }
                    if (!z) {
                        AX0 ax04 = this.j;
                        if (!ax04.k.d(ax04.j.getClassName())) {
                            ax0 = this.j;
                        }
                    }
                }
                if (ax02.k.i(this.a, ax02.j.getClassName())) {
                    return;
                }
                Messenger messenger = this.i;
                if (messenger != null) {
                    messenger.send(a(i));
                } else {
                    C4627de1 c4627de1 = (C4627de1) this.h;
                    Parcel a = c4627de1.a();
                    a.writeInt(i);
                    c4627de1.h(2, a);
                }
                AX0 ax05 = this.j;
                ax05.k.e(this.a, ax05.j.getClassName());
                if (this.i == null) {
                    z = false;
                }
                if (!z) {
                    AX0 ax06 = this.j;
                    if (!ax06.k.d(ax06.j.getClassName())) {
                        ax0 = this.j;
                        ax0.stopSelf(ax0.g);
                    }
                }
            } finally {
                AX0 ax07 = this.j;
                ax07.k.e(this.a, ax07.j.getClassName());
                if (this.i == null) {
                    z = false;
                }
                if (!z) {
                    AX0 ax08 = this.j;
                    if (!ax08.k.d(ax08.j.getClassName())) {
                        AX0 ax09 = this.j;
                        ax09.stopSelf(ax09.g);
                    }
                }
            }
        }
    }

    public final Message a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("component", this.j.j);
        bundle.putString("tag", this.a);
        obtain.setData(bundle);
        return obtain;
    }
}
