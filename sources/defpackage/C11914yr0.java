package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11914yr0 {
    public boolean c;
    public boolean e;
    public boolean f;
    public C10542ur0 g;
    public final Handler a = new Handler();
    public final RunnableC10885vr0 b = new RunnableC10885vr0(this);
    public int d = -1;
    public final HashMap h = new HashMap();
    public final ServiceConnectionC11228wr0 i = new ServiceConnectionC11228wr0(this);

    public final void d(int i, int i2, Notification notification, Context context) {
        if (i != 0) {
            AbstractC4851eH1.f("DownloadFg", AbstractC0800Ge.a("updateDownloadStatus status: ", i, ", id: ", i2), new Object[0]);
        }
        this.h.put(Integer.valueOf(i2), new C11571xr0(i2, i, notification, context));
        b(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:            if ((((defpackage.C11571xr0) r0.get(java.lang.Integer.valueOf(r11.d))).c == 0) == false) goto L100;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r12) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11914yr0.b(boolean):void");
    }

    public final void a() {
        Iterator it = this.h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!(((C11571xr0) entry.getValue()).c == 0) && ((C11571xr0) entry.getValue()).a != this.d) {
                it.remove();
            }
        }
    }

    public final void c(C11571xr0 c11571xr0) {
        StringBuilder sb = new StringBuilder("startOrUpdateForegroundService id: ");
        int i = c11571xr0.a;
        sb.append(i);
        sb.append(", startForeground() Called: ");
        sb.append(this.f);
        AbstractC4851eH1.f("DownloadFg", sb.toString(), new Object[0]);
        int i2 = Build.VERSION.SDK_INT;
        Notification notification = c11571xr0.b;
        if (i2 >= 26 && notification == null && !this.f) {
            notification = X72.a("downloads", new C7893n72(0, null, i)).c();
        }
        if (this.g == null || i == -1 || notification == null) {
            return;
        }
        C11571xr0 c11571xr02 = (C11571xr0) this.h.get(Integer.valueOf(this.d));
        Notification notification2 = c11571xr02 != null ? c11571xr02.b : null;
        boolean z = c11571xr02 != null && c11571xr02.c == 3;
        C10542ur0 c10542ur0 = this.g;
        int i3 = this.d;
        c10542ur0.getClass();
        AbstractC4851eH1.f("DownloadFg", "startOrUpdateForegroundService new: " + i + ", old: " + i3 + ", kill old: " + z, new Object[0]);
        if (i3 == -1 && notification2 == null) {
            c10542ur0.h(i, notification);
        } else if (i2 >= 24) {
            c10542ur0.i(z ? 1 : 2);
            c10542ur0.h(i, notification);
        } else {
            c10542ur0.h(i, notification);
            if (!z && i3 != -1 && notification2 != null) {
                c10542ur0.c.notify(i3, notification2);
            }
        }
        if (i3 == -1) {
            List list = AbstractC2820Vs0.a;
            if (b.n.f()) {
                EI2.h(0, 3, "Android.DownloadManager.ForegroundServiceLifecycle");
            }
        } else if (i3 != i) {
            List list2 = AbstractC2820Vs0.a;
            if (b.n.f()) {
                EI2.h(1, 3, "Android.DownloadManager.ForegroundServiceLifecycle");
            }
        }
        this.f = true;
        this.d = i;
    }
}
