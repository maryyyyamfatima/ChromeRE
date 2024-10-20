package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC5177fD3;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.LN3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class TabSelectionEditorToolbar extends AbstractViewOnClickListenerC4089c33 {
    public static final List F0 = Collections.emptyList();
    public Button B0;
    public Integer C0;
    public int D0;
    public int E0;

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void M(int i) {
    }

    public TabSelectionEditorToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = 2;
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LN3 b = LN3.b(getContext(), R.drawable.f46950_resource_name_obfuscated_res_0x7f0901bf);
        b.setTint(AbstractC10957w33.d(getContext()));
        C(b);
        A(AbstractC5177fD3.c() ? R.string.f66380_resource_name_obfuscated_res_0x7f14016c : R.string.f70680_resource_name_obfuscated_res_0x7f140362);
        this.B0 = (Button) findViewById(R.id.action_button);
        this.i0.k = R.string.f88870_resource_name_obfuscated_res_0x7f140b17;
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        int size = arrayList.size();
        boolean z = size >= this.E0;
        this.B0.setEnabled(z);
        this.B0.setContentDescription((!z || this.C0 == null) ? null : getContext().getResources().getQuantityString(this.C0.intValue(), size, Integer.valueOf(size)));
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void O() {
        R(F0, true);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void R(List list, boolean z) {
        super.R(list, z);
        int i = this.D0;
        if (i != 0) {
            setBackgroundColor(i);
        }
    }
}
