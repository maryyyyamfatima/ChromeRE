package org.chromium.components.browser_ui.photo_picker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.android.chrome.R;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.C7526m33;
import defpackage.DialogC3693au2;
import defpackage.InterfaceC4380cu2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PhotoPickerToolbar extends AbstractViewOnClickListenerC4089c33 {
    public InterfaceC4380cu2 B0;

    public PhotoPickerToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        A(R.string.0_resource_name_obfuscated_res_0x7f140362);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void L() {
        super.L();
        ((DialogC3693au2) this.B0).cancel();
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void J(C7526m33 c7526m33, int i, int i2, int i3, boolean z) {
        super.J(c7526m33, i, i2, i3, z);
        M(1);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        int size = arrayList.size();
        Button button = (Button) findViewById(R.id.done);
        button.setEnabled(arrayList.size() > 0);
        if (size > 0) {
            button.setTextAppearance(button.getContext(), R.style.f102770_resource_name_obfuscated_res_0x7f150452);
        } else {
            button.setTextAppearance(button.getContext(), R.style.f102690_resource_name_obfuscated_res_0x7f15044a);
            M(1);
        }
    }
}
