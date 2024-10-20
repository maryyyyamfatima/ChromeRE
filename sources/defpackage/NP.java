package defpackage;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NP extends HP {
    public final C10194tq1 a = new C10194tq1(V60.a);

    @Override // defpackage.HP
    public final void a() {
        PostTask.c(QF3.g, new Runnable() { // from class: IP
            @Override // java.lang.Runnable
            public final void run() {
                NP np = NP.this;
                np.getClass();
                SystemClock.elapsedRealtime();
                final C10194tq1 c10194tq1 = np.a;
                c10194tq1.getClass();
                C5531gF3 c5531gF3 = new C5531gF3();
                c5531gF3.a = new InterfaceC5565gM2() { // from class: qq1
                    @Override // defpackage.InterfaceC5565gM2
                    public final void accept(Object obj, Object obj2) {
                        C10194tq1.this.getClass();
                        BinderC9851sq1 binderC9851sq1 = new BinderC9851sq1((C6905kF3) obj2);
                        C5302fc1 c5302fc1 = (C5302fc1) ((InterfaceC5990hc1) ((F01) obj).m());
                        Parcel a = c5302fc1.a();
                        AbstractC11786yV.c(a, binderC9851sq1);
                        c5302fc1.h(1, a);
                    }
                };
                c5531gF3.c = new Feature[]{LI0.a};
                c5531gF3.b = false;
                c5531gF3.d = 13801;
                AF3 b = c10194tq1.b(0, c5531gF3.a());
                b.c(new LP(np));
                b.e(new MP(np));
            }
        });
    }
}
