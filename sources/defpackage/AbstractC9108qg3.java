package defpackage;

import android.text.SpannableString;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9108qg3 {
    public static SpannableString a(String str, C8765pg3... c8765pg3Arr) {
        Object[] objArr;
        c(str, c8765pg3Arr);
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        for (C8765pg3 c8765pg3 : c8765pg3Arr) {
            d(c8765pg3, str, i);
            sb.append((CharSequence) str, i, c8765pg3.i);
            int length = c8765pg3.a.length() + c8765pg3.i;
            c8765pg3.i = sb.length();
            sb.append((CharSequence) str, length, c8765pg3.j);
            i = c8765pg3.j + c8765pg3.g.length();
            c8765pg3.j = sb.length();
        }
        sb.append((CharSequence) str, i, str.length());
        SpannableString spannableString = new SpannableString(sb);
        for (C8765pg3 c8765pg32 : c8765pg3Arr) {
            if (c8765pg32.i != -1 && (objArr = c8765pg32.h) != null && objArr.length != 0) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        spannableString.setSpan(obj, c8765pg32.i, c8765pg32.j, 0);
                    }
                }
            }
        }
        return spannableString;
    }

    public static void c(String str, C8765pg3... c8765pg3Arr) {
        for (C8765pg3 c8765pg3 : c8765pg3Arr) {
            int indexOf = str.indexOf(c8765pg3.a);
            c8765pg3.i = indexOf;
            c8765pg3.j = str.indexOf(c8765pg3.g, c8765pg3.a.length() + indexOf);
        }
        Arrays.sort(c8765pg3Arr);
    }

    public static void d(C8765pg3 c8765pg3, String str, int i) {
        int i2 = c8765pg3.i;
        if (i2 == -1 || c8765pg3.j == -1 || i2 < i) {
            c8765pg3.i = -1;
            throw new IllegalArgumentException(String.format("Input string is missing tags %s%s: %s", c8765pg3.a, c8765pg3.g, str));
        }
    }

    public static String b(String str, C8765pg3... c8765pg3Arr) {
        c(str, c8765pg3Arr);
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        for (C8765pg3 c8765pg3 : c8765pg3Arr) {
            d(c8765pg3, str, i);
            sb.append((CharSequence) str, i, c8765pg3.i);
            i = c8765pg3.j + c8765pg3.g.length();
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
