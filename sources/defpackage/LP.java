package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LP implements InterfaceC2872Wc2 {
    public final /* synthetic */ NP a;

    @Override // defpackage.InterfaceC2872Wc2
    public final void c(Exception exc) {
        this.a.getClass();
        int i = 0;
        EI2.h(0, 3, "Android.ChromeStartupDelegate.Result");
        String obj = exc.toString();
        if (obj.contains("statusCode=SERVICE_MISSING")) {
            i = 1;
        } else if (obj.contains("statusCode=SERVICE_VERSION_UPDATE_REQUIRED")) {
            i = 2;
        } else if (obj.contains("statusCode=SERVICE_DISABLED")) {
            i = 3;
        } else if (obj.contains("statusCode=NETWORK_ERROR")) {
            i = 4;
        } else if (obj.contains("statusCode=SERVICE_INVALID")) {
            i = 5;
        } else if (obj.contains("statusCode=DEVELOPER_ERROR")) {
            i = 6;
        } else if (obj.contains("statusCode=API_UNAVAILABLE")) {
            i = 7;
        }
        EI2.h(i, 8, "Android.ChromeStartupDelegate.FailureReason");
    }

    public LP(NP np) {
        this.a = np;
    }
}
