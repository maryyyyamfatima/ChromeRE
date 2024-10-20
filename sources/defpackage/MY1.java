package defpackage;

import android.content.Context;
import android.widget.NumberPicker;
import com.android.chrome.R;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MY1 extends AbstractC7005kZ3 {
    public final String[] l;

    public MY1(Context context, double d, double d2) {
        super(context, d, d2);
        this.a.setContentDescription(getResources().getString(R.string.f65730_resource_name_obfuscated_res_0x7f140129));
        String[] shortMonths = DateFormatSymbols.getInstance(Locale.getDefault()).getShortMonths();
        this.l = shortMonths;
        if (Character.isDigit(shortMonths[0].charAt(0))) {
            int i = 0;
            while (true) {
                String[] strArr = this.l;
                if (i >= strArr.length) {
                    break;
                }
                int i2 = i + 1;
                strArr[i] = String.format("%d", Integer.valueOf(i2));
                i = i2;
            }
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        h(calendar.get(1), calendar.get(2));
        i();
        this.h = null;
    }

    public static Calendar j(double d) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set((int) Math.min((d / 12.0d) + 1970.0d, 2.147483647E9d), (int) (d % 12.0d), 1);
        return calendar;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final Calendar a(double d) {
        return j(d);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final void h(int i, int i2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(i, i2, 1);
        Calendar calendar2 = this.i;
        if (!calendar.before(calendar2)) {
            Calendar calendar3 = this.j;
            if (calendar.after(calendar3)) {
                this.k = calendar3;
                return;
            } else {
                this.k = calendar;
                return;
            }
        }
        this.k = calendar2;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final void i() {
        super.i();
        NumberPicker numberPicker = this.a;
        numberPicker.setDisplayedValues((String[]) Arrays.copyOfRange(this.l, numberPicker.getMinValue(), numberPicker.getMaxValue() + 1));
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int c() {
        return this.j.get(1);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int e() {
        return this.i.get(1);
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int b(int i) {
        Calendar calendar = this.j;
        if (i == calendar.get(1)) {
            return calendar.get(2);
        }
        return 11;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int d(int i) {
        Calendar calendar = this.i;
        if (i == calendar.get(1)) {
            return calendar.get(2);
        }
        return 0;
    }

    @Override // defpackage.AbstractC7005kZ3
    public final int f() {
        return this.k.get(2);
    }
}
