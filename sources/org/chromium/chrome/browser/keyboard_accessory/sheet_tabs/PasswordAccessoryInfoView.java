package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordAccessoryInfoView extends LinearLayout {
    public TextView a;
    public ImageView g;
    public ChipView h;
    public ChipView i;

    public PasswordAccessoryInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.password_info_title);
        this.g = (ImageView) findViewById(R.id.favicon);
        this.h = (ChipView) findViewById(R.id.suggestion_text);
        this.i = (ChipView) findViewById(R.id.password_text);
    }
}
