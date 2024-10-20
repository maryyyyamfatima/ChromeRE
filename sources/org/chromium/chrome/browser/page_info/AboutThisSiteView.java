package org.chromium.chrome.browser.page_info;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AboutThisSiteView extends LinearLayout implements View.OnClickListener {
    public TextView a;
    public TextView g;
    public Runnable h;

    public AboutThisSiteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.description_text);
        TextView textView = (TextView) findViewById(R.id.source_link);
        this.g = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        if (view != this.g || (runnable = this.h) == null) {
            return;
        }
        runnable.run();
    }
}
