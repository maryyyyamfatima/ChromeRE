package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Ro4 extends AbstractC7005kZ3 {
    public static final /* synthetic */ int l = 0;

    public Ro4(Context context, double d, double d2) {
        super(context, d, d2);
        this.a.setContentDescription(getResources().getString(R.string.f65740_resource_name_obfuscated_res_0x7f14012a));
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.setTimeInMillis(System.currentTimeMillis());
        h(k(calendar), calendar.get(3));
        i();
        this.h = null;
    }

    public static Calendar j(int i, int i2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.set(7, 2);
        calendar.set(1, i);
        calendar.set(3, i2);
        return calendar;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final Calendar a(double d) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.setTimeInMillis((long) d);
        return calendar;
    }

    public static int k(Calendar calendar) {
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(3);
        return (i2 != 0 || i3 <= 51) ? (i2 == 11 && i3 == 1) ? i + 1 : i : i - 1;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final void h(int i, int i2) {
        Calendar j = j(i, i2);
        Calendar calendar = this.i;
        if (!j.before(calendar)) {
            Calendar calendar2 = this.j;
            if (j.after(calendar2)) {
                this.k = calendar2;
                return;
            } else {
                this.k = j;
                return;
            }
        }
        this.k = calendar;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int c() {
        return k(this.j);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int e() {
        return k(this.i);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int b(int i) {
        Calendar calendar = this.j;
        if (i == k(calendar)) {
            return calendar.get(3);
        }
        return j(i, 20).getActualMaximum(3);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int d(int i) {
        Calendar calendar = this.i;
        if (i == k(calendar)) {
            return calendar.get(3);
        }
        return 1;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int f() {
        return this.k.get(3);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int g() {
        return k(this.k);
    }
}
