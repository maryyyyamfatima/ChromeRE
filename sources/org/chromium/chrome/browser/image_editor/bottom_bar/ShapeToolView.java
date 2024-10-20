package org.chromium.chrome.browser.image_editor.bottom_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.bottom_bar.ShapeToolView;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class ShapeToolView extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public int a;

    public ShapeToolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }

    public final void b(final Integer num, int i, final Callback callback) {
        ((ChromeImageButton) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: v63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ShapeToolView.g;
                Callback.this.onResult(num);
            }
        });
    }

    public final ChromeImageButton a(int i) {
        ChromeImageButton chromeImageButton = (ChromeImageButton) findViewById(R.id.oval);
        if (i == 1) {
            return (ChromeImageButton) findViewById(R.id.rectangle);
        }
        if (i == 2) {
            return chromeImageButton;
        }
        if (i == 3) {
            return (ChromeImageButton) findViewById(R.id.arrow);
        }
        Log.e("image_editor.bottom_bar.ShapeToolView", "Invalid shape tool clicked");
        return chromeImageButton;
    }
}
