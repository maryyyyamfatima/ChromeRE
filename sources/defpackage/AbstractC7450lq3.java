package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lq3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7450lq3 {
    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "PLATFORM_UNKNOWN";
        }
        if (i == 2) {
            return "PLATFORM_WEB";
        }
        if (i == 3) {
            return "PLATFORM_ANDROID";
        }
        if (i == 4) {
            return "PLATFORM_IOS";
        }
        if (i == 5) {
            return "UNRECOGNIZED";
        }
        throw null;
    }

    public static final int a(int i) {
        if (i == 5) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return b(i);
    }
}
