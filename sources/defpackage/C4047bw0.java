package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4047bw0 extends FrameLayout {
    public final C8170nw a;
    public final View g;

    public C4047bw0(Context context) {
        super(context, null);
        C8170nw c8170nw = new C8170nw(context, R.layout.f59190_resource_name_obfuscated_res_0x7f0e01ca);
        this.a = c8170nw;
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = -1;
        generateDefaultLayoutParams.height = -2;
        addView(c8170nw, generateDefaultLayoutParams);
        View view = new View(context, null, 0, R.style.f96400_resource_name_obfuscated_res_0x7f1501cf);
        this.g = view;
        FrameLayout.LayoutParams generateDefaultLayoutParams2 = generateDefaultLayoutParams();
        generateDefaultLayoutParams2.gravity = 80;
        generateDefaultLayoutParams2.width = -1;
        generateDefaultLayoutParams2.height = getResources().getDimensionPixelSize(R.dimen.f31080_resource_name_obfuscated_res_0x7f0801c5);
        addView(view, generateDefaultLayoutParams2);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        this.a.setSelected(z);
    }
}
