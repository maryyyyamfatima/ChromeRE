package org.chromium.components.embedder_support.delegate;

import android.content.Context;
import defpackage.C12134zW;
import defpackage.C7432ln3;
import defpackage.KW;
import defpackage.V60;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ColorChooserAndroid {
    public final KW a;
    public final long b;

    public ColorChooserAndroid(long j, Context context, int i, ColorSuggestion[] colorSuggestionArr) {
        C12134zW c12134zW = new C12134zW(this);
        this.b = j;
        this.a = new KW(context, c12134zW, i, colorSuggestionArr);
    }

    public void closeColorChooser() {
        this.a.dismiss();
    }

    public static ColorChooserAndroid createColorChooserAndroid(long j, WindowAndroid windowAndroid, int i, ColorSuggestion[] colorSuggestionArr) {
        if (windowAndroid == null) {
            return null;
        }
        Context context = (Context) windowAndroid.j.get();
        if (V60.a(context) == null) {
            return null;
        }
        ColorChooserAndroid colorChooserAndroid = new ColorChooserAndroid(j, context, i, colorSuggestionArr);
        C7432ln3 c = C7432ln3.c();
        try {
            colorChooserAndroid.a.show();
            c.close();
            return colorChooserAndroid;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static ColorSuggestion[] createColorSuggestionArray(int i) {
        return new ColorSuggestion[i];
    }

    public static void addToColorSuggestionArray(ColorSuggestion[] colorSuggestionArr, int i, int i2, String str) {
        colorSuggestionArr[i] = new ColorSuggestion(i2, str);
    }
}
