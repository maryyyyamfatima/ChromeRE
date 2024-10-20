package defpackage;

import com.google.android.libraries.elements.interfaces.LoggingLevel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10831vi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoggingLevel.values().length];
        a = iArr;
        try {
            iArr[LoggingLevel.LOG_LEVEL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[LoggingLevel.LOG_LEVEL_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[LoggingLevel.LOG_LEVEL_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
