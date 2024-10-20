package defpackage;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Am1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0062Am1 {
    public final Context a;
    public boolean b;
    public AlertDialog c;
    public final C2245Rh0 d;

    public C0062Am1(Context context, C2245Rh0 c2245Rh0) {
        this.a = context;
        this.d = c2245Rh0;
    }

    public final void c(int i, double d, double d2, double d3, double d4) {
        Calendar calendar;
        if (Double.isNaN(d)) {
            calendar = Calendar.getInstance();
            calendar.set(14, 0);
        } else if (i == 11) {
            calendar = MY1.j(d);
        } else if (i == 13) {
            int i2 = Ro4.l;
            calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.clear();
            calendar.setFirstDayOfWeek(2);
            calendar.setMinimalDaysInFirstWeek(4);
            calendar.setTimeInMillis((long) d);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.setTimeInMillis((long) d);
            calendar = gregorianCalendar;
        }
        if (i == 8) {
            d(i, calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0, 0, 0, d2, d3, d4);
            return;
        }
        if (i == 12) {
            d(i, 0, 0, 0, calendar.get(11), calendar.get(12), 0, 0, 0, d2, d3, d4);
            return;
        }
        if (i == 9 || i == 10) {
            d(i, calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14), 0, d2, d3, d4);
        } else if (i == 11) {
            d(i, calendar.get(1), calendar.get(2), 0, 0, 0, 0, 0, 0, d2, d3, d4);
        } else if (i == 13) {
            d(i, Ro4.k(calendar), 0, 0, 0, 0, 0, 0, calendar.get(3), d2, d3, d4);
        }
    }

    public final void a() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.c.dismiss();
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, double d3) {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.c.dismiss();
        }
        int i10 = (int) d3;
        Context context = this.a;
        if (i == 8) {
            DatePickerDialogC1595Mh0 datePickerDialogC1595Mh0 = new DatePickerDialogC1595Mh0(this.a, new C10856vm1(this, i), i2, i3, i4);
            AbstractC1071Ig0.a(datePickerDialogC1595Mh0.getDatePicker(), datePickerDialogC1595Mh0, i2, i3, i4, (long) d, (long) d2);
            datePickerDialogC1595Mh0.setTitle(context.getText(R.string.f71980_resource_name_obfuscated_res_0x7f1403e8));
            this.c = datePickerDialogC1595Mh0;
        } else if (i == 12) {
            if (i10 < 0 || i10 >= 60000) {
                Context context2 = this.a;
                this.c = new TimePickerDialog(context2, new C12228zm1(this, i), i5, i6, DateFormat.is24HourFormat(context2));
            } else {
                Context context3 = this.a;
                this.c = new EZ1(context3, i5, i6, i7, i8, (int) d, (int) d2, i10, DateFormat.is24HourFormat(context3), new C11542xm1(this, i));
            }
        } else if (i == 9 || i == 10) {
            Context context4 = this.a;
            this.c = new AlertDialogC2635Uh0(context4, new C11199wm1(this, i), i2, i3, i4, i5, i6, DateFormat.is24HourFormat(context4), d, d2);
        } else if (i == 11) {
            this.c = new NY1(this.a, new C11885ym1(this, i), i2, i3, d, d2);
        } else if (i == 13) {
            this.c = new So4(this.a, new C11885ym1(this, i), i2, i9, d, d2);
        }
        this.c.setButton(-1, context.getText(R.string.f71970_resource_name_obfuscated_res_0x7f1403e7), (DialogInterface.OnClickListener) this.c);
        this.c.setButton(-2, context.getText(android.R.string.cancel), (DialogInterface.OnClickListener) null);
        this.c.setButton(-3, context.getText(R.string.f71950_resource_name_obfuscated_res_0x7f1403e5), new DialogInterfaceOnClickListenerC10170tm1(this));
        this.c.setOnDismissListener(new DialogInterfaceOnDismissListenerC10513um1(this));
        this.b = false;
        this.c.show();
    }

    public final void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.b) {
            return;
        }
        this.b = true;
        C2245Rh0 c2245Rh0 = this.d;
        if (i == 11) {
            c2245Rh0.a(((i2 - 1970) * 12) + i3);
            return;
        }
        if (i == 13) {
            c2245Rh0.a(Ro4.j(i2, i9).getTimeInMillis());
            return;
        }
        if (i == 12) {
            c2245Rh0.a(TimeUnit.SECONDS.toMillis(i7) + TimeUnit.MINUTES.toMillis(i6) + TimeUnit.HOURS.toMillis(i5) + i8);
            return;
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        calendar.set(11, i5);
        calendar.set(12, i6);
        calendar.set(13, i7);
        calendar.set(14, i8);
        c2245Rh0.a(calendar.getTimeInMillis());
    }
}
