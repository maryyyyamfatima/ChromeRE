package org.chromium.chrome.browser.content_creation.notes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LineLimitedTextView extends TextView {
    public boolean a;
    public Runnable g;

    public LineLimitedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / getLineHeight();
        setMaxLines(height);
        if (!this.a && getLayout().getLineCount() > height) {
            this.a = true;
            Runnable runnable = this.g;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }
}
