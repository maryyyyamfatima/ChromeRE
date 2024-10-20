package org.chromium.chrome.browser.feed.sort_ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedOptionsView extends LinearLayout {
    public LinearLayout a;

    public FeedOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LinearLayout) findViewById(R.id.chips_container);
    }
}
