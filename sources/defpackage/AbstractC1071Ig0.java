package defpackage;

import android.widget.DatePicker;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ig0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1071Ig0 {
    public static void a(DatePicker datePicker, DatePicker.OnDateChangedListener onDateChangedListener, int i, int i2, int i3, long j, long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.clear();
        calendar.set(i, i2, i3);
        long timeInMillis = calendar.getTimeInMillis();
        C0941Hg0 c0941Hg0 = new C0941Hg0(timeInMillis, i, i2, i3);
        C0941Hg0 a = C0941Hg0.a(j);
        C0941Hg0 a2 = C0941Hg0.a(j2);
        long j3 = a2.a;
        long j4 = a.a;
        if (j3 < j4) {
            a2 = a;
        }
        long j5 = a2.a;
        if (timeInMillis < j4) {
            c0941Hg0 = a;
        } else if (timeInMillis > j5) {
            c0941Hg0 = a2;
        }
        if (j4 > datePicker.getMaxDate()) {
            datePicker.setMaxDate(j5);
            datePicker.setMinDate(j4);
        } else {
            datePicker.setMinDate(j4);
            datePicker.setMaxDate(j5);
        }
        datePicker.init(c0941Hg0.b, c0941Hg0.c, c0941Hg0.d, onDateChangedListener);
    }
}
