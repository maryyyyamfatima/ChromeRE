package defpackage;

import android.widget.NumberPicker;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iZ3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6319iZ3 implements NumberPicker.OnValueChangeListener {
    public final /* synthetic */ AbstractC7005kZ3 a;

    public C6319iZ3(AbstractC7005kZ3 abstractC7005kZ3) {
        this.a = abstractC7005kZ3;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        int i3;
        AbstractC7005kZ3 abstractC7005kZ3 = this.a;
        int g = abstractC7005kZ3.g();
        int f = abstractC7005kZ3.f();
        if (numberPicker != abstractC7005kZ3.a) {
            if (numberPicker != abstractC7005kZ3.g) {
                throw new IllegalArgumentException();
            }
            i3 = f;
        } else if (i == numberPicker.getMaxValue() && i2 == numberPicker.getMinValue()) {
            i2 = g + 1;
            i3 = abstractC7005kZ3.d(i2);
        } else if (i == numberPicker.getMinValue() && i2 == numberPicker.getMaxValue()) {
            i2 = g - 1;
            i3 = abstractC7005kZ3.b(i2);
        } else {
            i3 = i2;
            i2 = g;
        }
        abstractC7005kZ3.h(i2, i3);
        abstractC7005kZ3.i();
        abstractC7005kZ3.sendAccessibilityEvent(4);
        InterfaceC6661jZ3 interfaceC6661jZ3 = abstractC7005kZ3.h;
        if (interfaceC6661jZ3 != null) {
            int g2 = abstractC7005kZ3.g();
            int f2 = abstractC7005kZ3.f();
            AbstractC7005kZ3 abstractC7005kZ32 = ((AbstractAlertDialogC7349lZ3) interfaceC6661jZ3).a;
            abstractC7005kZ32.h(g2, f2);
            abstractC7005kZ32.i();
            abstractC7005kZ32.h = null;
        }
    }
}
