package org.chromium.chrome.browser.ntp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecentTabsExpandableListView extends ExpandableListView {
    public int a;
    public int g;
    public int h;

    public RecentTabsExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = Math.round(getResources().getDisplayMetrics().density * 550.0f);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!DeviceFormFactor.a(getContext())) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i) - this.a;
        int i3 = size > 0 ? (size / 2) + 0 : 0;
        setPadding(i3, 0, i3, 0);
        super.onMeasure(i, i2);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSelectionFromTop(this.g, this.h);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.g = getFirstVisiblePosition();
        View childAt = getChildAt(0);
        this.h = childAt != null ? childAt.getTop() : 0;
        super.onDetachedFromWindow();
    }
}
