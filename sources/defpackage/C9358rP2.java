package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9358rP2 implements InterfaceC9016qP2 {
    @Override // defpackage.InterfaceC9016qP2
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            C11674y84 c11674y84 = new C11674y84();
            c11674y84.inflate(resources, xmlResourceParser, attributeSet, theme);
            return c11674y84;
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
