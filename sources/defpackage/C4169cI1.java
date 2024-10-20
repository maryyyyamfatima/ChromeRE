package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4169cI1 implements SM3 {
    public final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.SM3
    public final void b(int i, String str) {
    }

    @Override // defpackage.SM3
    public final String d() {
        return "";
    }

    @Override // defpackage.SM3
    public final int a(int i, String str, C1240Jo c1240Jo) {
        int incrementAndGet = this.b.incrementAndGet();
        e(i, str, incrementAndGet, c1240Jo);
        return incrementAndGet;
    }

    @Override // defpackage.SM3
    public final void e(int i, String str, int i2, C1240Jo c1240Jo) {
        String str2;
        String str3;
        int i3;
        long j;
        C1500Lo c1500Lo = c1240Jo.f;
        str2 = "Empty";
        boolean z = false;
        long j2 = 0;
        if (c1500Lo != null) {
            AbstractC1472Li1 abstractC1472Li1 = c1500Lo.a;
            str2 = abstractC1472Li1 != null ? new C1007Ht1(", ").b(abstractC1472Li1) : "Empty";
            C10020tK3 c10020tK3 = c1500Lo.b;
            boolean z2 = c10020tK3.a;
            Integer num = c1500Lo.d;
            int intValue = num != null ? num.intValue() : 0;
            j = c10020tK3.b;
            str3 = c1500Lo.c;
            i3 = intValue;
            z = z2;
        } else {
            str3 = "";
            i3 = 0;
            j = 0;
        }
        Long l = c1240Jo.c;
        Long l2 = c1240Jo.b;
        Long l3 = c1240Jo.d;
        if (l3 == null && l2 != null && l != null) {
            j2 = l.longValue() - l2.longValue();
        } else if (l3 != null) {
            j2 = l3.longValue();
        }
        Log.println(3, "LogcatTimeSpanLogger", "EmlLogTag: " + i + ", Action Name: " + c1240Jo.a + ", Start Time: " + l2 + ", End Time: " + l + ", Span Length: " + j2 + ", isMainThread: " + z + ", threadId: " + j + ", Template Uris: " + str2 + ", commandId: " + i3 + ", NodeId: " + str3 + ", spanId: " + i2 + ", parentSpanId: " + c1240Jo.e);
    }

    @Override // defpackage.SM3
    public final int c() {
        return this.b.incrementAndGet();
    }
}
