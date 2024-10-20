package org.chromium.chrome.browser.image_editor.bottom_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.bottom_bar.LineToolView;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class LineToolView extends FrameLayout {
    public static final /* synthetic */ int a = 0;

    public LineToolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(final Integer num, int i, final Callback callback) {
        ((ChromeImageButton) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: IB1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = LineToolView.a;
                Callback.this.onResult(num);
            }
        });
    }
}
