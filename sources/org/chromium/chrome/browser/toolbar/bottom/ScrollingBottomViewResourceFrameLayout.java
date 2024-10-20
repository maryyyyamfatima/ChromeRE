package org.chromium.chrome.browser.toolbar.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.QY2;
import defpackage.ViewOnLayoutChangeListenerC10125te4;
import org.chromium.components.browser_ui.widget.ViewResourceFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ScrollingBottomViewResourceFrameLayout extends ViewResourceFrameLayout {
    public final Rect i;
    public final int j;

    public ScrollingBottomViewResourceFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.j = getResources().getDimensionPixelOffset(R.dimen.f42390_resource_name_obfuscated_res_0x7f08080c);
    }

    @Override // org.chromium.components.browser_ui.widget.ViewResourceFrameLayout
    public final ViewOnLayoutChangeListenerC10125te4 c() {
        return new QY2(this, this);
    }
}
