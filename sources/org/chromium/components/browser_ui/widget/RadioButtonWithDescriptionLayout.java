package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import defpackage.Ge4;
import defpackage.PG2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RadioButtonWithDescriptionLayout extends RadioGroup implements PG2 {
    public final ArrayList a;
    public RadioGroup.OnCheckedChangeListener g;

    public RadioButtonWithDescriptionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.widget.RadioGroup, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) getChildAt(i);
            radioButtonWithDescription.j = this;
            if (radioButtonWithDescription.getId() == -1) {
                radioButtonWithDescription.setId(View.generateViewId());
            }
            ArrayList arrayList = this.a;
            radioButtonWithDescription.k = arrayList;
            arrayList.add(radioButtonWithDescription);
        }
    }

    @Override // android.widget.RadioGroup
    public final void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.g = onCheckedChangeListener;
    }

    @Override // defpackage.PG2
    public final void a(RadioButtonWithDescription radioButtonWithDescription) {
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.g;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, radioButtonWithDescription.getId());
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            Ge4.g(getChildAt(i), z);
        }
    }
}
