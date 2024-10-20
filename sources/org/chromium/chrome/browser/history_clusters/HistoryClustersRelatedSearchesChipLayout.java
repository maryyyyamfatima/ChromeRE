package org.chromium.chrome.browser.history_clusters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.C7616mK1;
import defpackage.UK;
import defpackage.VK;
import org.chromium.base.Callback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryClustersRelatedSearchesChipLayout extends FrameLayout {
    public VK a;
    public final C7616mK1 g;
    public Callback h;

    public HistoryClustersRelatedSearchesChipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new C7616mK1();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        VK vk = new VK(getContext(), this.g);
        this.a = vk;
        vk.a.g(new UK(getResources().getDimensionPixelSize(R.dimen.f39680_resource_name_obfuscated_res_0x7f0806f3), getResources().getDimensionPixelSize(R.dimen.f39690_resource_name_obfuscated_res_0x7f0806f4)));
        addView(this.a.a);
    }
}
