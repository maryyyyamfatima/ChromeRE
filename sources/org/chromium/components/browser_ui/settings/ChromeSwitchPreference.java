package org.chromium.components.browser_ui.settings;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.AbstractC2693Us3;
import defpackage.AbstractC4871eL1;
import defpackage.C1812Ny2;
import defpackage.InterfaceC4184cL1;
import defpackage.Y50;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeSwitchPreference extends AbstractC2693Us3 {
    public InterfaceC4184cL1 b0;
    public View c0;
    public Integer d0;

    public ChromeSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b0(InterfaceC4184cL1 interfaceC4184cL1) {
        this.b0 = interfaceC4184cL1;
        AbstractC4871eL1.b(interfaceC4184cL1, this);
    }

    @Override // defpackage.AbstractC2693Us3, androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        Integer num;
        super.v(c1812Ny2);
        TextView textView = (TextView) c1812Ny2.v(R.id.title);
        textView.setSingleLine(false);
        if (TextUtils.isEmpty(this.m)) {
            TextView textView2 = (TextView) c1812Ny2.v(R.id.summary);
            textView.setText(textView2.getText());
            textView.setVisibility(0);
            textView2.setVisibility(8);
        }
        View view = c1812Ny2.a;
        this.c0 = view;
        if (view != null && (num = this.d0) != null) {
            view.setBackgroundColor(Y50.b(this.a, num.intValue()).getDefaultColor());
        }
        AbstractC4871eL1.c(this.b0, this, this.c0);
    }

    @Override // androidx.preference.g, androidx.preference.Preference
    public void w() {
        if (AbstractC4871eL1.d(this.b0, this)) {
            return;
        }
        super.w();
    }

    public ChromeSwitchPreference(Context context) {
        super(context, null);
    }
}
