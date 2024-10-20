package defpackage;

import android.R;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kZ3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7005kZ3 extends FrameLayout {
    public final NumberPicker a;
    public final NumberPicker g;
    public InterfaceC6661jZ3 h;
    public final Calendar i;
    public final Calendar j;
    public Calendar k;

    public abstract Calendar a(double d);

    public abstract int b(int i);

    public abstract int c();

    public abstract int d(int i);

    public abstract int e();

    public abstract int f();

    public abstract void h(int i, int i2);

    public AbstractC7005kZ3(Context context, double d, double d2) {
        super(context, null, R.attr.datePickerStyle);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.android.chrome.R.layout.f61830_resource_name_obfuscated_res_0x7f0e02db, (ViewGroup) this, true);
        C6319iZ3 c6319iZ3 = new C6319iZ3(this);
        this.k = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = 0;
        if (d >= d2) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            this.i = calendar;
            calendar.set(0, 0, 1);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            this.j = calendar2;
            calendar2.set(9999, 0, 1);
        } else {
            this.i = a(d);
            this.j = a(d2);
        }
        NumberPicker numberPicker = (NumberPicker) findViewById(com.android.chrome.R.id.position_in_year);
        this.a = numberPicker;
        numberPicker.setOnLongPressUpdateInterval(200L);
        numberPicker.setOnValueChangedListener(c6319iZ3);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(com.android.chrome.R.id.year);
        this.g = numberPicker2;
        numberPicker2.setOnLongPressUpdateInterval(100L);
        numberPicker2.setOnValueChangedListener(c6319iZ3);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.android.chrome.R.id.pickers);
        linearLayout.removeView(numberPicker);
        linearLayout.removeView(numberPicker2);
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMdd");
        boolean z = false;
        boolean z2 = false;
        while (i < bestDateTimePattern.length()) {
            char charAt = bestDateTimePattern.charAt(i);
            if (charAt == '\'') {
                i = bestDateTimePattern.indexOf(39, i + 1);
                if (i == -1) {
                    throw new IllegalArgumentException("Bad quoting in ".concat(bestDateTimePattern));
                }
            } else if ((charAt == 'M' || charAt == 'L') && !z) {
                linearLayout.addView(numberPicker);
                z = true;
            } else if (charAt == 'y' && !z2) {
                linearLayout.addView(numberPicker2);
                z2 = true;
            }
            i++;
        }
        if (!z) {
            linearLayout.addView(numberPicker);
        }
        if (z2) {
            return;
        }
        linearLayout.addView(numberPicker2);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.k.getTimeInMillis(), 20));
    }

    public int g() {
        return this.k.get(1);
    }

    public void i() {
        NumberPicker numberPicker = this.a;
        numberPicker.setDisplayedValues(null);
        numberPicker.setMinValue(d(g()));
        numberPicker.setMaxValue(b(g()));
        numberPicker.setWrapSelectorWheel((this.k.equals(this.i) || this.k.equals(this.j)) ? false : true);
        int e = e();
        NumberPicker numberPicker2 = this.g;
        numberPicker2.setMinValue(e);
        numberPicker2.setMaxValue(c());
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setValue(g());
        numberPicker.setValue(f());
    }
}
