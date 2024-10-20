package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1800Nw0 {
    public static final String[] a = new String[0];

    public static void b(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static String[] a(EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        String[] strArr = a;
        if (i >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            return strArr2 != null ? strArr2 : strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return strArr;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : strArr;
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        CharSequence subSequence;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        if (i < 30) {
            int i2 = editorInfo.initialSelStart;
            int i3 = editorInfo.initialSelEnd;
            int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
            int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
            int length = charSequence.length();
            if (i4 < 0 || i5 > length) {
                d(editorInfo, null, 0, 0);
                return;
            }
            int i6 = editorInfo.inputType & 4095;
            if (i6 == 129 || i6 == 225 || i6 == 18) {
                d(editorInfo, null, 0, 0);
                return;
            }
            if (length <= 2048) {
                d(editorInfo, charSequence, i4, i5);
                return;
            }
            int i7 = i5 - i4;
            int i8 = i7 > 1024 ? 0 : i7;
            int i9 = 2048 - i8;
            int min = Math.min(charSequence.length() - i5, i9 - Math.min(i4, (int) (i9 * 0.8d)));
            int min2 = Math.min(i4, i9 - min);
            int i10 = i4 - min2;
            if (Character.isLowSurrogate(charSequence.charAt(i10))) {
                i10++;
                min2--;
            }
            if (Character.isHighSurrogate(charSequence.charAt((i5 + min) - 1))) {
                min--;
            }
            int i11 = min2 + i8 + min;
            if (i8 != i7) {
                subSequence = TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i5, min + i5));
            } else {
                subSequence = charSequence.subSequence(i10, i11 + i10);
            }
            int i12 = min2 + 0;
            d(editorInfo, subSequence, i12, i8 + i12);
            return;
        }
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
