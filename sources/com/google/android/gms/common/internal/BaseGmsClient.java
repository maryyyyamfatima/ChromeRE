package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import defpackage.A01;
import defpackage.AbstractC2444Sv;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC5414fv;
import defpackage.BinderC6444iv;
import defpackage.C10594v01;
import defpackage.C10937w01;
import defpackage.C6612jQ;
import defpackage.C6676jc1;
import defpackage.C7476lv;
import defpackage.C7820mv;
import defpackage.C9228r11;
import defpackage.CY;
import defpackage.D01;
import defpackage.E01;
import defpackage.HandlerC5758gv;
import defpackage.I01;
import defpackage.InterfaceC6102hv;
import defpackage.InterfaceC7008ka1;
import defpackage.InterfaceC7364lc1;
import defpackage.ServiceConnectionC6788jv;
import defpackage.UA1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BaseGmsClient {
    public static final Feature[] C = new Feature[0];
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public I01 g;
    public final Context h;
    public final Looper i;
    public final D01 j;
    public final HandlerC5758gv k;
    public InterfaceC7364lc1 n;
    public InterfaceC6102hv o;
    public IInterface p;
    public ServiceConnectionC6788jv r;
    public final C10594v01 t;
    public final C10937w01 u;
    public final int v;
    public final String w;
    public volatile String x;
    public volatile String f = null;
    public final Object l = new Object();
    public final Object m = new Object();
    public final ArrayList q = new ArrayList();
    public int s = 1;
    public ConnectionResult y = null;
    public boolean z = false;
    public volatile ConnectionInfo A = null;
    public final AtomicInteger B = new AtomicInteger(0);

    public Bundle b() {
        return null;
    }

    public abstract IInterface e(IBinder iBinder);

    public Account f() {
        return null;
    }

    public void h() {
    }

    public abstract String n();

    public abstract String o();

    public String p() {
        return "com.google.android.gms";
    }

    public boolean requiresSignIn() {
        return false;
    }

    public boolean v() {
        return this instanceof C6612jQ;
    }

    public boolean x() {
        return this instanceof UA1;
    }

    public void s(ConnectionResult connectionResult) {
        this.d = connectionResult.g;
        this.e = System.currentTimeMillis();
    }

    public BaseGmsClient(Context context, Looper looper, D01 d01, int i, C10594v01 c10594v01, C10937w01 c10937w01, String str) {
        this.h = context;
        this.i = looper;
        this.j = d01;
        this.k = new HandlerC5758gv(this, looper);
        this.v = i;
        this.t = c10594v01;
        this.u = c10937w01;
        this.w = str;
    }

    public void t(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public final void w(int i, IInterface iInterface) {
        synchronized (this.l) {
            this.s = i;
            this.p = iInterface;
            if (i == 1) {
                ServiceConnectionC6788jv serviceConnectionC6788jv = this.r;
                if (serviceConnectionC6788jv != null) {
                    D01 d01 = this.j;
                    I01 i01 = this.g;
                    String str = i01.a;
                    String str2 = i01.b;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    boolean z = this.g.c;
                    d01.getClass();
                    d01.c(new A01(str, str2, z), serviceConnectionC6788jv);
                    this.r = null;
                }
            } else if (i == 2 || i == 3) {
                d();
            } else if (i == 4) {
                this.c = System.currentTimeMillis();
            }
        }
    }

    public final void d() {
        I01 i01;
        ServiceConnectionC6788jv serviceConnectionC6788jv = this.r;
        AtomicInteger atomicInteger = this.B;
        D01 d01 = this.j;
        Context context = this.h;
        String str = this.w;
        if (serviceConnectionC6788jv != null && (i01 = this.g) != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + i01.a + " on " + i01.b);
            I01 i012 = this.g;
            String str2 = i012.a;
            if (str == null) {
                context.getClass();
            }
            boolean z = this.g.c;
            d01.getClass();
            d01.c(new A01(str2, i012.b, z), serviceConnectionC6788jv);
            atomicInteger.incrementAndGet();
        }
        ServiceConnectionC6788jv serviceConnectionC6788jv2 = new ServiceConnectionC6788jv(this, atomicInteger.get());
        this.r = serviceConnectionC6788jv2;
        String p = p();
        String o = o();
        Object obj = D01.g;
        boolean q = q();
        this.g = new I01(p, o, q);
        if (q && getMinApkVersion() < 17895000) {
            throw new IllegalStateException(AbstractC4809e90.a("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ", this.g.a));
        }
        I01 i013 = this.g;
        String str3 = i013.a;
        if (str == null) {
            str = context.getClass().getName();
        }
        boolean z2 = this.g.c;
        h();
        d01.getClass();
        if (d01.a(new A01(str3, i013.b, z2), serviceConnectionC6788jv2, str, null)) {
            return;
        }
        I01 i014 = this.g;
        Log.w("GmsClient", "unable to connect to service: " + i014.a + " on " + i014.b);
        int i = atomicInteger.get();
        C7820mv c7820mv = new C7820mv(this, 16);
        HandlerC5758gv handlerC5758gv = this.k;
        handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(7, i, -1, c7820mv));
    }

    public static boolean c(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.l) {
            if (baseGmsClient.s != i) {
                return false;
            }
            baseGmsClient.w(i2, iInterface);
            return true;
        }
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.l) {
            z = this.s == 4;
        }
        return z;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.l) {
            int i = this.s;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public void a(String str) {
        this.f = str;
        disconnect();
    }

    public void disconnect() {
        this.B.incrementAndGet();
        synchronized (this.q) {
            try {
                int size = this.q.size();
                for (int i = 0; i < size; i++) {
                    AbstractC5414fv abstractC5414fv = (AbstractC5414fv) this.q.get(i);
                    synchronized (abstractC5414fv) {
                        abstractC5414fv.a = null;
                    }
                }
                this.q.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.m) {
            this.n = null;
        }
        w(1, null);
    }

    public Feature[] k() {
        return C;
    }

    public Feature[] g() {
        return C;
    }

    public Bundle i() {
        return new Bundle();
    }

    public void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        C7476lv c7476lv = new C7476lv(this, i, iBinder, bundle);
        HandlerC5758gv handlerC5758gv = this.k;
        handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(1, i2, -1, c7476lv));
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.l) {
            if (this.s != 5) {
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.p;
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(InterfaceC7008ka1 interfaceC7008ka1, Set set) {
        Bundle i = i();
        int i2 = this.v;
        String str = this.x;
        int i3 = C9228r11.a;
        Scope[] scopeArr = GetServiceRequest.t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.u;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i3, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.i = this.h.getPackageName();
        getServiceRequest.l = i;
        if (set != null) {
            getServiceRequest.k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account f = f();
            if (f == null) {
                f = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.m = f;
            if (interfaceC7008ka1 != 0) {
                getServiceRequest.j = ((AbstractC2444Sv) interfaceC7008ka1).a;
            }
        } else if (v()) {
            getServiceRequest.m = f();
        }
        getServiceRequest.n = k();
        getServiceRequest.o = g();
        if (x()) {
            getServiceRequest.r = true;
        }
        try {
            synchronized (this.m) {
                InterfaceC7364lc1 interfaceC7364lc1 = this.n;
                if (interfaceC7364lc1 != null) {
                    E01.a(interfaceC7364lc1, new BinderC6444iv(this, this.B.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.B.get();
            HandlerC5758gv handlerC5758gv = this.k;
            handlerC5758gv.sendMessage(handlerC5758gv.obtainMessage(6, i4, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.B.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.B.get());
        }
    }

    public Set l() {
        return Collections.emptySet();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        InterfaceC7364lc1 interfaceC7364lc1;
        synchronized (this.l) {
            i = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            interfaceC7364lc1 = this.n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i == 5) {
            printWriter.print("DISCONNECTING");
        } else {
            printWriter.print("UNKNOWN");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) n()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC7364lc1 == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((C6676jc1) interfaceC7364lc1).a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            printWriter.append((CharSequence) str).append("lastConnectedTime=").println(this.c + " " + simpleDateFormat.format(new Date(this.c)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 == 3) {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            } else {
                printWriter.append((CharSequence) String.valueOf(i2));
            }
            printWriter.append(" lastSuspendedTime=").println(this.b + " " + simpleDateFormat.format(new Date(this.b)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CY.a(this.d));
            printWriter.append(" lastFailedTime=").println(this.e + " " + simpleDateFormat.format(new Date(this.e)));
        }
    }

    public int getMinApkVersion() {
        return C9228r11.a;
    }

    public boolean q() {
        return getMinApkVersion() >= 211700000;
    }
}
