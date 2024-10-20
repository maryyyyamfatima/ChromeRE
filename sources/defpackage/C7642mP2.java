package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7642mP2 implements InterfaceC9016qP2 {
    @Override // defpackage.InterfaceC9016qP2
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return C2214Rb.e(context, theme, context.getResources(), attributeSet, xmlResourceParser);
        } catch (Exception e) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
            return null;
        }
    }
}
