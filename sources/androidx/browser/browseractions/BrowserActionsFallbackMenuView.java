package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int a;
    public final int g;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelOffset(R.dimen.f28670_resource_name_obfuscated_res_0x7f08009f);
        this.g = getResources().getDimensionPixelOffset(R.dimen.f28660_resource_name_obfuscated_res_0x7f08009e);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.a * 2), this.g), 1073741824), i2);
    }
}
