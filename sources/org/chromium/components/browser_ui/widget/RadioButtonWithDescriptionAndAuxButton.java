package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import com.android.chrome.R;
import defpackage.RG2;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionAndAuxButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RadioButtonWithDescriptionAndAuxButton extends RadioButtonWithDescription {
    public RG2 l;
    public ImageButton m;

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final int b() {
        return R.layout.f57450_resource_name_obfuscated_res_0x7f0e00fa;
    }

    public RadioButtonWithDescriptionAndAuxButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), 0, getPaddingBottom());
        View findViewById = findViewById(R.id.radio_container);
        findViewById.setPaddingRelative(findViewById.getPaddingStart(), findViewById.getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.f39560_resource_name_obfuscated_res_0x7f0806e7), findViewById.getPaddingBottom());
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final void i() {
        super.i();
        this.m = (ImageButton) findViewById(R.id.expand_arrow);
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription, android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m.setEnabled(z);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setLabeledBy(this.m);
    }

    public final void j(RG2 rg2) {
        this.l = rg2;
        this.m.setOnClickListener(new View.OnClickListener() { // from class: QG2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton = RadioButtonWithDescriptionAndAuxButton.this;
                radioButtonWithDescriptionAndAuxButton.l.e(radioButtonWithDescriptionAndAuxButton.getId());
            }
        });
    }
}
