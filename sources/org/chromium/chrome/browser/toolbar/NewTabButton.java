package org.chromium.chrome.browser.toolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.C10501uk1;
import defpackage.C1096Il0;
import defpackage.C11674y84;
import defpackage.InterfaceC10158tk1;
import defpackage.Y50;
import defpackage.ZN3;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NewTabButton extends ChromeImageButton implements InterfaceC10158tk1, View.OnLongClickListener {
    public final ColorStateList i;
    public final ColorStateList j;
    public final boolean k;
    public C10501uk1 l;
    public boolean m;
    public boolean n;
    public boolean o;

    public NewTabButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.i = Y50.b(getContext(), R.color.f17820_resource_name_obfuscated_res_0x7f070122);
        this.j = Y50.b(getContext(), R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
        setImageDrawable(C11674y84.b(getContext().getResources(), R.drawable.f51760_resource_name_obfuscated_res_0x7f0903de, getContext().getTheme()));
        this.k = DeviceFormFactor.a(context);
        d();
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ZN3.e(getContext(), view, getResources().getString(this.m ? R.string.f69670_resource_name_obfuscated_res_0x7f1402c8 : R.string.f69680_resource_name_obfuscated_res_0x7f1402c9));
    }

    @Override // defpackage.InterfaceC10158tk1
    public final void b(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        setContentDescription(getResources().getText(z ? R.string.f66710_resource_name_obfuscated_res_0x7f140191 : R.string.f66720_resource_name_obfuscated_res_0x7f140192));
        d();
        invalidate();
    }

    public final void d() {
        setImageTintList(this.k || ((C1096Il0.a(getContext()) || this.n || this.o) && this.m) ? this.i : this.j);
    }
}
