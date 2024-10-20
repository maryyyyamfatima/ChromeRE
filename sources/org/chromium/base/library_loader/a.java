package org.chromium.base.library_loader;

import android.os.Build;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a {
    public long a;
    public volatile boolean b;
    public volatile int c = 0;
    public final /* synthetic */ b d;

    public a(b bVar) {
        this.d = bVar;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        if (this.d.l()) {
            boolean z = Build.VERSION.SDK_INT <= 30;
            this.d.d().d(0L, z ? 2 : 0, z);
        }
        this.c = 0;
        this.b = true;
    }

    public final void d(Bundle bundle) {
        if (this.d.l()) {
            d d = this.d.d();
            synchronized (d.a) {
                Linker$LibInfo linker$LibInfo = d.b;
                if (linker$LibInfo != null) {
                    long j = linker$LibInfo.mLoadAddress;
                    if (j != 0) {
                        bundle.putLong("org.chromium.base.android.linker.base_load_address", j);
                    }
                }
            }
        }
    }

    public final void c() {
        boolean z;
        long j;
        long j2;
        long j3;
        if (!this.d.l()) {
            this.b = true;
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            d d = this.d.d();
            synchronized (this.d.j) {
                j3 = this.a;
            }
            d.d(j3, 1, false);
        } else {
            b bVar = this.d;
            synchronized (bVar.j) {
                z = bVar.l;
            }
            if (!z) {
                if (this.c == 1) {
                    d d2 = this.d.d();
                    synchronized (this.d.j) {
                        j2 = this.a;
                    }
                    d2.d(j2, 1, false);
                } else {
                    d d3 = this.d.d();
                    synchronized (this.d.j) {
                        j = this.a;
                    }
                    d3.d(j, 0, false);
                }
            }
        }
        if (this.c != 1) {
            this.c = 2;
        }
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (this.d.l()) {
            d d = this.d.d();
            d.getClass();
            Bundle bundle2 = bundle.getBundle("org.chromium.base.android.linker.shared_relros");
            if (bundle2 == null) {
                return;
            }
            bundle2.setClassLoader(d.class.getClassLoader());
            Linker$LibInfo linker$LibInfo = (Linker$LibInfo) bundle2.getParcelable("libinfo");
            if (linker$LibInfo == null) {
                return;
            }
            synchronized (d.a) {
                Linker$LibInfo linker$LibInfo2 = d.c;
                if (linker$LibInfo2 == null || linker$LibInfo2.mRelroFd == -1) {
                    d.c = linker$LibInfo;
                    int i = d.g;
                    if (i == 3) {
                        d.a(false);
                    } else if (i != 2) {
                        d.a.notifyAll();
                    }
                }
            }
        }
    }

    public final void e(Bundle bundle) {
        Bundle bundle2;
        if (this.d.l()) {
            d d = this.d.d();
            synchronized (d.a) {
                if (d.g == 2) {
                    Linker$LibInfo linker$LibInfo = d.b;
                    linker$LibInfo.getClass();
                    bundle2 = new Bundle();
                    bundle2.putParcelable("libinfo", linker$LibInfo);
                } else {
                    bundle2 = null;
                }
                bundle.putBundle("org.chromium.base.android.linker.shared_relros", bundle2);
            }
        }
    }

    public final String a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? "" : "Child" : "Zygote" : "Browser";
    }
}
