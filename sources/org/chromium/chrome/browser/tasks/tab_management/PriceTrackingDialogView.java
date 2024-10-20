package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.android.chrome.R;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PriceTrackingDialogView extends LinearLayout {
    public SwitchCompat a;
    public ChromeImageButton g;
    public ViewGroup h;
    public ViewGroup i;

    public PriceTrackingDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (SwitchCompat) findViewById(R.id.track_prices_switch);
        this.g = (ChromeImageButton) findViewById(R.id.price_alerts_arrow);
        this.h = (ViewGroup) findViewById(R.id.price_annotations_row_menu_id);
        this.i = (ViewGroup) findViewById(R.id.price_alerts_row_menu_id);
    }
}
