package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7986nP2 implements InterfaceC9016qP2 {
    @Override // defpackage.InterfaceC9016qP2
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            C6674jc c6674jc = new C6674jc(context);
            c6674jc.inflate(resources, xmlResourceParser, attributeSet, theme);
            return c6674jc;
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
