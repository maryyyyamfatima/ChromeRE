package org.chromium.components.browser_ui.widget.text;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStructure;
import defpackage.C1325Kf;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AlertDialogEditText extends C1325Kf {
    public AlertDialogEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        int inputType = getInputType() & 4095;
        if (!(inputType == 129 || inputType == 225 || inputType == 18) || TextUtils.isEmpty(getHint())) {
            return;
        }
        setContentDescription(getHint());
    }

    @Override // android.view.View
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillStructure(viewStructure, i);
    }
}
