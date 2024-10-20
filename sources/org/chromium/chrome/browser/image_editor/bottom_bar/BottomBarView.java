package org.chromium.chrome.browser.image_editor.bottom_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.VR3;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.bottom_bar.BottomBarView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class BottomBarView extends FrameLayout {
    public static final /* synthetic */ int a = 0;

    public BottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(final VR3 vr3, int i, final Callback callback) {
        ((TextView) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: EB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = BottomBarView.a;
                Callback.this.onResult(vr3);
            }
        });
    }
}
