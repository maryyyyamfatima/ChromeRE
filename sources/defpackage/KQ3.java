package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KQ3 extends AbstractC3215Yt0 {
    public final Drawable.Callback g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return false;
    }

    public KQ3(Context context, Drawable.Callback callback) {
        super(context.getDrawable(R.drawable.f51810_resource_name_obfuscated_res_0x7f0903ee));
        this.g = callback;
        setCallback(callback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (!this.l) {
            this.h = i;
            this.i = i2;
            this.j = i3;
            this.k = i4;
            this.m = true;
        } else {
            this.m = false;
        }
        this.l = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.Callback getCallback() {
        return this.m ? super.getCallback() : this.g;
    }
}
