package org.chromium.chrome.browser.vr.keyboard;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.AbstractBinderC0402Dc1;
import defpackage.AbstractC4851eH1;
import defpackage.C0272Cc1;
import defpackage.C9938t51;
import defpackage.InterfaceC0532Ec1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class GvrKeyboardLoaderClient {
    public static InterfaceC0532Ec1 a;
    public static ClassLoader b;
    public static C9938t51 c;

    public static long loadKeyboardSDK() {
        InterfaceC0532Ec1 a2 = a();
        if (a2 == null) {
            return 0L;
        }
        try {
            C0272Cc1 c0272Cc1 = (C0272Cc1) a2;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.vr.keyboard.IGvrKeyboardLoader");
                obtain.writeLong(1L);
                c0272Cc1.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readLong();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    public static void closeKeyboardSDK(long j) {
        InterfaceC0532Ec1 a2 = a();
        if (a2 != null) {
            try {
                C0272Cc1 c0272Cc1 = (C0272Cc1) a2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.vr.keyboard.IGvrKeyboardLoader");
                    obtain.writeLong(j);
                    c0272Cc1.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            } catch (RemoteException e) {
                AbstractC4851eH1.a("ChromeGvrKbClient", "Couldn't close GVR keyboard library", e);
            }
        }
    }

    public static Object getRemoteClassLoader() {
        Context context;
        Context context2 = V60.a;
        if (b == null) {
            try {
                context = context2.createPackageContext("com.google.android.vr.inputmethod", 3);
            } catch (PackageManager.NameNotFoundException e) {
                AbstractC4851eH1.a("ChromeGvrKbClient", "Couldn't find remote context", e);
                context = null;
            }
            if (context != null) {
                b = context.getClassLoader();
            }
        }
        return b;
    }

    public static InterfaceC0532Ec1 a() {
        ClassLoader classLoader;
        IBinder iBinder;
        InterfaceC0532Ec1 c0272Cc1;
        if (a == null && (classLoader = (ClassLoader) getRemoteClassLoader()) != null) {
            try {
                iBinder = (IBinder) classLoader.loadClass("com.google.vr.keyboard.GvrKeyboardLoader").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                AbstractC4851eH1.a("ChromeGvrKbClient", "Unable to find dynamic class com.google.vr.keyboard.GvrKeyboardLoader", new Object[0]);
                iBinder = null;
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of com.google.vr.keyboard.GvrKeyboardLoader");
            } catch (InstantiationException unused3) {
                throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.keyboard.GvrKeyboardLoader");
            } catch (Exception unused4) {
                throw new IllegalStateException("Reflection error in com.google.vr.keyboard.GvrKeyboardLoader");
            }
            if (iBinder != null) {
                int i = AbstractBinderC0402Dc1.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.keyboard.IGvrKeyboardLoader");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0532Ec1)) {
                    c0272Cc1 = (InterfaceC0532Ec1) queryLocalInterface;
                } else {
                    c0272Cc1 = new C0272Cc1(iBinder);
                }
                a = c0272Cc1;
            }
        }
        return a;
    }

    public static Context getContextWrapper() {
        Context context;
        C9938t51 c9938t51 = c;
        if (c9938t51 != null) {
            return c9938t51;
        }
        Context context2 = V60.a;
        try {
            context = context2.createPackageContext("com.google.android.vr.inputmethod", 3);
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC4851eH1.a("ChromeGvrKbClient", "Couldn't find remote context", e);
            context = null;
        }
        C9938t51 c9938t512 = new C9938t51(context, context2);
        c = c9938t512;
        return c9938t512;
    }
}
