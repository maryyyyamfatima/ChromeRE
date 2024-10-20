package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10856vm1 implements DatePickerDialog.OnDateSetListener {
    public final int a;
    public final /* synthetic */ C0062Am1 b;

    public C10856vm1(C0062Am1 c0062Am1, int i) {
        this.b = c0062Am1;
        this.a = i;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.b.b(this.a, i, i2, i3, 0, 0, 0, 0, 0);
    }
}
