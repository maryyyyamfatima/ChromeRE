package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8673pP2 implements InterfaceC9016qP2 {
    @Override // defpackage.InterfaceC9016qP2
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute == null) {
            return null;
        }
        try {
            Drawable drawable = (Drawable) C8673pP2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            drawable.inflate(context.getResources(), xmlResourceParser, attributeSet, theme);
            return drawable;
        } catch (Exception e) {
            Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
            return null;
        }
    }
}
