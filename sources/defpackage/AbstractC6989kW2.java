package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kW2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6989kW2 {
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
            return 4;
        }
        if (i == 6) {
            return 5;
        }
        if (i == 7) {
            return 6;
        }
        if (i == 8) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        return i == 1 ? "SINGLE" : i == 2 ? "BOOLEAN_ARRAY" : i == 3 ? "DOUBLE_ARRAY" : i == 4 ? "INT_ARRAY" : i == 5 ? "LONG_ARRAY" : i == 6 ? "STRING_ARRAY" : i == 7 ? "NULL" : i == 8 ? "UNRECOGNIZED" : "null";
    }

    public static final int a(int i) {
        if (i == 8) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return b(i);
    }
}
