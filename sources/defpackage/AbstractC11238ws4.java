package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ws4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11238ws4 {
    public static /* synthetic */ String b(int i) {
        return i == 1 ? "UNDEFINED" : i == 2 ? "EXACTLY" : i == 3 ? "AT_MOST" : "null";
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i));
    }
}
