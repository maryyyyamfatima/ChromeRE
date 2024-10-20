package defpackage;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5504gA1 extends AbstractC10902vu {
    public final ServiceConnectionC4816eA1 b;
    public final C5160fA1 c = new C5160fA1(this);

    public C5504gA1(ServiceConnectionC4816eA1 serviceConnectionC4816eA1) {
        this.b = serviceConnectionC4816eA1;
    }

    @Override // defpackage.AbstractC10902vu
    public final void a() {
        AbstractC5195fH1.a("connect", new Object[0]);
        final ServiceConnectionC4816eA1 serviceConnectionC4816eA1 = this.b;
        serviceConnectionC4816eA1.getClass();
        final C5160fA1 c5160fA1 = this.c;
        serviceConnectionC4816eA1.k.execute(new Runnable() { // from class: bA1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4816eA1.this.g.add(c5160fA1);
            }
        });
        serviceConnectionC4816eA1.getClass();
        serviceConnectionC4816eA1.k.execute(new Runnable() { // from class: cA1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4816eA1 serviceConnectionC4816eA12 = ServiceConnectionC4816eA1.this;
                boolean z = false;
                if (serviceConnectionC4816eA12.i == 2) {
                    Log.e("LensSdk", "Attempting to bind service while currently binding.");
                    return;
                }
                if (!serviceConnectionC4816eA12.h1()) {
                    try {
                        PackageInfo packageInfo = serviceConnectionC4816eA12.l.getPackageInfo("com.google.android.googlequicksearchbox", 0);
                        if (packageInfo != null) {
                            z = packageInfo.versionCode >= 301165494;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("AgsaVersionChecker", "Unable to find agsa package: com.google.android.googlequicksearchbox");
                    }
                    if (!z) {
                        Log.e("LensSdk", "Google search app isn't up to date.");
                        serviceConnectionC4816eA12.k1(5);
                        serviceConnectionC4816eA12.i1();
                        return;
                    }
                    serviceConnectionC4816eA12.k1(2);
                    Intent intent = new Intent("com.google.android.lens.BIND");
                    intent.setPackage("com.google.android.googlequicksearchbox");
                    try {
                        if (!serviceConnectionC4816eA12.h.bindService(intent, serviceConnectionC4816eA12, 65)) {
                            Log.e("LensSdk", "Unable to bind.");
                            serviceConnectionC4816eA12.i1();
                            serviceConnectionC4816eA12.k1(6);
                        } else {
                            serviceConnectionC4816eA12.k1(3);
                        }
                        return;
                    } catch (SecurityException e) {
                        Log.e("LensSdk", "Unable to bind due to security exception.", e);
                        serviceConnectionC4816eA12.i1();
                        serviceConnectionC4816eA12.k1(6);
                        return;
                    }
                }
                Log.e("LensSdk", "Attempting to bind service when already bound.");
            }
        });
    }

    @Override // defpackage.AbstractC10902vu
    public final void b() {
        AbstractC5195fH1.a("disconnect", new Object[0]);
        final ServiceConnectionC4816eA1 serviceConnectionC4816eA1 = this.b;
        serviceConnectionC4816eA1.getClass();
        serviceConnectionC4816eA1.k.execute(new Runnable() { // from class: Yz1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4816eA1 serviceConnectionC4816eA12 = ServiceConnectionC4816eA1.this;
                int i = serviceConnectionC4816eA12.i;
                if (i == 4 || i == 7) {
                    try {
                        InterfaceC7026kd1 interfaceC7026kd1 = serviceConnectionC4816eA12.j;
                        interfaceC7026kd1.getClass();
                        C6682jd1 c6682jd1 = (C6682jd1) interfaceC7026kd1;
                        c6682jd1.h(3, c6682jd1.a());
                    } catch (RemoteException | SecurityException e) {
                        Log.e("LensSdk", "Unable to detach.", e);
                    }
                    serviceConnectionC4816eA12.j = null;
                }
                if (serviceConnectionC4816eA12.h1()) {
                    try {
                        String.format("Current state is %s.", ServiceConnectionC4816eA1.j1(serviceConnectionC4816eA12.i));
                        serviceConnectionC4816eA12.h.unbindService(serviceConnectionC4816eA12);
                    } catch (IllegalArgumentException e2) {
                        Log.e("LensSdk", "Error occurred when unbinding.", e2);
                    }
                    serviceConnectionC4816eA12.j = null;
                }
                serviceConnectionC4816eA12.g.clear();
                serviceConnectionC4816eA12.a.clear();
                serviceConnectionC4816eA12.k1(1);
            }
        });
    }

    @Override // defpackage.AbstractC10902vu
    public final void d(final Bundle bundle) {
        AbstractC5195fH1.a("send", new Object[0]);
        final ServiceConnectionC4816eA1 serviceConnectionC4816eA1 = this.b;
        serviceConnectionC4816eA1.getClass();
        serviceConnectionC4816eA1.k.execute(new Runnable() { // from class: Zz1
            @Override // java.lang.Runnable
            public final void run() {
                final ServiceConnectionC4816eA1 serviceConnectionC4816eA12 = ServiceConnectionC4816eA1.this;
                serviceConnectionC4816eA12.getClass();
                try {
                    boolean z = serviceConnectionC4816eA12.i == 4;
                    final Bundle bundle2 = bundle;
                    if (z) {
                        InterfaceC7026kd1 interfaceC7026kd1 = serviceConnectionC4816eA12.j;
                        interfaceC7026kd1.getClass();
                        C6682jd1 c6682jd1 = (C6682jd1) interfaceC7026kd1;
                        Parcel a = c6682jd1.a();
                        AbstractC11786yV.b(a, bundle2);
                        c6682jd1.h(1, a);
                    } else {
                        serviceConnectionC4816eA12.a.add(new Runnable() { // from class: aA1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Bundle bundle3 = bundle2;
                                ServiceConnectionC4816eA1 serviceConnectionC4816eA13 = ServiceConnectionC4816eA1.this;
                                serviceConnectionC4816eA13.getClass();
                                try {
                                    InterfaceC7026kd1 interfaceC7026kd12 = serviceConnectionC4816eA13.j;
                                    interfaceC7026kd12.getClass();
                                    C6682jd1 c6682jd12 = (C6682jd1) interfaceC7026kd12;
                                    Parcel a2 = c6682jd12.a();
                                    AbstractC11786yV.b(a2, bundle3);
                                    c6682jd12.h(1, a2);
                                } catch (RemoteException unused) {
                                    serviceConnectionC4816eA13.i1();
                                }
                            }
                        });
                    }
                } catch (RemoteException unused) {
                    serviceConnectionC4816eA12.i1();
                }
            }
        });
    }
}
