package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4703dr0 extends AbstractC1598Mh3 {
    public final C4372ct0 b = AbstractC4029bt0.a;
    public final Handler d = new Handler();
    public final RunnableC4017br0 e = new RunnableC4017br0(this);
    public final C2690Us0 c = AbstractC2560Ts0.a;

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // defpackage.AbstractC1598Mh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(android.content.Intent r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4703dr0.e(android.content.Intent, int, int):int");
    }

    public static C6161i50 h(Intent intent) {
        if (intent.hasExtra("org.chromium.chrome.browser.download.DownloadContentId_Id") && intent.hasExtra("org.chromium.chrome.browser.download.DownloadContentId_Namespace")) {
            return new C6161i50(AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.download.DownloadContentId_Namespace"), AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.download.DownloadContentId_Id"));
        }
        return null;
    }

    public static void i(Context context, Intent intent, long j, C6161i50 c6161i50) {
        String w = AbstractC2281Ro1.w(intent, "DownloadFilePath");
        boolean j2 = AbstractC2281Ro1.j(intent, "IsSupportedMimeType", false);
        AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.download.IS_OFF_THE_RECORD", false);
        if (DownloadUtils.b(intent)) {
            OTRProfileID a = OTRProfileID.a(AbstractC2281Ro1.u("org.chromium.chrome.browser.download.OTR_PROFILE_ID", intent.getExtras()));
            Uri uri = (Uri) AbstractC2281Ro1.s(intent, "android.intent.extra.ORIGINATING_URI");
            Uri uri2 = (Uri) AbstractC2281Ro1.s(intent, "android.intent.extra.REFERRER");
            DownloadManagerService.r(3, j, context, w, c6161i50.b, uri == null ? null : uri.toString(), uri2 == null ? null : uri2.toString(), null, a, j2);
        }
    }
}
