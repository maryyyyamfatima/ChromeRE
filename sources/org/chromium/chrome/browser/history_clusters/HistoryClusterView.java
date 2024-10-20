package org.chromium.chrome.browser.history_clusters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.S23;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryClusterView extends S23 {
    public View F;
    public int G;

    @Override // defpackage.U23
    public final void j() {
    }

    public HistoryClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View view = new View(getContext(), null, 0, R.style.f96400_resource_name_obfuscated_res_0x7f1501cf);
        this.F = view;
        view.setVisibility(8);
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.gravity = 80;
        generateDefaultLayoutParams.width = -1;
        generateDefaultLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.f31080_resource_name_obfuscated_res_0x7f0801c5);
        addView(this.F, generateDefaultLayoutParams);
        this.u.setVisibility(8);
        this.u.setImportantForAccessibility(2);
        setAccessibilityDelegate(new a(this));
    }

    @Override // defpackage.S23
    public final ColorStateList p() {
        return ColorStateList.valueOf(AbstractC10957w33.g(R.attr.f5170_resource_name_obfuscated_res_0x7f050132, getContext()));
    }
}
