package org.chromium.chrome.browser.keyboard_accessory.sheet_component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.android.chrome.R;
import org.chromium.ui.base.LocalizationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccessorySheetView extends FrameLayout {
    public ViewPager a;
    public ImageView g;

    public AccessorySheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewPager) findViewById(R.id.keyboard_accessory_sheet);
        this.g = (ImageView) findViewById(R.id.accessory_sheet_shadow);
        this.a.setLayoutDirection(LocalizationUtils.isLayoutRtl() ? 1 : 0);
    }
}
