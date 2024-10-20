package org.chromium.chrome.browser.contextmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.android.chrome.R;
import defpackage.L60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextMenuListView extends ListView {
    public final boolean a;

    public ContextMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = L60.a();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f29950_resource_name_obfuscated_res_0x7f080144);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f29930_resource_name_obfuscated_res_0x7f080142);
        View view = (View) getParent();
        int paddingLeft = view.getPaddingLeft();
        int min = Math.min(dimensionPixelSize, view.getMeasuredWidth());
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a ? min - (paddingLeft * 2) : Math.min(min, i3 - (dimensionPixelSize2 * 2)) - (paddingLeft * 2), 1073741824), i2);
    }
}
