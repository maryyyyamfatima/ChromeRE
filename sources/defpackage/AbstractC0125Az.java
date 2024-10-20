package defpackage;

import com.google.android.libraries.elements.interfaces.ContentMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Az, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0125Az {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContentMode.values().length];
        a = iArr;
        try {
            iArr[ContentMode.CONTENT_MODE_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ContentMode.CONTENT_MODE_SCALE_ASPECT_FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ContentMode.CONTENT_MODE_SCALE_ASPECT_FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ContentMode.CONTENT_MODE_SCALE_TO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ContentMode.CONTENT_MODE_UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
