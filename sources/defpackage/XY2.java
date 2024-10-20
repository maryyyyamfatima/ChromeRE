package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XY2 extends AbstractBinderC3271Ze1 implements ServiceConnection, TY2 {
    public static final byte[] n = {8, -74, 3};
    public static final byte[] o = {8, -39, 2};
    public static final byte[] p = {8, 98};
    public static final byte[] q = new byte[0];
    public final Context h;
    public InterfaceC3141Ye1 j;
    public final PackageManager l;
    public final ArrayDeque a = new ArrayDeque();
    public final HashSet g = new HashSet();
    public int i = 1;
    public final WY2 k = new WY2(new Handler(Looper.getMainLooper()));
    public final String m = "LENS_SERVICE_SESSION";

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

    public XY2(Context context) {
        this.h = context;
        this.l = context.getPackageManager();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC2751Ve1 c2621Ue1;
        String str = this.m;
        AbstractC5434fy2.a();
        if (iBinder == null) {
            c2621Ue1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            if (queryLocalInterface instanceof InterfaceC2751Ve1) {
                c2621Ue1 = (InterfaceC2751Ve1) queryLocalInterface;
            } else {
                c2621Ue1 = new C2621Ue1(iBinder);
            }
        }
        try {
            c2621Ue1.getClass();
            InterfaceC3141Ye1 f1 = ((C2621Ue1) c2621Ue1).f1(str, this, q);
            this.j = f1;
            if (f1 == null) {
                Log.e("LensSdk", String.format("Failed to create a %s.", str));
                i1(2);
                k1(6);
            } else {
                byte[] bArr = p;
                C2881We1 c2881We1 = (C2881We1) f1;
                Parcel a = c2881We1.a();
                a.writeByteArray(bArr);
                c2881We1.M0(1, a);
                k1(4);
            }
        } catch (RemoteException | SecurityException e) {
            Log.e("LensSdk", String.format("Unable to begin %s.", str), e);
            if (this.j == null) {
                k1(6);
            } else {
                k1(7);
            }
            i1(2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC5434fy2.a();
        k1(6);
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
                    W7 w7 = ((V7) it.next()).a;
                    w7.getClass();
                    AbstractC5195fH1.a("onLensServiceConnected", new Object[0]);
                    w7.c(2, new Bundle());
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
            i1(4);
        }
    }

    public final void i1(int i) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            W7 w7 = ((V7) it.next()).a;
            w7.getClass();
            AbstractC5195fH1.a("onLensServiceDead, errorCode: %d", Integer.valueOf(i));
            w7.c(3, new Bundle());
        }
    }
}
