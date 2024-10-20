package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.chromium.chrome.browser.download.DownloadBroadcastManager;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ss0 */
/* loaded from: classes.dex */
public abstract class AbstractC2430Ss0 {
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Notification b(android.content.Context r24, int r25, defpackage.C5403ft0 r26, int r27) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2430Ss0.b(android.content.Context, int, ft0, int):android.app.Notification");
    }

    public static void c(PO po, String str) {
        if (Build.VERSION.SDK_INT < 24) {
            K62 k62 = po.a;
            k62.getClass();
            k62.i = K62.c(str);
            return;
        }
        po.n(str);
    }

    public static Intent a(Context context, String str, C6161i50 c6161i50, OTRProfileID oTRProfileID) {
        ComponentName componentName = new ComponentName(context.getPackageName(), DownloadBroadcastManager.class.getName());
        Intent intent = new Intent(str);
        intent.setComponent(componentName);
        intent.putExtra("org.chromium.chrome.browser.download.DownloadContentId_Id", c6161i50 != null ? c6161i50.b : "");
        intent.putExtra("org.chromium.chrome.browser.download.DownloadContentId_Namespace", c6161i50 != null ? c6161i50.a : "");
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        intent.putExtra("org.chromium.chrome.browser.download.IS_OFF_THE_RECORD", oTRProfileID != null);
        intent.putExtra("org.chromium.chrome.browser.download.OTR_PROFILE_ID", OTRProfileID.serialize(oTRProfileID));
        return intent;
    }
}
