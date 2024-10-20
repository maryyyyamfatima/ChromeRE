package org.chromium.chrome.browser.share.screenshot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class ScreenshotShareSheetView extends FrameLayout {
    public static final /* synthetic */ int a = 0;

    public ScreenshotShareSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(final Integer num, int i, final Callback callback) {
        findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: org.chromium.chrome.browser.share.screenshot.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ScreenshotShareSheetView.a;
                Callback.this.onResult(num);
            }
        });
    }
}
