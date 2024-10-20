package org.chromium.chrome.browser.bookmarks;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.C7616mK1;
import defpackage.UK;
import defpackage.VK;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PowerBookmarkTagChipList extends FrameLayout {
    public VK a;
    public final C7616mK1 g;

    public PowerBookmarkTagChipList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new C7616mK1();
        new HashMap();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        VK vk = new VK(getContext(), this.g);
        this.a = vk;
        vk.a.g(new UK(getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014c), getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08014d)));
        addView(this.a.a);
    }
}
