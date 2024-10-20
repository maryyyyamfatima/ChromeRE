package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2055Pv0 {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }
}
