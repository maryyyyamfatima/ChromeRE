package org.chromium.chrome.browser.feed.followmanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FollowManagementItemView extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public TextView a;
    public TextView g;
    public TextView h;
    public ImageView i;
    public CheckBox j;

    public FollowManagementItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.follow_management_item_text);
        this.g = (TextView) findViewById(R.id.follow_management_item_url);
        this.h = (TextView) findViewById(R.id.follow_management_item_status);
        this.i = (ImageView) findViewById(R.id.follow_management_favicon);
        this.j = (CheckBox) findViewById(R.id.follow_management_subscribed_checkbox);
    }
}
