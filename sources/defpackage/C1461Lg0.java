package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1461Lg0 extends AbstractC2500Tg0 {
    public final long c;

    public C1461Lg0(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.c = calendar.getTime().getTime();
    }

    @Override // defpackage.AbstractC2500Tg0
    public final long b() {
        return this.c;
    }

    @Override // defpackage.AbstractC2500Tg0
    public final long a() {
        Date date = new Date(this.c);
        UE.a().setTime(date);
        return (r1.get(1) << 16) + r1.get(6);
    }
}
