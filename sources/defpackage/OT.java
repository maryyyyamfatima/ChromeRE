package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OT extends AbstractC7856n11 implements PT {
    public final InterfaceC0209Bp3 k;

    public final void f(final BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            new AF3().n(Status.k);
            return;
        }
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: KT
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                OT.this.getClass();
                LT lt = new LT((C6905kF3) obj2);
                C3121Ya1 c3121Ya1 = (C3121Ya1) ((InterfaceC3578ab1) ((QT) obj).m());
                Parcel a = c3121Ya1.a();
                AbstractC11786yV.c(a, lt);
                AbstractC11786yV.b(a, batchedLogErrorParcelable);
                c3121Ya1.M0(8, a);
            }
        };
        c5531gF3.c = new Feature[]{HI0.a};
        c5531gF3.b = false;
        b(2, c5531gF3.a());
    }

    static {
        new AtomicBoolean(false);
    }

    public OT(Context context, InterfaceC0209Bp3 interfaceC0209Bp3) {
        super(context, IT.m, new C10457ud());
        this.k = interfaceC0209Bp3;
    }

    public static LogEventParcelable g(FT ft) {
        int i;
        IT it = ft.a;
        String str = it.c;
        Context context = it.b;
        int i2 = -1;
        if (IT.p == -1) {
            synchronized (IT.class) {
                if (IT.p == -1) {
                    try {
                        IT.p = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("ClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        int i3 = IT.p;
        String str2 = ft.j;
        String str3 = ft.i;
        int i4 = ft.k;
        ft.a.getClass();
        IT it2 = ft.a;
        boolean z = it2.e;
        EnumSet enumSet = it2.d;
        boolean contains = enumSet.contains(EnumC1717Nf2.g);
        boolean equals = enumSet.equals(EnumC1717Nf2.j);
        int b = AbstractC2373Sg3.b(i4);
        if (enumSet.equals(EnumC1717Nf2.i)) {
            i = 0;
        } else {
            Iterator it3 = enumSet.iterator();
            while (it3.hasNext()) {
                i2 &= ~((EnumC1717Nf2) it3.next()).a;
            }
            i = i2;
        }
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(str, i3, -1, str3, contains, str2, equals, b, null, z, i);
        YT yt = (YT) ft.c.j();
        InterfaceC0209Bp3 interfaceC0209Bp3 = ft.b;
        MU mu = ft.e;
        int[] a = IT.a(null);
        ArrayList arrayList = ft.f;
        LogEventParcelable logEventParcelable = new LogEventParcelable(playLoggerContext, yt, interfaceC0209Bp3, mu, a, arrayList != null ? (String[]) arrayList.toArray(IT.n) : null, IT.a(ft.g), ft.h);
        YT yt2 = logEventParcelable.r;
        JX0 jx0 = (JX0) yt2.l(PX0.NEW_BUILDER);
        jx0.m(yt2);
        WT wt = (WT) jx0;
        if (logEventParcelable.a != null && yt2.r.size() == 0) {
            AbstractC4147cE abstractC4147cE = (AbstractC4147cE) logEventParcelable.a.get();
            if (wt.h) {
                wt.l();
                wt.h = false;
            }
            YT yt3 = (YT) wt.g;
            yt3.getClass();
            abstractC4147cE.getClass();
            yt3.k |= 1024;
            yt3.r = abstractC4147cE;
        }
        if (logEventParcelable.g != null) {
            if (yt2.x.size() == 0) {
                ZD c = logEventParcelable.g.c();
                if (wt.h) {
                    wt.l();
                    wt.h = false;
                }
                YT yt4 = (YT) wt.g;
                yt4.getClass();
                yt4.k |= 262144;
                yt4.x = c;
            }
        }
        YT yt5 = (YT) wt.j();
        logEventParcelable.r = yt5;
        logEventParcelable.i = yt5.toByteArray();
        return logEventParcelable;
    }
}
