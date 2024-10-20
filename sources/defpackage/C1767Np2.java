package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Np2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767Np2 extends View {
    public C1767Np2(int i, LinearLayout linearLayout) {
        super(linearLayout.getContext());
        Resources resources = linearLayout.getContext().getResources();
        setBackground(B91.a(getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.f31080_resource_name_obfuscated_res_0x7f0801c5));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f31590_resource_name_obfuscated_res_0x7f0801f9);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        linearLayout.addView(this, i, layoutParams);
    }
}
