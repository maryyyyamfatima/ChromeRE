package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.C6674jc;
import defpackage.GP2;
import defpackage.S23;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SelectableTabGridView extends S23 {
    @Override // defpackage.S23, defpackage.U23
    public final void o(boolean z) {
    }

    public SelectableTabGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = GP2.a;
        Drawable drawable = resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0904ad, theme);
        ImageView imageView = (ImageView) c(R.id.action_button);
        if (imageView != null) {
            imageView.setBackground(new InsetDrawable(drawable, (int) getContext().getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080718)));
            removeView(this.r);
        } else {
            imageView = this.u;
            imageView.setVisibility(0);
            imageView.setBackground(new InsetDrawable(drawable, (int) getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080719), (int) getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08071a), (int) getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080719), (int) getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08071a)));
            this.s.setBackground(null);
        }
        imageView.getBackground().setLevel(getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0043));
        imageView.setImageDrawable(C6674jc.b(getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f0901d4));
    }

    @Override // defpackage.U23
    public final void j() {
        super.onClick(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isChecked());
    }
}
