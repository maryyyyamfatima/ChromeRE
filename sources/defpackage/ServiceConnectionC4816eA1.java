package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC4816eA1 extends AbstractBinderC7370ld1 implements ServiceConnection {
    public static final /* synthetic */ int m = 0;
    public final Context h;
    public InterfaceC7026kd1 j;
    public final Executor k;
    public final PackageManager l;
    public final ArrayDeque a = new ArrayDeque();
    public final HashSet g = new HashSet();
    public int i = 1;

    public static String j1(int i) {
        switch (i) {
            case 1:
                return "STATE_UNBOUND";
            case 2:
                return "STATE_BINDING";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "STATE_BOUND";
            case 4:
                return "STATE_BOUND_STARTED";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "STATE_UNBOUND_DEAD";
            case 6:
                return "STATE_BOUND_DEAD";
            case 7:
                return "STATE_BOUND_STARTED_DEAD";
            default:
                return "UNRECOGNIZED STATE";
        }
    }

    public ServiceConnectionC4816eA1(Context context, ExecutorC4473dA1 executorC4473dA1) {
        this.h = context;
        this.l = context.getPackageManager();
        this.k = executorC4473dA1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.k.execute(new Runnable() { // from class: Xz1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7026kd1 c6682jd1;
                ServiceConnectionC4816eA1 serviceConnectionC4816eA1 = ServiceConnectionC4816eA1.this;
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    c6682jd1 = null;
                } else {
                    serviceConnectionC4816eA1.getClass();
                    IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.libraries.lens.sdk.shared.ILensService");
                    if (queryLocalInterface instanceof InterfaceC7026kd1) {
                        c6682jd1 = (InterfaceC7026kd1) queryLocalInterface;
                    } else {
                        c6682jd1 = new C6682jd1(iBinder2);
                    }
                }
                serviceConnectionC4816eA1.j = c6682jd1;
                try {
                    c6682jd1.getClass();
                    C6682jd1 c6682jd12 = (C6682jd1) c6682jd1;
                    Parcel a = c6682jd12.a();
                    AbstractC11786yV.c(a, serviceConnectionC4816eA1);
                    c6682jd12.h(2, a);
                    serviceConnectionC4816eA1.k1(4);
                } catch (RemoteException | SecurityException e) {
                    Log.e("LensSdk", "Unable to attach.", e);
                    serviceConnectionC4816eA1.k1(6);
                    serviceConnectionC4816eA1.i1();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.k.execute(new Runnable() { // from class: Vz1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4816eA1.this.k1(6);
            }
        });
    }

    public final boolean h1() {
        int i = this.i;
        return i == 3 || i == 4 || i == 6 || i == 7;
    }

    public final void k1(int i) {
        boolean z = true;
        if (Log.isLoggable("LensSdk", 3)) {
            String.format("Transitioning from %s to %s.", j1(this.i), j1(i));
        }
        int i2 = this.i;
        this.i = i;
        if (i == 4) {
            if (!(i2 == 4)) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    C5504gA1 c5504gA1 = ((C5160fA1) it.next()).a;
                    c5504gA1.getClass();
                    AbstractC5195fH1.a("onLensServiceConnected", new Object[0]);
                    c5504gA1.c(2, new Bundle());
                }
                while (true) {
                    ArrayDeque arrayDeque = this.a;
                    if (arrayDeque.peek() == null) {
                        break;
                    } else {
                        ((Runnable) arrayDeque.remove()).run();
                    }
                }
            }
        }
        if (i == 5 || i == 6 || i == 7) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                z = false;
            }
            if (z) {
                return;
            }
            i1();
        }
    }

    public final void i1() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            C5504gA1 c5504gA1 = ((C5160fA1) it.next()).a;
            c5504gA1.getClass();
            AbstractC5195fH1.a("onLensServiceDead", new Object[0]);
            c5504gA1.c(3, new Bundle());
        }
    }
}
