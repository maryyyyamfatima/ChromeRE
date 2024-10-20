package org.chromium.chrome.browser.history_clusters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.S23;
import defpackage.Y50;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class HistoryClustersItemView extends S23 {
    @Override // defpackage.U23
    public final void j() {
    }

    public HistoryClustersItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.u.setVisibility(0);
        this.u.setImageResource(R.drawable.f45040_resource_name_obfuscated_res_0x7f0900c7);
        this.u.setContentDescription(getContext().getString(R.string.f84470_resource_name_obfuscated_res_0x7f140953));
        this.u.setImageTintList(Y50.b(getContext(), R.color.f17860_resource_name_obfuscated_res_0x7f07012a));
        this.u.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.u.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.f42830_resource_name_obfuscated_res_0x7f080839), getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.f42830_resource_name_obfuscated_res_0x7f080839), getPaddingBottom());
    }
}
