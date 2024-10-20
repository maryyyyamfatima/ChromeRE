package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: po0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC8810po0 implements ServiceConnection {
    public final /* synthetic */ C9153qo0 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1047Ib1 c0787Gb1;
        C9153qo0 c9153qo0 = this.a;
        String str = c9153qo0.c;
        Objects.toString(componentName);
        int i = AbstractBinderC0917Hb1.a;
        if (iBinder == null) {
            c0787Gb1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.widget.directwriting.IDirectWritingService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1047Ib1)) {
                c0787Gb1 = (InterfaceC1047Ib1) queryLocalInterface;
            } else {
                c0787Gb1 = new C0787Gb1(iBinder);
            }
        }
        c9153qo0.a = c0787Gb1;
        c9153qo0.b();
        if (c9153qo0.a()) {
            try {
                Bundle bundle = new Bundle();
                ((C0787Gb1) c9153qo0.a).a(bundle);
                c9153qo0.e.a(bundle);
            } catch (DeadObjectException e) {
                AbstractC4851eH1.a("DWServiceBinder", "updateConfiguration failed due to DeadObjectException.", e);
                c9153qo0.c();
            } catch (Exception e2) {
                AbstractC4851eH1.a("DWServiceBinder", "updateConfiguration failed.", e2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C9153qo0 c9153qo0 = this.a;
        String str = c9153qo0.c;
        Objects.toString(componentName);
        c9153qo0.d(c9153qo0.f);
    }

    public ServiceConnectionC8810po0(C9153qo0 c9153qo0) {
        this.a = c9153qo0;
    }
}
