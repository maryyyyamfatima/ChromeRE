package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import defpackage.AbstractC7911nA2;
import defpackage.B24;
import defpackage.C1196Jf0;
import defpackage.C2019Po;
import defpackage.C2149Qo;
import defpackage.C4590dX3;
import defpackage.EnumC7223lA2;
import defpackage.J24;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        if (C4590dX3.b == null) {
            synchronized (C4590dX3.class) {
                if (C4590dX3.b == null) {
                    context.getClass();
                    C4590dX3.b = new C1196Jf0(context);
                }
            }
        }
        C2019Po c2019Po = new C2019Po();
        c2019Po.c(EnumC7223lA2.DEFAULT);
        c2019Po.b(queryParameter);
        c2019Po.c(AbstractC7911nA2.b(intValue));
        if (queryParameter2 != null) {
            c2019Po.b = Base64.decode(queryParameter2, 0);
        }
        C1196Jf0 c1196Jf0 = C4590dX3.b;
        if (c1196Jf0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        J24 j24 = ((C4590dX3) c1196Jf0.j.get()).a;
        C2149Qo a2 = c2019Po.a();
        Runnable runnable = new Runnable() { // from class: X7
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
            }
        };
        j24.getClass();
        j24.e.execute(new B24(j24, a2, i, runnable));
    }
}
