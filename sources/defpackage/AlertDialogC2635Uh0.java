package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import com.android.chrome.R;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AlertDialogC2635Uh0 extends AlertDialog implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {
    public final DatePicker a;
    public final TimePicker g;
    public final C11199wm1 h;
    public final long i;
    public final long j;

    public AlertDialogC2635Uh0(Context context, C11199wm1 c11199wm1, int i, int i2, int i3, int i4, int i5, boolean z, double d, double d2) {
        super(context, 0);
        long j = (long) d;
        this.i = j;
        long j2 = (long) d2;
        this.j = j2;
        this.h = c11199wm1;
        setButton(-1, context.getText(R.string.f71970_resource_name_obfuscated_res_0x7f1403e7), this);
        setButton(-2, context.getText(android.R.string.cancel), (DialogInterface.OnClickListener) null);
        setIcon(0);
        setTitle(context.getText(R.string.f71990_resource_name_obfuscated_res_0x7f1403e9));
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f56910_resource_name_obfuscated_res_0x7f0e00bc, (ViewGroup) null);
        setView(inflate);
        DatePicker datePicker = (DatePicker) inflate.findViewById(R.id.date_picker);
        this.a = datePicker;
        AbstractC1071Ig0.a(datePicker, this, i, i2, i3, j, j2);
        TimePicker timePicker = (TimePicker) inflate.findViewById(R.id.time_picker);
        this.g = timePicker;
        timePicker.setIs24HourView(Boolean.valueOf(z));
        timePicker.setCurrentHour(Integer.valueOf(i4));
        timePicker.setCurrentMinute(Integer.valueOf(i5));
        timePicker.setOnTimeChangedListener(this);
        onTimeChanged(timePicker, timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C11199wm1 c11199wm1 = this.h;
        if (c11199wm1 != null) {
            DatePicker datePicker = this.a;
            datePicker.clearFocus();
            TimePicker timePicker = this.g;
            timePicker.clearFocus();
            c11199wm1.b.b(c11199wm1.a, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue(), 0, 0, 0);
        }
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        TimePicker timePicker = this.g;
        if (timePicker != null) {
            onTimeChanged(timePicker, timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
        }
    }

    @Override // android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        DatePicker datePicker = this.a;
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.clear();
        TimePicker timePicker2 = this.g;
        gregorianCalendar.set(year, month, dayOfMonth, timePicker2.getCurrentHour().intValue(), timePicker2.getCurrentMinute().intValue(), 0);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        long j = this.i;
        if (timeInMillis < j) {
            gregorianCalendar.setTimeInMillis(j);
        } else {
            long timeInMillis2 = gregorianCalendar.getTimeInMillis();
            long j2 = this.j;
            if (timeInMillis2 > j2) {
                gregorianCalendar.setTimeInMillis(j2);
            }
        }
        timePicker2.setCurrentHour(Integer.valueOf(gregorianCalendar.get(11)));
        timePicker2.setCurrentMinute(Integer.valueOf(gregorianCalendar.get(12)));
    }
}
