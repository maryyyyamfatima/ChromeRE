package com.google.vr.internal.controller;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerRequest;
import defpackage.AbstractBinderC5640gb1;
import defpackage.AbstractC8015nV1;
import defpackage.C3463aE2;
import defpackage.C3807bE2;
import defpackage.C5296fb1;
import defpackage.C6029hi4;
import defpackage.InterfaceC5984hb1;
import defpackage.Q80;
import defpackage.R80;
import defpackage.S80;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final AtomicInteger o = new AtomicInteger(-1);
    public final Context a;
    public final Handler g;
    public final int h;
    public final String i;
    public final R80 j;
    public final SparseArray k;
    public InterfaceC5984hb1 l;
    public S80 m;
    public boolean n;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public interface Callbacks {
        void onControllerEventPacket(ControllerEventPacket controllerEventPacket);

        void onControllerEventPacket2(ControllerEventPacket2 controllerEventPacket2);

        void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent);

        void onControllerStateChanged(int i, int i2);

        void onServiceConnected(int i);

        void onServiceDisconnected();

        void onServiceFailed();

        void onServiceInitFailed(int i);

        void onServiceUnavailable();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i);
        SparseArray sparseArray = new SparseArray();
        this.k = sparseArray;
        this.a = context.getApplicationContext();
        int i2 = 0;
        S80 s80 = new S80(0, callbacks, controllerListenerOptions);
        this.m = s80;
        sparseArray.put(0, s80);
        this.g = new Handler(Looper.getMainLooper());
        this.j = new R80(this);
        try {
            i2 = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (C6029hi4 unused) {
        }
        this.h = i2;
        int incrementAndGet = o.incrementAndGet();
        StringBuilder sb = new StringBuilder(30);
        sb.append("VrCtl.ServiceBridge");
        sb.append(incrementAndGet);
        this.i = sb.toString();
    }

    public void requestBind() {
        this.g.post(new Runnable(this) { // from class: M80
            public final ControllerServiceBridge a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ControllerServiceBridge controllerServiceBridge = this.a;
                controllerServiceBridge.getClass();
                ControllerServiceBridge.b();
                if (controllerServiceBridge.n) {
                    Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                    return;
                }
                Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
                intent.setPackage("com.google.vr.vrcore");
                if (!controllerServiceBridge.a.bindService(intent, controllerServiceBridge, 1)) {
                    Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                    controllerServiceBridge.m.a.onServiceUnavailable();
                }
                controllerServiceBridge.n = true;
            }
        });
    }

    public void requestUnbind() {
        this.g.post(new Runnable(this) { // from class: N80
            public final ControllerServiceBridge a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }

    public final void a() {
        b();
        if (!this.n) {
            Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
            return;
        }
        b();
        InterfaceC5984hb1 interfaceC5984hb1 = this.l;
        if (interfaceC5984hb1 != null) {
            try {
                String str = this.i;
                C5296fb1 c5296fb1 = (C5296fb1) interfaceC5984hb1;
                Parcel obtainAndWriteInterfaceToken = c5296fb1.obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = c5296fb1.transactAndReadException(6, obtainAndWriteInterfaceToken);
                c.a(transactAndReadException);
                transactAndReadException.recycle();
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
            }
        }
        if (this.h >= 21) {
            try {
                InterfaceC5984hb1 interfaceC5984hb12 = this.l;
                if (interfaceC5984hb12 != null) {
                    R80 r80 = this.j;
                    C5296fb1 c5296fb12 = (C5296fb1) interfaceC5984hb12;
                    Parcel obtainAndWriteInterfaceToken2 = c5296fb12.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken2, r80);
                    Parcel transactAndReadException2 = c5296fb12.transactAndReadException(9, obtainAndWriteInterfaceToken2);
                    boolean a = c.a(transactAndReadException2);
                    transactAndReadException2.recycle();
                    if (!a) {
                        Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                    }
                }
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 55);
                sb.append("Exception while unregistering remote service listener: ");
                sb.append(valueOf);
                Log.w("VrCtl.ServiceBridge", sb.toString());
            }
        }
        this.a.unbindService(this);
        this.l = null;
        this.n = false;
    }

    public boolean createAndConnectController(int i, Callbacks callbacks, int i2) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i2);
        b();
        if (this.l != null) {
            S80 s80 = new S80(i, callbacks, controllerListenerOptions);
            boolean c = c(i, s80);
            SparseArray sparseArray = this.k;
            if (c) {
                if (i == 0) {
                    this.m = s80;
                }
                sparseArray.put(i, s80);
                return true;
            }
            if (i == 0) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Failed to connect controller ");
                sb.append(i);
                sb.append(".");
                Log.e("VrCtl.ServiceBridge", sb.toString());
            }
            sparseArray.remove(i);
        }
        return false;
    }

    public void vibrateController(final int i, int i2, int i3, int i4) {
        C3807bE2 c3807bE2 = new C3807bE2();
        C3463aE2 c3463aE2 = new C3463aE2();
        int i5 = c3463aE2.a | 1;
        c3463aE2.g = i2;
        c3463aE2.h = i3;
        c3463aE2.a = i5 | 2 | 4;
        c3463aE2.i = i4;
        c3807bE2.a = c3463aE2;
        final ControllerRequest controllerRequest = new ControllerRequest();
        int serializedSize = c3807bE2.getSerializedSize();
        if (serializedSize != 0) {
            byte[] bArr = controllerRequest.a;
            if (bArr != null && serializedSize == bArr.length) {
                AbstractC8015nV1.toByteArray(c3807bE2, bArr, 0, bArr.length);
            } else {
                controllerRequest.a = AbstractC8015nV1.toByteArray(c3807bE2);
            }
        } else {
            controllerRequest.a = null;
        }
        this.g.post(new Runnable(this, i, controllerRequest) { // from class: O80
            public final ControllerServiceBridge a;
            public final int g;
            public final ControllerRequest h;

            {
                this.a = this;
                this.g = i;
                this.h = controllerRequest;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = this.g;
                ControllerRequest controllerRequest2 = this.h;
                ControllerServiceBridge controllerServiceBridge = this.a;
                controllerServiceBridge.getClass();
                ControllerServiceBridge.b();
                InterfaceC5984hb1 interfaceC5984hb1 = controllerServiceBridge.l;
                if (interfaceC5984hb1 == null) {
                    Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
                    return;
                }
                try {
                    C5296fb1 c5296fb1 = (C5296fb1) interfaceC5984hb1;
                    Parcel obtainAndWriteInterfaceToken = c5296fb1.obtainAndWriteInterfaceToken();
                    obtainAndWriteInterfaceToken.writeInt(i6);
                    c.a(obtainAndWriteInterfaceToken, controllerRequest2);
                    c5296fb1.transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
                } catch (RemoteException e) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC5984hb1 c5296fb1;
        String str;
        b();
        int i = AbstractBinderC5640gb1.a;
        if (iBinder == null) {
            c5296fb1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
            if (queryLocalInterface instanceof InterfaceC5984hb1) {
                c5296fb1 = (InterfaceC5984hb1) queryLocalInterface;
            } else {
                c5296fb1 = new C5296fb1(iBinder);
            }
        }
        this.l = c5296fb1;
        try {
            C5296fb1 c5296fb12 = (C5296fb1) c5296fb1;
            Parcel obtainAndWriteInterfaceToken = c5296fb12.obtainAndWriteInterfaceToken();
            obtainAndWriteInterfaceToken.writeInt(22);
            Parcel transactAndReadException = c5296fb12.transactAndReadException(1, obtainAndWriteInterfaceToken);
            int readInt = transactAndReadException.readInt();
            transactAndReadException.recycle();
            if (readInt != 0) {
                if (readInt == 0) {
                    str = "SUCCESS";
                } else if (readInt == 1) {
                    str = "FAILED_UNSUPPORTED";
                } else if (readInt == 2) {
                    str = "FAILED_NOT_AUTHORIZED";
                } else if (readInt != 3) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                    sb.append(readInt);
                    sb.append("]");
                    str = sb.toString();
                } else {
                    str = "FAILED_CLIENT_OBSOLETE";
                }
                String valueOf = String.valueOf(str);
                Log.e("VrCtl.ServiceBridge", valueOf.length() != 0 ? "initialize() returned error: ".concat(valueOf) : new String("initialize() returned error: "));
                this.m.a.onServiceInitFailed(readInt);
                a();
                return;
            }
            if (this.h >= 21) {
                try {
                    InterfaceC5984hb1 interfaceC5984hb1 = this.l;
                    R80 r80 = this.j;
                    C5296fb1 c5296fb13 = (C5296fb1) interfaceC5984hb1;
                    Parcel obtainAndWriteInterfaceToken2 = c5296fb13.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken2, r80);
                    Parcel transactAndReadException2 = c5296fb13.transactAndReadException(8, obtainAndWriteInterfaceToken2);
                    boolean a = c.a(transactAndReadException2);
                    transactAndReadException2.recycle();
                    if (!a) {
                        Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                        this.m.a.onServiceInitFailed(readInt);
                        a();
                        return;
                    }
                } catch (RemoteException e) {
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 53);
                    sb2.append("Exception while registering remote service listener: ");
                    sb2.append(valueOf2);
                    Log.w("VrCtl.ServiceBridge", sb2.toString());
                }
            }
            d();
        } catch (RemoteException e2) {
            Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
            this.m.a.onServiceFailed();
            a();
        }
    }

    public final void d() {
        this.m.a.onServiceConnected(1);
        S80 s80 = this.m;
        if (!c(s80.c, s80)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.m.a.onServiceFailed();
            a();
        } else {
            SparseArray sparseArray = this.k;
            S80 s802 = this.m;
            sparseArray.put(s802.c, s802);
            Log.i("VrCtl.ServiceBridge", "Successfully registered service listener.");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b();
        this.l = null;
        this.m.a.onServiceDisconnected();
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    public final boolean c(int i, S80 s80) {
        try {
            InterfaceC5984hb1 interfaceC5984hb1 = this.l;
            String str = this.i;
            Q80 q80 = new Q80(s80);
            C5296fb1 c5296fb1 = (C5296fb1) interfaceC5984hb1;
            Parcel obtainAndWriteInterfaceToken = c5296fb1.obtainAndWriteInterfaceToken();
            obtainAndWriteInterfaceToken.writeInt(i);
            obtainAndWriteInterfaceToken.writeString(str);
            c.a(obtainAndWriteInterfaceToken, q80);
            Parcel transactAndReadException = c5296fb1.transactAndReadException(5, obtainAndWriteInterfaceToken);
            boolean a = c.a(transactAndReadException);
            transactAndReadException.recycle();
            return a;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
            return false;
        }
    }
}
