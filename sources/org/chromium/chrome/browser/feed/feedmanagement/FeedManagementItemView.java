package org.chromium.chrome.browser.feed.feedmanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedManagementItemView extends LinearLayout {
    public TextView a;
    public TextView g;

    public FeedManagementItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.feed_management_menu_item_text);
        this.g = (TextView) findViewById(R.id.feed_management_menu_item_description);
    }
}
