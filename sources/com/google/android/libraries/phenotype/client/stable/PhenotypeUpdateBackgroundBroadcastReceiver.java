package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver;
import defpackage.AbstractC0952Hi1;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC3082Xs2;
import defpackage.AbstractC5957hW0;
import defpackage.C0;
import defpackage.C2627Uf2;
import defpackage.C7123kt2;
import defpackage.C9349rN3;
import defpackage.CV0;
import defpackage.D0;
import defpackage.EnumC6747jo0;
import defpackage.InterfaceC3299Zk;
import defpackage.InterfaceScheduledExecutorServiceC4493dE1;
import defpackage.OY1;
import defpackage.RQ0;
import defpackage.RunnableC8664pN3;
import defpackage.SY1;
import defpackage.TL2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            final C7123kt2 b = C7123kt2.b(context);
            Map a2 = C2627Uf2.a(context);
            if (((AbstractC0952Hi1) a2).isEmpty()) {
                return;
            }
            final C2627Uf2 c2627Uf2 = (C2627Uf2) ((TL2) a2).get(stringExtra);
            if (c2627Uf2 == null || !AbstractC2373Sg3.a(c2627Uf2.b, 4)) {
                Log.i("PhenotypeBackgroundRecv", "Skipping " + stringExtra + " which doesn't use ProcessStable flags.");
                return;
            }
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            RQ0 x = RQ0.x(AbstractC3082Xs2.b(b).a());
            CV0 cv0 = new CV0() { // from class: Ts2
                @Override // defpackage.CV0
                public final Object apply(Object obj) {
                    E4 e4 = (E4) obj;
                    F2 f2 = F2.m;
                    e4.getClass();
                    String str = stringExtra;
                    str.getClass();
                    OL1 ol1 = e4.j;
                    if (ol1.containsKey(str)) {
                        f2 = (F2) ol1.get(str);
                    }
                    return f2.k;
                }
            };
            Executor a3 = b.a();
            D0 d0 = new D0(x, cv0);
            Executor executor = EnumC6747jo0.a;
            if (a3 != executor) {
                a3 = new OY1(a3, d0);
            }
            x.f(d0, a3);
            final C0 e = AbstractC5957hW0.e(RQ0.x(d0), new InterfaceC3299Zk() { // from class: Nt2
                @Override // defpackage.InterfaceC3299Zk
                public final RD1 apply(Object obj) {
                    String str;
                    List list = (List) obj;
                    int i = PhenotypeUpdateBackgroundBroadcastReceiver.a;
                    final C2627Uf2 c2627Uf22 = C2627Uf2.this;
                    if (!c2627Uf22.e) {
                        list = AbstractC0562Ei1.r("");
                    }
                    C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
                    RV.b(4, "initialCapacity");
                    Object[] objArr = new Object[4];
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        final C7123kt2 c7123kt2 = b;
                        if (hasNext) {
                            final String str2 = (String) it.next();
                            BT2 bt2 = C2567Tt2.c;
                            String str3 = stringExtra;
                            if (!bt2.containsKey(new C7745mi2(str3, str2))) {
                                C3954bg3 c3954bg3 = new C3954bg3(c7123kt2, str3, str2, c2627Uf22.c);
                                if (c2627Uf22.d) {
                                    BT2 bt22 = AbstractC1657Mt2.a;
                                    str = c7123kt2.a.getSharedPreferences("PhenotypeStickyAccount", 0).getString(c2627Uf22.a, "");
                                } else {
                                    str = str2;
                                }
                                final D0 a4 = c3954bg3.a(str);
                                C0 e2 = AbstractC5957hW0.e(AbstractC5957hW0.e(RQ0.x(a4), new IX1(c3954bg3), c7123kt2.a()), new InterfaceC3299Zk() { // from class: Qt2
                                    @Override // defpackage.InterfaceC3299Zk
                                    public final RD1 apply(Object obj2) {
                                        int i3 = PhenotypeUpdateBackgroundBroadcastReceiver.a;
                                        RD1 rd1 = a4;
                                        rd1.isDone();
                                        final C4641dg3 c4641dg3 = (C4641dg3) AbstractC7515m14.a(rd1);
                                        if (!c4641dg3.k.isEmpty()) {
                                            final C2627Uf2 c2627Uf23 = c2627Uf22;
                                            final String str4 = c2627Uf23.a;
                                            final C7123kt2 c7123kt22 = C7123kt2.this;
                                            RQ0 x2 = RQ0.x(AbstractC3082Xs2.b(c7123kt22).a());
                                            CV0 cv02 = new CV0() { // from class: Ws2
                                                @Override // defpackage.CV0
                                                public final Object apply(Object obj3) {
                                                    E4 e4 = (E4) obj3;
                                                    F2 f2 = F2.m;
                                                    e4.getClass();
                                                    String str5 = str4;
                                                    str5.getClass();
                                                    OL1 ol1 = e4.j;
                                                    if (ol1.containsKey(str5)) {
                                                        f2 = (F2) ol1.get(str5);
                                                    }
                                                    return f2.l;
                                                }
                                            };
                                            Executor a5 = c7123kt22.a();
                                            D0 d02 = new D0(x2, cv02);
                                            if (a5 != EnumC6747jo0.a) {
                                                a5 = new OY1(a5, d02);
                                            }
                                            x2.f(d02, a5);
                                            RQ0 x3 = RQ0.x(d02);
                                            final String str5 = str2;
                                            return AbstractC5957hW0.e(x3, new InterfaceC3299Zk() { // from class: Rt2
                                                @Override // defpackage.InterfaceC3299Zk
                                                public final RD1 apply(Object obj3) {
                                                    int i4 = PhenotypeUpdateBackgroundBroadcastReceiver.a;
                                                    String str6 = str5;
                                                    boolean equals = ((String) obj3).equals(str6);
                                                    C9803si1 c9803si1 = C9803si1.g;
                                                    if (!equals || C2567Tt2.c.containsKey(new C7745mi2(c2627Uf23.a, str6))) {
                                                        return c9803si1;
                                                    }
                                                    C5900hK3 c5900hK3 = (C5900hK3) c7123kt22.c.get();
                                                    String str7 = c4641dg3.k;
                                                    C4374ct2 c4374ct2 = c5900hK3.a;
                                                    c4374ct2.getClass();
                                                    C5531gF3 c5531gF3 = new C5531gF3();
                                                    c5531gF3.a = new C3342Zs2(str7);
                                                    AF3 b2 = c4374ct2.b(0, c5531gF3.a());
                                                    C11367xF3 c11367xF3 = new C11367xF3(b2);
                                                    EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
                                                    b2.b(enumC6747jo0, new C11024wF3(c11367xF3));
                                                    return AbstractC5957hW0.a(c11367xF3, C10114td.class, new C5212fK3(), enumC6747jo0);
                                                }
                                            }, c7123kt22.a());
                                        }
                                        return C9803si1.g;
                                    }
                                }, c7123kt2.a());
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, AbstractC11518xi1.b(objArr.length, i3));
                                }
                                objArr[i2] = e2;
                                i2 = i3;
                            }
                        } else {
                            return new C7335lX(AbstractC0562Ei1.n(AbstractC0562Ei1.m(i2, objArr)), false, (Executor) c7123kt2.a(), new Callable() { // from class: Pt2
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i4 = PhenotypeUpdateBackgroundBroadcastReceiver.a;
                                    return null;
                                }
                            });
                        }
                    }
                }
            }, b.a());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            InterfaceScheduledExecutorServiceC4493dE1 a4 = b.a();
            if (!e.isDone()) {
                C9349rN3 c9349rN3 = new C9349rN3(e);
                RunnableC8664pN3 runnableC8664pN3 = new RunnableC8664pN3(c9349rN3);
                c9349rN3.k = ((SY1) a4).schedule(runnableC8664pN3, 50L, timeUnit);
                e.f(runnableC8664pN3, executor);
                e = c9349rN3;
            }
            e.f(new Runnable() { // from class: Ot2
                @Override // java.lang.Runnable
                public final void run() {
                    RQ0 rq0 = RQ0.this;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    int i = PhenotypeUpdateBackgroundBroadcastReceiver.a;
                    try {
                        try {
                            rq0.isDone();
                            AbstractC7515m14.a(rq0);
                            Log.i("PhenotypeBackgroundRecv", "Successfully updated snapshot for " + str);
                        } catch (ExecutionException e2) {
                            Log.w("PhenotypeBackgroundRecv", "Failed to update local snapshot for " + str, e2);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, b.a());
        }
    }
}
