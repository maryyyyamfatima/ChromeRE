package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5578gP0 {
    public static C5578gP0 g;
    public boolean a;
    public boolean b;
    public long c;
    public final LinkedList d = new LinkedList();
    public final LinkedList e = new LinkedList();
    public C5234fP0 f;

    public C5578gP0() {
        Object obj = ThreadUtils.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (AX.e().g("policy")) {
            a(elapsedRealtime, true);
            return;
        }
        try {
            C5234fP0 c5234fP0 = new C5234fP0(this, V60.a, elapsedRealtime);
            this.f = c5234fP0;
            QF3 qf3 = QF3.l;
            c5234fP0.e();
            PostTask.b(qf3, c5234fP0.a, 0L);
        } catch (RejectedExecutionException unused) {
            a(elapsedRealtime, false);
        }
    }

    public final void a(long j, boolean z) {
        this.b = z;
        this.a = true;
        if (j > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.c = elapsedRealtime;
            long j2 = elapsedRealtime - j;
            EI2.n(j2, "Enterprise.FirstRun.AppRestrictionLoadTime");
            EI2.k(j2, "Enterprise.FirstRun.AppRestrictionLoadTime.Medium");
            String.format(Locale.US, "Policy received. Runtime: [%d], result: [%s]", Long.valueOf(j2), Boolean.valueOf(z));
        }
        while (true) {
            LinkedList linkedList = this.d;
            if (linkedList.isEmpty()) {
                break;
            } else {
                ((Callback) linkedList.remove()).onResult(Boolean.valueOf(this.b));
            }
        }
        while (true) {
            LinkedList linkedList2 = this.e;
            if (linkedList2.isEmpty()) {
                return;
            } else {
                ((Callback) linkedList2.remove()).onResult(Long.valueOf(this.c));
            }
        }
    }
}
