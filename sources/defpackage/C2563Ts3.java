package defpackage;

import android.widget.CompoundButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ts3 */
/* loaded from: classes.dex */
public final class C2563Ts3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AbstractC2693Us3 a;

    public C2563Ts3(AbstractC2693Us3 abstractC2693Us3) {
        this.a = abstractC2693Us3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AbstractC2693Us3 abstractC2693Us3 = this.a;
        if (!abstractC2693Us3.f(valueOf)) {
            compoundButton.setChecked(!z);
        } else {
            abstractC2693Us3.W(z);
        }
    }
}
