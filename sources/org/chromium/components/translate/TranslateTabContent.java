package org.chromium.components.translate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TranslateTabContent extends FrameLayout {
    public TextView a;
    public ProgressBar g;

    public TranslateTabContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.translate_infobar_tab_text);
        this.g = (ProgressBar) findViewById(R.id.translate_infobar_tab_progressbar);
    }
}
