package org.chromium.content.browser;

import J.N;
import android.os.Process;
import defpackage.AbstractC9771sd;
import defpackage.EI2;
import defpackage.EL2;
import defpackage.T22;
import defpackage.V60;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BackgroundSyncNetworkObserver implements T22 {
    public static BackgroundSyncNetworkObserver e;
    public a a;
    public final ArrayList b;
    public int c;
    public boolean d;

    @Override // defpackage.T22
    public final void a(int i) {
    }

    @Override // defpackage.T22
    public final void c(long j) {
    }

    @Override // defpackage.T22
    public final void e(int i) {
    }

    @Override // defpackage.T22
    public final void f(long[] jArr) {
    }

    public BackgroundSyncNetworkObserver() {
        Object obj = ThreadUtils.a;
        this.b = new ArrayList();
    }

    public static BackgroundSyncNetworkObserver createObserver(long j) {
        Object obj = ThreadUtils.a;
        if (e == null) {
            e = new BackgroundSyncNetworkObserver();
        }
        BackgroundSyncNetworkObserver backgroundSyncNetworkObserver = e;
        backgroundSyncNetworkObserver.getClass();
        if (!(AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, "android.permission.ACCESS_NETWORK_STATE") == 0)) {
            EI2.b("BackgroundSync.NetworkObserver.HasPermission", false);
        } else {
            if (backgroundSyncNetworkObserver.a == null) {
                backgroundSyncNetworkObserver.a = new a(backgroundSyncNetworkObserver, new EL2());
                EI2.b("BackgroundSync.NetworkObserver.HasPermission", true);
            }
            backgroundSyncNetworkObserver.b.add(Long.valueOf(j));
            N.MJIG3QvD(j, backgroundSyncNetworkObserver, backgroundSyncNetworkObserver.a.d().b());
        }
        return e;
    }

    public final void removeObserver(long j) {
        a aVar;
        Object obj = ThreadUtils.a;
        ArrayList arrayList = this.b;
        arrayList.remove(Long.valueOf(j));
        if (arrayList.size() != 0 || (aVar = this.a) == null) {
            return;
        }
        aVar.e.a();
        aVar.f();
        this.a = null;
    }

    public final void h(int i) {
        if (this.d && i == this.c) {
            return;
        }
        this.d = true;
        this.c = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            N.MJIG3QvD(((Long) it.next()).longValue(), this, i);
        }
    }

    @Override // defpackage.T22
    public final void b(int i) {
        Object obj = ThreadUtils.a;
        h(i);
    }

    @Override // defpackage.T22
    public final void d(int i, long j) {
        Object obj = ThreadUtils.a;
        h(this.a.d().b());
    }

    @Override // defpackage.T22
    public final void g(long j) {
        Object obj = ThreadUtils.a;
        h(this.a.d().b());
    }
}
