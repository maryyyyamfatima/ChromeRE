package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NA1 extends AbstractC5663gf0 {
    public final TextView i;

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
    }

    @Override // defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
        Drawable drawable = (Drawable) obj;
        TextView textView = this.i;
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.f34670_resource_name_obfuscated_res_0x7f0803ab);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public NA1(TextView textView) {
        this.i = textView;
    }
}
