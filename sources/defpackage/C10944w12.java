package defpackage;

import J.N;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10944w12 implements InterfaceC9911t04 {
    public final Map a = Collections.synchronizedMap(new HashMap());

    @Override // defpackage.InterfaceC9911t04
    public final void a(String str, boolean z) {
        long f = f(str);
        g(str, f, N.MtKTTHie(str, f, z));
    }

    @Override // defpackage.InterfaceC9911t04
    public final void c(int i, int i2, int i3, int i4, String str) {
        long f = f(str);
        g(str, f, N.MILRV9Ch(str, f, i, i2, i3, i4));
    }

    @Override // defpackage.InterfaceC9911t04
    public final void e(int i, int i2, int i3, int i4, String str) {
        long f = f(str);
        g(str, f, N.M$oMD214(str, f, i, i2, i3, i4));
    }

    @Override // defpackage.InterfaceC9911t04
    public final void d(int i, String str) {
        long f = f(str);
        g(str, f, N.Mk1ai9mx(str, f, i));
    }

    public final long f(String str) {
        Long l = (Long) this.a.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final void g(String str, long j, long j2) {
        if (j != j2) {
            this.a.put(str, Long.valueOf(j2));
        }
    }

    @Override // defpackage.InterfaceC9911t04
    public final void b(long j, String str) {
        N.MTDsfZGe(str, SystemClock.elapsedRealtime() - j);
    }
}
