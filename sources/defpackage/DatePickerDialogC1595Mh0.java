package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.DatePicker;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DatePickerDialogC1595Mh0 extends DatePickerDialog {
    public final DatePickerDialog.OnDateSetListener a;

    public DatePickerDialogC1595Mh0(Context context, C10856vm1 c10856vm1, int i, int i2, int i3) {
        super(context, c10856vm1, i, i2, i3);
        this.a = c10856vm1;
    }

    @Override // android.app.DatePickerDialog, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DatePickerDialog.OnDateSetListener onDateSetListener;
        if (i != -1 || (onDateSetListener = this.a) == null) {
            return;
        }
        DatePicker datePicker = getDatePicker();
        datePicker.clearFocus();
        onDateSetListener.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle("");
    }
}
