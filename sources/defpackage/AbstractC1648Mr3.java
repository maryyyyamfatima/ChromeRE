package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1648Mr3 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "NOT_SET";
        }
        if (i == 2) {
            return "DISABLED";
        }
        if (i == 3) {
            return "STANDARD";
        }
        if (i == 4) {
            return "CONFIDENTIAL";
        }
        throw null;
    }

    public static /* synthetic */ int b(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NOT_SET")) {
            return 1;
        }
        if (str.equals("DISABLED")) {
            return 2;
        }
        if (str.equals("STANDARD")) {
            return 3;
        }
        if (str.equals("CONFIDENTIAL")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.libraries.surveys.SurveyMetadata.PiiCollectionMode.".concat(str));
    }
}
