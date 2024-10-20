package defpackage;

import android.graphics.RectF;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MN0 implements Comparable {
    public float a;
    public float g;
    public final /* synthetic */ NN0 h;

    public final RectF a() {
        NN0 nn0 = this.h;
        nn0.getClass();
        RectF rectF = new RectF(LocalizationUtils.isLayoutRtl() ? 0 : nn0.getWidth() - nn0.m, this.a, r1 + nn0.m, this.g);
        rectF.inset(2.0f, 0.5f);
        rectF.offset(LocalizationUtils.isLayoutRtl() ? -0.5f : 0.5f, 0.0f);
        return rectF;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        MN0 mn0 = (MN0) obj;
        return Float.compare((this.a + this.g) * 0.5f, (mn0.a + mn0.g) * 0.5f);
    }

    public MN0(NN0 nn0, float f, float f2) {
        this.h = nn0;
        this.a = f;
        this.g = f2;
    }
}
