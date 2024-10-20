package org.chromium.chrome.browser.multiwindow;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CloseConfirmationDialogView extends LinearLayout {
    public CloseConfirmationDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Resources resources = getResources();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.f29750_resource_name_obfuscated_res_0x7f080130) * 2)), 1073741824), i2);
    }
}
