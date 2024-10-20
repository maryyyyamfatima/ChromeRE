package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0941Hg0 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;

    public C0941Hg0(long j, int i, int i2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static C0941Hg0 a(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeInMillis(j);
        int i = gregorianCalendar.get(1);
        int i2 = gregorianCalendar.get(2);
        int i3 = gregorianCalendar.get(5);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.clear();
        calendar.set(i, i2, i3);
        return new C0941Hg0(calendar.getTimeInMillis(), i, i2, i3);
    }
}
