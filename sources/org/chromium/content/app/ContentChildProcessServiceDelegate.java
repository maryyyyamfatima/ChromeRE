package org.chromium.content.app;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.Surface;
import defpackage.AbstractBinderC0012Ac1;
import defpackage.AbstractC4851eH1;
import defpackage.C0627Ev1;
import defpackage.C12168zc1;
import defpackage.CK;
import defpackage.InterfaceC0142Bc1;
import defpackage.V60;
import java.util.List;
import org.chromium.base.BuildInfo;
import org.chromium.base.JNIUtils;
import org.chromium.base.UnguessableToken;
import org.chromium.base.library_loader.b;
import org.chromium.content.common.SurfaceWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContentChildProcessServiceDelegate implements CK {
    public InterfaceC0142Bc1 a;
    public int b;
    public long c;
    public SparseArray d;

    public ContentChildProcessServiceDelegate() {
        if (BuildInfo.a()) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0627Ev1());
    }

    public final void b(Bundle bundle, List list) {
        InterfaceC0142Bc1 interfaceC0142Bc1 = null;
        if (list != null && !list.isEmpty()) {
            IBinder iBinder = (IBinder) list.get(0);
            int i = AbstractBinderC0012Ac1.a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.content.common.IGpuProcessCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0142Bc1)) {
                    interfaceC0142Bc1 = (InterfaceC0142Bc1) queryLocalInterface;
                } else {
                    interfaceC0142Bc1 = new C12168zc1(iBinder);
                }
            }
        }
        this.a = interfaceC0142Bc1;
        this.b = bundle.getInt("com.google.android.apps.chrome.extra.cpu_count");
        this.c = bundle.getLong("com.google.android.apps.chrome.extra.cpu_features");
        b.n.i.f(bundle);
    }

    public final void setFileDescriptorsIdsToKeys(int[] iArr, String[] strArr) {
        this.d = new SparseArray();
        for (int i = 0; i < iArr.length; i++) {
            this.d.put(iArr[i], strArr[i]);
        }
    }

    public final void forwardSurfaceForSurfaceRequest(UnguessableToken unguessableToken, Surface surface) {
        InterfaceC0142Bc1 interfaceC0142Bc1 = this.a;
        try {
            if (interfaceC0142Bc1 == null) {
                AbstractC4851eH1.a("ContentCPSDelegate", "No callback interface has been provided.", new Object[0]);
            } else {
                interfaceC0142Bc1.C(unguessableToken, surface);
            }
        } catch (RemoteException e) {
            AbstractC4851eH1.a("ContentCPSDelegate", "Unable to call forwardSurfaceForSurfaceRequest: %s", e);
        } finally {
            surface.release();
        }
    }

    public final SurfaceWrapper getViewSurface(int i) {
        InterfaceC0142Bc1 interfaceC0142Bc1 = this.a;
        if (interfaceC0142Bc1 == null) {
            AbstractC4851eH1.a("ContentCPSDelegate", "No callback interface has been provided.", new Object[0]);
            return null;
        }
        try {
            return interfaceC0142Bc1.G0(i);
        } catch (RemoteException e) {
            AbstractC4851eH1.a("ContentCPSDelegate", "Unable to call getViewSurface: %s", e);
            return null;
        }
    }

    public final void a(Context context) {
        boolean z;
        b bVar = b.n;
        synchronized (bVar.j) {
            z = bVar.l;
        }
        if (z) {
            synchronized (bVar.j) {
                bVar.e();
            }
            N.M0zXFFiu(this);
            return;
        }
        JNIUtils.a = Boolean.TRUE;
        bVar.i.c();
        synchronized (bVar.j) {
            if (bVar.c != 0 && context != V60.a) {
                throw new IllegalStateException("Attempt to load again from alternate context.");
            }
            bVar.g(context.getApplicationInfo(), false);
        }
        bVar.h();
        synchronized (bVar.j) {
            bVar.e();
        }
        N.M0zXFFiu(this);
    }
}
