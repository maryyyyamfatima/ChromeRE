package org.chromium.components.browser_ui.settings;

import android.R;
import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.d;
import defpackage.C1812Ny2;
import defpackage.C9132qk3;
import defpackage.C9817sk3;
import defpackage.Y50;
import org.chromium.ui.widget.CheckableImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ExpandablePreferenceGroup extends d {
    public boolean c0;
    public AnimatedStateListDrawable d0;

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        AnimatedStateListDrawable animatedStateListDrawable = this.d0;
        Context context = this.a;
        if (animatedStateListDrawable == null) {
            C9817sk3 c9817sk3 = new C9817sk3(context);
            C9132qk3 a = c9817sk3.a(new int[]{R.attr.state_checked}, com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f090200);
            C9132qk3 a2 = c9817sk3.a(new int[0], com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f090201);
            c9817sk3.b(a, a2, com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0904d8);
            c9817sk3.b(a2, a, com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0904d9);
            AnimatedStateListDrawable c = c9817sk3.c();
            c.setTintList(Y50.b(context, com.android.chrome.R.color.0_resource_name_obfuscated_res_0x7f07012b));
            this.d0 = c;
        }
        CheckableImageView checkableImageView = (CheckableImageView) c1812Ny2.v(com.android.chrome.R.id.checkable_image_view);
        checkableImageView.setImageDrawable(this.d0);
        checkableImageView.setChecked(this.c0);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.m);
        sb.append(context.getResources().getString(this.c0 ? com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140134 : com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140127));
        String sb2 = sb.toString();
        View view = c1812Ny2.a;
        view.setContentDescription(sb2);
        if (view.isAccessibilityFocused()) {
            view.sendAccessibilityEvent(4);
        }
    }

    public ExpandablePreferenceGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f0503b0);
        this.c0 = true;
        this.L = com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0082;
    }
}
