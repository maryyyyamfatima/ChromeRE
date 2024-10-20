package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1277Jv1 {
    public static /* synthetic */ String a(int i) {
        if (i == 1 || i == 2) {
            return "Opening url";
        }
        if (i == 3) {
            return "Opening pop-up for url";
        }
        if (i == 4) {
            return "Auto-completing data for field";
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "OPEN_URL_SUCCESS";
        }
        if (i == 2) {
            return "OPEN_URL_FAILURE";
        }
        if (i == 3) {
            return "OPEN_POPUP_URL_SUCCESS";
        }
        if (i == 4) {
            return "AUTOFILL_SELECTED";
        }
        throw null;
    }
}
