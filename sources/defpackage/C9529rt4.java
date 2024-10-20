package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9529rt4 implements Qv4, InterfaceC12279zu4 {
    public final Context b;
    public final HandlerC4039bu4 c;
    public IInterface d;
    public final ArrayList e;
    public final ArrayList h;
    public ServiceConnectionC9535ru4 j;
    public final String l;
    public final String m;
    public final String n;
    public boolean o;
    public final ArrayList f = new ArrayList();
    public boolean g = false;
    public final ArrayList i = new ArrayList();
    public boolean k = false;

    public C9529rt4(VS0 vs0, String str, String str2, String str3, Kw4 kw4, Mw4 mw4) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.b = vs0;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        Su4.a(kw4);
        arrayList.add(kw4);
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        Su4.a(mw4);
        arrayList2.add(mw4);
        this.c = new HandlerC4039bu4(this);
        if (str == null) {
            throw new NullPointerException("developerKey cannot be null");
        }
        this.l = str;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("App package name cannot be null or empty");
        }
        this.m = str2;
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("App versionName cannot be null or empty");
        }
        this.n = str3;
    }

    @Override // defpackage.Qv4
    public final IBinder a() {
        i();
        if (this.o) {
            throw new IllegalStateException("Connection client has been released");
        }
        try {
            i();
            Iw4 iw4 = (Iw4) this.d;
            Parcel e = iw4.e(1, iw4.a());
            IBinder readStrongBinder = e.readStrongBinder();
            e.recycle();
            return readStrongBinder;
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // defpackage.Qv4
    public final IBinder b() {
        i();
        if (this.o) {
            throw new IllegalStateException("Connection client has been released");
        }
        try {
            i();
            Iw4 iw4 = (Iw4) this.d;
            Parcel e = iw4.e(4, iw4.a());
            IBinder readStrongBinder = e.readStrongBinder();
            e.recycle();
            return readStrongBinder;
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // defpackage.InterfaceC12279zu4
    public final void c() {
        if (!this.o) {
            if (this.d != null) {
                try {
                    i();
                    Iw4 iw4 = (Iw4) this.d;
                    Parcel a = iw4.a();
                    int i = AbstractC5419fv4.a;
                    a.writeInt(1);
                    iw4.h(3, a);
                } catch (RemoteException unused) {
                }
                this.o = true;
            }
        }
        f();
        this.c.removeMessages(4);
        synchronized (this.e) {
            this.g = true;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.k; i2++) {
                if (this.e.contains(arrayList.get(i2))) {
                    ((Kw4) arrayList.get(i2)).b();
                }
            }
            this.g = false;
        }
        this.k = false;
        synchronized (this.i) {
            int size2 = this.i.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C4725du4 c4725du4 = (C4725du4) this.i.get(i3);
                synchronized (c4725du4) {
                    c4725du4.a = null;
                }
            }
            this.i.clear();
        }
    }

    @Override // defpackage.InterfaceC12279zu4
    public final boolean d() {
        return this.j != null && this.d == null;
    }

    public final void e(Is4 is4) {
        this.c.removeMessages(4);
        f();
        synchronized (this.h) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.k; i++) {
                if (this.h.contains(arrayList.get(i))) {
                    Mw4 mw4 = (Mw4) arrayList.get(i);
                    Kv4 kv4 = Qv4.a;
                    C6781jt4 c6781jt4 = mw4.a;
                    c6781jt4.l = kv4;
                    C8844pt4 c8844pt4 = c6781jt4.h;
                    if (c8844pt4 != null) {
                        c8844pt4.a.setVisibility(8);
                        c8844pt4.g.setVisibility(0);
                    }
                    Cv4 cv4 = c6781jt4.b;
                    Cv4 cv42 = C6781jt4.r;
                    if (cv4 != cv42) {
                        c6781jt4.b = cv42;
                        synchronized (cv4) {
                            cv4.e(is4);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void f() {
        ServiceConnectionC9535ru4 serviceConnectionC9535ru4 = this.j;
        if (serviceConnectionC9535ru4 != null) {
            try {
                this.b.unbindService(serviceConnectionC9535ru4);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.d = null;
        this.j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:            if (r3.getApplicationInfo(r4, 0).enabled == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:            r1 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:            r1 = defpackage.Is4.SERVICE_DISABLED;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r10 = this;
            Is4 r0 = defpackage.Is4.SUCCESS
            r1 = 1
            r10.k = r1
            android.content.Context r2 = r10.b
            byte[][] r3 = defpackage.Cs4.a
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            java.lang.String r4 = defpackage.Ru4.a(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            r5 = 64
            android.content.pm.PackageInfo r5 = r3.getPackageInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            boolean r5 = defpackage.Cs4.a(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            if (r5 == 0) goto L5a
            r5 = 0
            android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            android.content.res.Resources r6 = r6.getResourcesForApplication(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            java.lang.String r7 = "com.google.android.youtube.googletvdev"
            boolean r7 = r4.equals(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            if (r7 == 0) goto L31
            java.lang.String r7 = "com.google.android.youtube.googletv"
            goto L32
        L31:
            r7 = r4
        L32:
            java.lang.String r8 = "youtube_api_version_code"
            java.lang.String r9 = "integer"
            int r7 = r6.getIdentifier(r8, r9, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            if (r7 == 0) goto L48
            int r6 = r6.getInteger(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            int r6 = r6 / 100
            r7 = 111(0x6f, float:1.56E-43)
            if (r6 >= r7) goto L47
            goto L48
        L47:
            r1 = r5
        L48:
            if (r1 != 0) goto L57
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            boolean r1 = r1.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            if (r1 == 0) goto L54
            r1 = r0
            goto L5f
        L54:
            Is4 r1 = defpackage.Is4.SERVICE_DISABLED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            goto L5f
        L57:
            Is4 r1 = defpackage.Is4.SERVICE_VERSION_UPDATE_REQUIRED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            goto L5f
        L5a:
            Is4 r1 = defpackage.Is4.SERVICE_INVALID     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            goto L5f
        L5d:
            Is4 r1 = defpackage.Is4.SERVICE_MISSING
        L5f:
            bu4 r3 = r10.c
            r4 = 3
            if (r1 == r0) goto L69
            android.os.Message r0 = r3.obtainMessage(r4, r1)
            goto L9b
        L69:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.youtube.api.service.START"
            r0.<init>(r1)
            java.lang.String r1 = defpackage.Ru4.a(r2)
            android.content.Intent r0 = r0.setPackage(r1)
            ru4 r1 = r10.j
            if (r1 == 0) goto L86
            java.lang.String r1 = "YouTubeClient"
            java.lang.String r5 = "Calling connect() while still connected, missing disconnect()."
            android.util.Log.e(r1, r5)
            r10.f()
        L86:
            ru4 r1 = new ru4
            r1.<init>(r10)
            r10.j = r1
            r5 = 129(0x81, float:1.81E-43)
            boolean r0 = r2.bindService(r0, r1, r5)
            if (r0 != 0) goto L9e
            Is4 r0 = defpackage.Is4.ERROR_CONNECTING_TO_SERVICE
            android.os.Message r0 = r3.obtainMessage(r4, r0)
        L9b:
            r3.sendMessage(r0)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9529rt4.g():void");
    }

    public final void h() {
        synchronized (this.e) {
            if (!(!this.g)) {
                throw new IllegalStateException();
            }
            this.c.removeMessages(4);
            this.g = true;
            if (!(this.f.size() == 0)) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size && this.k; i++) {
                if (!(this.d != null)) {
                    break;
                }
                if (!this.f.contains(arrayList.get(i))) {
                    ((Kw4) arrayList.get(i)).a();
                }
            }
            this.f.clear();
            this.g = false;
        }
    }

    public final void i() {
        if (!(this.d != null)) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
