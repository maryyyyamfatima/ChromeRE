package org.chromium.components.browser_ui.contacts_picker;

import android.content.Context;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.C7526m33;
import defpackage.P40;
import defpackage.S40;
import java.util.ArrayList;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContactsPickerToolbar extends AbstractViewOnClickListenerC4089c33 {
    public S40 B0;
    public boolean C0;

    public ContactsPickerToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = true;
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void J(C7526m33 c7526m33, int i, int i2, int i3, boolean z) {
        super.J(c7526m33, i, i2, i3, z);
        M(1);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        V();
    }

    public final void V() {
        boolean z = !this.a0.c.isEmpty();
        boolean z2 = z && this.C0;
        ButtonCompat buttonCompat = (ButtonCompat) findViewById(R.id.done);
        buttonCompat.setEnabled(z2);
        if (z2) {
            buttonCompat.setTextAppearance(buttonCompat.getContext(), R.style.f102770_resource_name_obfuscated_res_0x7f150452);
            return;
        }
        buttonCompat.setTextAppearance(buttonCompat.getContext(), R.style.f102690_resource_name_obfuscated_res_0x7f15044a);
        if (!z) {
            M(1);
        } else {
            M(2);
        }
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void L() {
        if (!this.b0) {
            ((P40) this.B0).cancel();
        } else {
            super.L();
        }
    }
}
