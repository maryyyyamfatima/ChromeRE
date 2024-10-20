package org.chromium.chrome.browser.accessibility_tab_switcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import defpackage.C10941w1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccessibilityTabModelListView extends ListView {
    public final C10941w1 a;
    public boolean g;

    public AccessibilityTabModelListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
        this.a = new C10941w1(getContext(), this);
    }

    @Override // android.widget.ListView, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setAdapter((ListAdapter) this.a);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
