package defpackage;

import android.content.Intent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class J72 extends AbstractC0819Gh3 {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.AbstractC0819Gh3
    public final void a(final Intent intent) {
        if (intent.hasExtra("notification_id") && intent.hasExtra("notification_info_origin")) {
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: I72
                @Override // java.lang.Runnable
                public final void run() {
                    J72.c(intent);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J72.c(android.content.Intent):void");
    }
}
