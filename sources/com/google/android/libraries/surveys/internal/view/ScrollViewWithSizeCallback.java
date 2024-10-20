package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.ViewTreeObserverOnScrollChangedListenerC10432uY2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ScrollViewWithSizeCallback extends ScrollView {
    public ViewTreeObserverOnScrollChangedListenerC10432uY2 a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ViewTreeObserverOnScrollChangedListenerC10432uY2 viewTreeObserverOnScrollChangedListenerC10432uY2 = this.a;
        if (viewTreeObserverOnScrollChangedListenerC10432uY2 == null || i4 == i2) {
            return;
        }
        if (i2 == 0) {
            viewTreeObserverOnScrollChangedListenerC10432uY2.getClass();
        } else {
            viewTreeObserverOnScrollChangedListenerC10432uY2.a(i2);
        }
    }
}
