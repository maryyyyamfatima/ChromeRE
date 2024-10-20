package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: of4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8417of4 extends ImageButton {
    public int a;

    public AbstractC8417of4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f7660_resource_name_obfuscated_res_0x7f05022b);
        this.a = getVisibility();
    }

    public final void c(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.a = i;
        }
    }
}
