package org.chromium.chrome.browser.image_editor.top_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.top_bar.TopBarView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class TopBarView extends FrameLayout {
    public static final /* synthetic */ int a = 0;

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(final Integer num, int i, final Callback callback) {
        findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: pS3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = TopBarView.a;
                Callback.this.onResult(num);
            }
        });
    }
}
