package org.chromium.chrome.features.tasks;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
class SingleTabView extends LinearLayout {
    public ImageView a;
    public TextView g;

    public SingleTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.tab_favicon_view);
        this.g = (TextView) findViewById(R.id.tab_title_view);
    }
}
