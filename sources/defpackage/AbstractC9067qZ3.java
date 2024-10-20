package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9067qZ3 {
    public static boolean g(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !g(str, xmlPullParser) ? f : typedArray.getFloat(i, f);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !g(str, xmlPullParser) ? i2 : typedArray.getInt(i, i2);
    }

    public static RZ b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        RZ rz;
        if (g(str, xmlPullParser)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new RZ(null, null, typedValue.data);
            }
            try {
                rz = RZ.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                rz = null;
            }
            if (rz != null) {
                return rz;
            }
        }
        return new RZ(null, null, 0);
    }

    public static String e(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (g(str, xmlResourceParser)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static String f(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static int a(int i, int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }
}
