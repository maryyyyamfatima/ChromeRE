package defpackage;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12228zm1 implements TimePickerDialog.OnTimeSetListener {
    public final int a;
    public final /* synthetic */ C0062Am1 b;

    public C12228zm1(C0062Am1 c0062Am1, int i) {
        this.b = c0062Am1;
        this.a = i;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.b.b(this.a, 0, 0, 0, i, i2, 0, 0, 0);
    }
}
