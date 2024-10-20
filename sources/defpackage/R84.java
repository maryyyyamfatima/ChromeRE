package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class R84 extends C1325Kf {
    public boolean k;

    public R84(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public boolean bringPointIntoView(int i) {
        try {
            this.k = true;
            return super.bringPointIntoView(i);
        } finally {
            this.k = false;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (!this.k) {
            i2 = getScrollY();
        }
        super.scrollTo(i, i2);
    }
}
