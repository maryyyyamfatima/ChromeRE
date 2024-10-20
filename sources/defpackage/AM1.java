package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AM1 {
    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = Y50.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : b;
    }

    public static ColorStateList a(Context context, IN3 in3, int i) {
        int i2;
        ColorStateList b;
        return (!in3.l(i) || (i2 = in3.i(i, 0)) == 0 || (b = Y50.b(context, i2)) == null) ? in3.b(i) : b;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = AbstractC2884Wf.a(context, resourceId)) == null) ? typedArray.getDrawable(i) : a;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
