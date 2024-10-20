package defpackage;

import android.graphics.RectF;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KN0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        int compare = Float.compare(rectF.top, rectF2.top);
        return compare != 0 ? compare : Float.compare(rectF.left, rectF2.left);
    }
}
